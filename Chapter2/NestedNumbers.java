//Write nested for loops that produce the following output:
//
//        000111222333444555666777888999
//        000111222333444555666777888999
//        000111222333444555666777888999

public class NestedNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.print(j - 1);
                }
            }
            System.out.println();
        }
    }
}
