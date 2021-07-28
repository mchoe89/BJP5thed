// Write a method named printFactors that accepts an integer as its parameter and uses a fencepost loop to print the
// factors of that number, separated by the word " and ".

public class PrintFactors {
    public static void main(String[] args) {
        printFactors(18);
    }

    public static void printFactors(int n) {
        System.out.print("1");
        for(int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" and " + i);
            }
        }
    }
}
