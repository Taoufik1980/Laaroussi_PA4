/*PA_4 P_1 created by Taoufik Laaroussi
   Class : COP3330
   Prof: Dr. Hollander

   Problem description
   -------------------
 Create a utility class called DuplicateRemover. Create an instance method called remove that takes a
 single parameter called dataFile (representing the path to a text file) and uses a Set of Strings
 to eliminate duplicate words from dataFile. The unique words should be stored in an instance variable
 called uniqueWords. Create an instance method called write that takes a single parameter called outputFile
 (representing the path to a text file) and writes the words contained in uniqueWords to the file pointed
 to by outputFile. The output file should be overwritten if it already exists, and created if it does not exist.*/


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

    private Set<String> uniqueWords;

public void remove(String dataFile) throws IOException {

    //Create Scanner and inputStream
    FileInputStream inFile = new FileInputStream(dataFile);
    Scanner fileInput = new Scanner(inFile);
    //Create instance Variable uniqueWords using Set interface
    uniqueWords = new HashSet<>();
    //While Loop to iterate in the file using scanner
    while(fileInput.hasNext()) {
        String nextWord = fileInput.next();
        uniqueWords.add(nextWord);
    }
    // Close open resources
    fileInput.close();
    inFile.close();
}

    public void write(String outputFile) throws IOException {
       // create the output file
        File outFile = new File(outputFile);
        FileWriter flw = new FileWriter(outFile);
        PrintWriter outPut = new PrintWriter(flw);
        // For loop to write the elements of the Set in the output file
        for(String i : uniqueWords){
            outPut.println(i);
        }
        // Close open resources
        outPut.close();
        flw.close();
    }

}
