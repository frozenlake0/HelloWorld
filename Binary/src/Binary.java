import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = "";

        if (decimalNumber == 0) {
            binaryNumber = "0";
        } else {
            boolean isNegative = decimalNumber < 0;

            if (isNegative) {
                decimalNumber = -decimalNumber;
            }

            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryNumber = remainder + binaryNumber;
                decimalNumber /= 2;
            }

            if (isNegative) {
                // Apply two's complement for negative numbers
                binaryNumber = twosComplement(binaryNumber);
            }
        }

        System.out.println("Binary equivalent: " + binaryNumber);
    }

    private static String twosComplement(String binaryNumber) {
        // Invert all bits
        char[] chars = binaryNumber.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (chars[i] == '0') ? '1' : '0';
        }

        // Add 1
        int carry = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1' && carry == 1) {
                chars[i] = '0';
                carry = 1;
            } else if (chars[i] == '0' && carry == 1) {
                chars[i] = '1';
                carry = 0;
            } else {
                break;
            }
        }

        if (carry == 1) {
            // If there's still a carry, add a leading 1
            binaryNumber = "1" + binaryNumber;
        }

        return binaryNumber;
    }
}