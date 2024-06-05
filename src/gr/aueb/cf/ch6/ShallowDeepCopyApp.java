package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ShallowDeepCopyApp {

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
//        int [][] gridCopyRef = copyReference(grid);
//        gridCopyRef[0][0] = 100;
//        traverse(grid);

//        int[][] gridShallowCopy = shallowCopy(grid);
//        gridCopyRef[0][0] = 200;
//        traverse(grid);

        int[][] gridDeepCopy = deepCopy(grid);
        gridDeepCopy[0][0] = 200;
        traverse(grid);
    }


    /**
     * returs (shallow copy) the reference of the
     * two-dim array
     * @param arr the input two-dim array
     * @return a reference, which essentialy is
     *          a shallow copy.
     */
    public static int[][] copyReference(int[][] arr){
        return arr;
    }

    public static int[][] shallowCopy(int[][] arr){
        return Arrays.copyOf(arr,arr.length);
    }

    public static int[][] deepCopy(int[][] arr){
        int[][] arrayToReturn = new int[arr.length][];

        for(int i = 0; i < arr.length; i++){
            arrayToReturn[1] = new int[arr[i].length];
//            for(int j = 0; j < arr[i].length; j++){
//            }
            arrayToReturn[i] = Arrays.copyOf(arr[i], arr[i].length);

        }

        return arrayToReturn;
    }

    public static void traverse(int[][] arr) {
        for (int[] row : arr) {
            for(int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
