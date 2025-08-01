public class SwitchFallThroughDemo {
    public static void main(String[] args) {
        int number = 2;

        System.out.println("Switch case fall-through demonstration:");
        switch (number) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default case");
        }
    }
}
