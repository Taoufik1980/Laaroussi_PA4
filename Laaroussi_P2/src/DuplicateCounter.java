/*PA_4 P_2 created by Taoufik Laaroussi
   Class : COP3330
   Prof: Dr. Hollander

   Problem description
   -------------------
  Create a utility class called DuplicateCounter. Create an instance method called count that
  takes a single parameter called dataFile (representing the path to a text file) and uses a Map
  of Strings to count how many times each word occurs in dataFile. The counts should be stored
  in an instance variable called wordCounter. Create an instance method called write that
  takes a single parameter called outputFile (representing the path to a text file)
  and writes the contents of wordCounter to the file pointed to by outputFile.
  The output file should be overwritten if it already exists, and created if it does not exist.*/



import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    //Create instance Variable wordCounter Map
    private Map<String, Integer> wordCounter;

    public void count(String dataFile) throws IOException {

        //Create Scanner and inputStream
        FileInputStream inFile = new FileInputStream(dataFile);
        Scanner fileInput = new Scanner(inFile);
        //Create instance Variable wordCounter Map
         wordCounter = new HashMap<>();
        //While Loop to iterate in the file using scanner
        while(fileInput.hasNext()){
           //Store the word inside a variable nextWord type String
           String nextWord =fileInput.next();
           //Check if nextWord already exist in the Map fileWords
            if(wordCounter.containsKey(nextWord)){
                // Increment the number of the existing word
                wordCounter.put(nextWord, wordCounter.get(nextWord)+1);
            }else {
                wordCounter.put(nextWord, 1);
            }
        }
        // Close open resources
        fileInput.close();
        inFile.close();
    }

    public void write(String outputFile) throws IOException {
        // Create a file
        File outFile = new File(outputFile);
        FileWriter flw = new FileWriter(outFile);
        PrintWriter outPut = new PrintWriter(flw);
        // a loop to output the element of the Map
        for (Map.Entry mapEntry : wordCounter.entrySet()) {
            if ((int)mapEntry.getValue() == 1) {
                outPut.printf("%-10s occurred %6d  time\n", mapEntry.getKey(), mapEntry.getValue());
            } else {
                outPut.printf("%-10s occurred %6d  times\n", mapEntry.getKey(), mapEntry.getValue());
            }
        }
        // Close open resources
        outPut.close();
        flw.close();
    }
}
