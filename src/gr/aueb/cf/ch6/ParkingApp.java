package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Comparator;

public class ParkingApp {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1416}, {1317, 1417}, {1015, 1020},};

        checkParkingTime(arr);
    }

    public static void checkParkingTime(int[][] arr) {
        int[][] newArr = new int[arr.length * 2][2];
        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            newArr[2*i][0] = arr[i][0];
            newArr[2*i][1] = 0;
            newArr[2*i + 1][0] = arr[i][1];
            newArr[2*i + 1][1] = 1;
        }

        Arrays.sort(newArr, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i][1] == 0 ) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    continue;
                }
            }
            if (newArr[i][1] == 1) {
                count--;
            }
        }
        System.out.println(maxCount);
    }
}


