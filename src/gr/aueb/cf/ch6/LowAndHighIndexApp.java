package gr.aueb.cf.ch6;

public class LowAndHighIndexApp {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

       int[] lowHigh = getLowAndHighIndexOf(arr,key);
       traverse(lowHigh);

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {

        int count = 0;
        int low = 0;
        int high = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }
        for (int i = low + 1; i < arr.length; i++) {
            if (arr[i] != arr[low]) {
                break;
            } else {
                count++;
            }
        }

        high = count + low;

        return new int[] {low, high};
    }

    public static void traverse(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}

