// Write a method named toBinary that accepts an integer as a parameter and returns a string of that number's
// representation in binary. For example, the call of toBinary(42) should return "101010".

public class ToBinary {
    public static void main(String[] args) {

    }

    public static String toBinary(int n) {
        String binary = "";
        binary = n % 2 + binary;
        n /= 2;

        while (n != 0) {
            binary = n % 2 + binary;
            n /= 2;
        }
        return binary;
    }
}
