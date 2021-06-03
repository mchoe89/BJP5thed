//Write a for loop that produces the following output:
//        1 4 9 16 25 36 49 64 81 100
// For added challenge, try to modify your code so that it does not need to use the * multiplication operator.

public class LoopSquares {
    public static void main(String[] args) {
        int s = 1;
        System.out.print(s + " ");

        for (int i = 1; i <=9; i++) {
            int n = 0;
            n += 2 * i + 1;
            s += n;
            System.out.print(s + " ");
        }
    }
}
