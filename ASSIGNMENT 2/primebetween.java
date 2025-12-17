import java.util.Scanner;
class primebetween {
    public static void main(String[] args){
        Scanner  s=new Scanner(System.in);
        System.out.println("enter range :");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("the prime number are :");
        for (int i=a;i<b;i++){
            int count=0;
            for(int j=2;j<i/2;j++){
                if((i%j)==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.print(i+"\t");
            }

        }
    }
}
