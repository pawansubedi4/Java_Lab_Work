public class patten1byAmethod {
    // static int a=1;
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void patteni(int i){
        if(i==5){
            System.out.println(i);
            return;
        }else{
            System.out.println(i);
            pattenj(i,i);
        }
    }
    public static void pattenj(int j,int a){
        if(j==0){
            a++;
            patteni(a);
        }else{
            System.out.print(1);
            pattenj(j-1,a);
        }
    }
    // public static void pattenjA(int j){
    //     if(j==0){
    //         a++;
    //         patteni(a);
    //     }else{
    //         System.out.print(1);
    //         pattenjA(j-1);
    //     }
    // }

    public static void main(String[] args) {
        patteni(1);
    }
}
