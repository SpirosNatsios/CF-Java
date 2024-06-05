package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntegerApp {

    public static void main(String[] args) {
        BigInteger myBigNum1 = new BigInteger("132456789132456798546542313213");
        BigInteger myBigNum2 = new BigInteger("1324567891324567985465");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("The result is: " + result);
        System.out.printf("The result is: %d", result);
    }
}
