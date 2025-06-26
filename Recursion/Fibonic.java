public class Fibonic{
    public static int fact(int c){
        if (c==1){
            return 0;
        }
        else if (c==2){
            return 1;
        }
        else{
            return fact(c-1)+fact(c-2);
        }

    }
    public static void main(String[] args) {
        System.out.println(fact(12));
    }
}