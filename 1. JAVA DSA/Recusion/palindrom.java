public class palindrom {
    public static int palindrom1(int n,int rev){
        if(n==0){
            return rev;
        }
        return palindrom1(n / 10, rev * 10 + n % 10);
    }
    public static void main(String[] args) {
        System.out.println(palindrom1(321,0));
    }
}
