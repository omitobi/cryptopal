public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Convert hex to base64 without using any external package.
        String hex = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";


        // Learn
        // Convert base 10 to base 2
        // Conver base 2 to base 16 (or hex)
        // Base 16 (or hex) to base 2
        // Convert base 2 to Base 64
        // Convert base 64 to base 10

        int decimal = 400;
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
             int reminder = decimal/2;
             int modulo = decimal%2;
             binary.insert(0, modulo);
             decimal = reminder;
        }

        System.out.println(binary);

//        System.out.println(decimal + " sss " + reminder + " aaa" + modulo);
    }
}