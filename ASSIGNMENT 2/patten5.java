public class patten5 {
    public static void main(String[] args) {
        int n=6;
        for (int i=1;i<=5;i++){
            if (i>3){
                n++;
            }
            else{
                n--;
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
