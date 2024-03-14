public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String hex = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";

        new Main().decimalToBinary(hex);

        System.out.println("\n-------\nDONE");

        new Main().binaryToDecimal("110010000");

        System.out.println("\n-------\nDONE");

//        System.out.println(decimal + " sss " + reminder + " aaa" + modulo);
    }

    public void decimalToBinary(String hex) {
        // Convert hex to base64 without using any external package.
        // Learn
        // Convert base 10 to base 2
        // Conver base 2 to base 16 (or hex)
        // Base 16 (or hex) to base 2
        // Convert base 2 to Base 64
        // Convert base 64 to base 10

        System.out.println("Decimal to Binary");

        int decimal = 400;
        System.out.println("Decimal: " + decimal);
        int[] binary = new int[40];
        int index = 0;

        while (decimal > 0) {
            int reminder = decimal/2;
            int modulo = decimal%2;
            binary[index] = modulo;
            index++;
            decimal = reminder;
        }

        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public void binaryToDecimal(String binary) {
        // Convert binary to decimal without using any external package.

        System.out.println("Binary to Decimal");

        System.out.println("Binary: " + binary);
        int decimal = 0;

        // Get the binary
        // Index all the characters from the last to the first => 0..n = i
        // Where, 0 is the last index, and n is the first.
        // Take each character in the binary from the last => c
        // c * (2 power n) - character multiplied by (2 raised to power of index)
        // Sum the result of each together
        // And you have the decimal.

        int binaryLength = binary.length();
        int lastIndex = binaryLength - 1;
        for (int i = lastIndex; i >= 0; i--) {
            int bit = Integer.parseInt(String.valueOf(binary.charAt(i)));

            decimal += bit * Math.pow(2, (lastIndex - i));
//            System.out.printf("\n%s. %s * (2 ^ %s) = %s ", i, bit, lastIndex - i, decimal);
        }

        System.out.println("Decimal: " + decimal);
    }
}
