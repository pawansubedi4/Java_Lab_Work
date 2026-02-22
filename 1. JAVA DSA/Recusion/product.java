public class product {
    public static int product1(int a,int b) {
        if (b==1){
            return a;
        }
        return a+product1(a,b-1);    
    }
    public static void main(String[] args) {
        System.out.println(product1(54,3));
    }
}
