// It's common to print a rotating, increasing list of single-digit numbers at the start of a program's output as a
// visual guide to number the columns of the output to follow. With this in mind, write nested for loops to produce the
// following output, with each line 60 characters wide:
//             |         |         |         |         |         |
//    123456789012345678901234567890123456789012345678901234567890

public class NumbersOutput60 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i ++){
            for (int j = 1; j <= 9; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.print(j % 10);
            }
        }
    }
}
