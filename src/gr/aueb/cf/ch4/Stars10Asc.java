package gr.aueb.cf.ch4;

/**
 * Εκτυπωνει 10 γραμμες απο
 * αστερακια σε αυξουσα σειρα,
 * 1η σειρα -> 1 αστερακι,
 * 2η σειρα -> 2 αστεακκια,
 * κ.ο.κ
 */
public class Stars10Asc {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
