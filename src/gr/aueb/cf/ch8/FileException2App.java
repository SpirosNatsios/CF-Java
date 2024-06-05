package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileException2App {

    public static void main(String[] args) {
        int num = 0;

        try {
            num = getNum();
            System.out.println("Num: " + num);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (InputMismatchException e) {
            System.out.println("Error Reading");
        } catch (ArithmeticException e) {
            System.out.println("Negative Number") ;
        }
    }


    public static int getNum() throws FileNotFoundException {
        File fd = new File("C:/temp/file.txt");
        int num = 0;

        try (Scanner in = new Scanner(fd)) {

            if (!in.hasNext()) {
                throw new InputMismatchException();
            }

            num = in.nextInt();

            if (num < 0) {
                throw new ArithmeticException("Negative num");
            }


        } catch (FileNotFoundException | InputMismatchException | ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
        return num;
    }
}
