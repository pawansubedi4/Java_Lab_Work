import java.util.Scanner;

class checkcase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        String input = scan.next();
        if (input.length() != 1) {
            System.out.println("Please enter exactly one character.");
        } else {
            char ch = input.charAt(0);
            if (Character.isUpperCase(ch)) {
                System.out.println("The character '" + ch + "' is uppercase.");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("The character '" + ch + "' is lowercase.");
            } else {
                System.out.println("The character '" + ch + "' is not an alphabetic letter.");
            }
        }
    

    }
}
