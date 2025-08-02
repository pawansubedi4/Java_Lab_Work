public class expctionhandeling {
    public static void main(String[] args) {
        try {
            int n=10/10;
        } catch (Exception e) {
            System.out.println("error aayo");
        }
        finally{
            System.out.println("error aaya pani naaaya pani chalcha");
        }
        System.out.println("expaction handel gara chalcha natra chaldaina");
        try {
            int n=10/0;
        } catch (Exception e) {
            System.out.println("error aayo");
        }
        finally{
            System.out.println("error aaya pani naaaya pani chalcha");
        }
        System.out.println("expaction handel gara chalcha natra chaldaina");
    }
}
