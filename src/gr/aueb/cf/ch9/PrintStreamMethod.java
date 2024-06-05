package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamMethod {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            PrintStream ps = new PrintStream("C/tmp/file6.txt");
            printMessage(ps, "Hello Coding Factory");
            printMessage(System.out, "Hello cf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Generic print method
     * @param ps the PrintStream
     * @param message the message to print.
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
