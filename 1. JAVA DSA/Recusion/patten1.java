public class patten1 {
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void patten(int a,int i){
        if(a>11111){
            return;
        }
        else{
            System.out.println(a+i);
            patten(a*10+1,i+1);
        }
    }
    public static void main(String[] args) {
        patten(1,0 );
    }
    
}
