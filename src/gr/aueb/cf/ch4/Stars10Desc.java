package gr.aueb.cf.ch4;

/**
 * Εκυπτωνει 10 γραμμες
 * 1η γραμμη -> 10 αστερια
 * 2η γραμμη -> 9 αστερια
 * κοκ
 */
public class Stars10Desc {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
