
package readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite {

    public static void main(String[] args) throws FileNotFoundException {
// Specify a filename directly
        File inFile = new File("G:\\som.txt");
        PrintWriter out;
        try (Scanner in = new Scanner(inFile)) {
            out = new PrintWriter("G:\\som.out.txt");
            int lineNumber = 1;
            // Read the input and write the output
            while (in.hasNextLine()) {
                String line = in.nextLine();
                out.println("/* " + lineNumber + " */ " + line);
                lineNumber++;
            }
        }
        out.close();
        System.out.println("Program terminated.");
    }
    
}
