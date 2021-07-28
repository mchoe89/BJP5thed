//Write a method named showTwos that shows the factors of 2 in a given integer.

public class ShowTwos {
    public static void main(String[] args) {

    }

    public static void showTwos(int n) {
        System.out.print(n + " = ");

        while (n % 2 == 0) {
            System.out.print("2 * ");
            n /= 2;
        }

        System.out.println(n);
    }
}
