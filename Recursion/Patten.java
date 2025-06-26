public class Patten {
    @SuppressWarnings("UnnecessaryReturnStatement")
    static void Patt(int i,int j){
        if(i==j){
            System.out.println(i);
            Patt(1, j+1);
        }
        else if(j>5){
            return;
        }
        else if(i<j){
            System.out.print(i+" ");
            Patt(i+1,j);
        }
    }
    public static void main(String[] args) {
        Patt(1,1);
    } 
}
