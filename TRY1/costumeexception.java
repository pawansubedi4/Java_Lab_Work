import java.util.Scanner;
class CustomException extends Exception {
    public String toString() {
        return "This is a custom error: Invalid phone number!";
    }
}
class PhoneNumber {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        try {
            System.out.print("Enter phone number: ");
            long number = sn.nextLong();
            if (number < 1000000000L || number > 9999999999L) {
                throw new CustomException();
            } else {
                System.out.println("Valid number");
            }
        } catch (CustomException e) {
            System.out.println(e);
        }
    }
}
