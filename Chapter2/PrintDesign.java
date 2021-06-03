// Write a method called printDesign that produces the following output. Use nested for loops to capture the structure
// of the figure.
//        -----1-----
//        ----333----
//        ---55555---
//        --7777777--
//        -999999999-

public class PrintDesign {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(i * 2 - 1);
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
