package gr.aueb.cf.ch7;

public class ImmutableStrApp {

    public static void main(String[] args) {
        String s1 = "Alice";
        String s2 = "Alice";
        String s3 = new String("Alice");

        s2 = "Bod";
        s1 = "Athens";
    }
}
