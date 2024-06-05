package gr.aueb.cf.ch7;

/**
 * Demo of chatAt()
 */

public class TraverseStr {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Buisness";
        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
    }
}
