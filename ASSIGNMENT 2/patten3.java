public class patten3 {
    public static void main(String[] args) {
        int n=1;
        for(int i=1;i<=5;i++){
            int e=1;
            for(int j=1;j<=n;j++){
                System.out.print(j);
                e=j;
            }

            for(int k=e-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.print("\n");
            n++;

        }
    }
}
