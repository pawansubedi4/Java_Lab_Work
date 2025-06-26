import java.util.Scanner;
class arrayprime {
    public static void main(String[] args){
        Scanner  s=new Scanner(System.in);
        int[] n;
        System.out.println("enter how many number do you want to enter:");
        int a=s.nextInt();
        n=new int[a];
        for (int i=0;i<a;i++){
            System.out.println("enter"+(i+1)+"number");
            n[i]=s.nextInt();
        }
        System.out.println("the prime number are :");
        for (int i=0;i<n.length;i++){
            int count=0;
            for(int j=2;j<n[i]/2;j++){
                if((n[i]%j)==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(n[i]);
            }

        }
    }
}
