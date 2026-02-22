public class printname {
    public static void printname1(int n,String name){
        if(n==0){
            return;
        }
        System.out.println(name);
        printname1(n-1, name);
    }
    public static void main(String[] args) {
        printname1(5,"pawan");
    }
}
