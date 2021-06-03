// Modify your code from the previous problem to produce the following output:
//        99999888887777766666555554444433333222221111100000
//        99999888887777766666555554444433333222221111100000
//        99999888887777766666555554444433333222221111100000
//        99999888887777766666555554444433333222221111100000
//        99999888887777766666555554444433333222221111100000

public class NestedNumbers2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 10; j >= 1; j--) {
                for (int k = 1; k <= 5; k++) {
                    System.out.print(j - 1);
                }
            }
            System.out.println();
        }
    }
}
