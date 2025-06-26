import java.util.Scanner;
class Cbook{
    String title,author;
    double price;
    Cbook(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void Print1(){
        System.out.println("Title="+title+"\nAuthor="+author+"\nPrice"+price);
    }
    void Copy(Cbook others){
        this.title=others.title;
        this.author=others.author;
        this.price=others.price;
    }
}
public class Book {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter how many obj do you want to create:");
        int n=sn.nextInt();
        sn.nextLine();
        Cbook[] obj=new Cbook[n];
        Cbook tem=new Cbook(null, null, 0);
        for (int i=0;i<n;i++){
            System.out.println("Enter title author and price respectively");
            String t=sn.nextLine();
            String a=sn.nextLine();
            double p = Double.parseDouble(sn.nextLine());
            obj[i]=new Cbook(t,a,p);
        }
        for (int i=0;i<(n-1);i++){
            if(obj[i].price>obj[i+1].price){
                tem.Copy(obj[i]);
                obj[i].Copy(obj[i+1]);
                obj[i+1].Copy(tem);
            }
        }
        System.out.println("the detail of costly book is :");
        obj[n-1].Print1();
    }
}
