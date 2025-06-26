public class Patten12 {
    @SuppressWarnings("UnnecessaryReturnStatement")
    static void Patt(int i,int j){
        if(i==j){
            System.out.println(i);
            Patt(5, j+1);
        }
        else if(j==6){
            return;
        }
        else if(i>j){
            System.out.print(i+" ");
            Patt(i-1,j);
        }
    }
    public static void main(String[] args) {
        Patt(5,1);
    } 
}
