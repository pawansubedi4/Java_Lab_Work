import java.util.Scanner;
class Book
{
    String title, author;
    double price;
    Book(String title, String author, double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(Book[] detail) //static void display(Book[] detail)
    {
       Book costliest= detail[0];
        for (Book detail1 : detail) {
            if (detail1.price > costliest.price) {
                costliest = detail1;
            }
        }
       System.out.println("Costliest Book info:");
       System.out.println("Title: "+costliest.title);
       System.out.println("Author: "+costliest.author);
       System.out.println("Price: "+costliest.price);
     }
}
public class array_of_obj 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("How many book details d u l t e?");
        int n=s.nextInt();
        s.nextLine();
        Book[] detail=new Book[n];
        System.out.println("Enter book details:");
        for(int i=0;i<detail.length;i++)
        {
          System.out.println("Enter title of book "+(i+1));
          String t=s.nextLine();
          System.out.println("Enter author of book"+(i+1));
          String a=s.nextLine();
          System.out.println("Enter price of book"+(i+1));
          double p=Double.parseDouble(s.nextLine());
          detail[i]=new Book(t,a,p);
        }
        Book obj = new Book(" ", " ", 0);
        obj.display(detail);
    }
}