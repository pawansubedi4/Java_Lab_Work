public class hcf {
    public static int hcf(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return hcf(b,a%b);
        }
    }
    public static void main(String[] args) {
        System.out.println(hcf(25, 8));
    }
}
