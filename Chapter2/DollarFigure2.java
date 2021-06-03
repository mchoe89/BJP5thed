// Modify your DollarFigure program from the previous exercise to become a new program called DollarFigure2 that uses a
// global constant for the figure's height. (You may want to make loop tables first.) The previous output used a
// constant height of 7. The outputs below use a constant size of 3 (left) and 5 (right):
//
//        size 3
//    $$$******$$$
//    **$$****$$**
//    ****$**$****
//           size 5
//    $$$$$**********$$$$$
//    **$$$$********$$$$**
//    ****$$$******$$$****
//    ******$$****$$******
//    ********$**$********
// (You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.)

public class DollarFigure2 {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= SIZE + 1 - i; j++) {
                System.out.print("$");
            }
            for (int j = 1; j <= SIZE * 2 + 2 - 2 * i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= SIZE + 1 - i; j++) {
                System.out.print("$");
            }
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}