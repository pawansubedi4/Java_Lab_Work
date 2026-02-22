public class hcf {
    public static int hcf1(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return hcf1(b,a%b);
        }
    }
    public static void main(String[] args) {
        System.out.println(hcf1(25, 8));
    }
}
