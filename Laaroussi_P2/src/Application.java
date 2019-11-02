
/*PA_4 P_2 created by Taoufik Laaroussi
   Class : COP3330
   Prof: Dr. Hollander

   Problem description
   -------------------
  Create a separate class called Application that contains a main method which illustrates
  the use of DuplicateCounter by calling both the remove and write methods.
  Your input file must be called problem2.txt and your output file must be called unique_word_counts.txt.
  You will not receive credit if you use different file names, as my graders will not modify your code
  to make it work with their test files.*/

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException, IOException {
        // Create an instance of a DuplicateCounter called duplicateCounter
        DuplicateCounter countWords = new DuplicateCounter();
        // Call the methods inside the duplicateCounter class
        countWords.count("problem2.txt");
        countWords.write("unique_word_counts.txt");
    }
}
