/*PA_4 P_1 created by Taoufik Laaroussi
   Class : COP3330
   Prof: Dr. Hollander

   Problem description
   -------------------
 Create a separate class called Application that contains a main method which illustrates
 the use of DuplicateRemover by calling both the remove and write methods.
 Your input file must be called problem1.txt and your output file must be called unique_words.txt.
 You will not receive credit if you use different file names, as my graders will not modify
 your code to make it work with their test files.*/


import java.io.IOException;

public class Application{

    public static void main(String[] args) throws IOException {
        // create an instance of a DuplicateRemover
        DuplicateRemover countWords = new DuplicateRemover();
        // call the public methods in DuplicateRemover
        countWords.remove("problem1.txt");
        countWords.write(" unique_words.txt");

    }
}
