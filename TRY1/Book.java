import java.util.Scanner;

class Cbook {
    String title, author;
    double price;

    Cbook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void Print1() {
        System.out.println("Title = " + title + "\nAuthor = " + author + "\nPrice = " + price);
    }

    void Copy(Cbook other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter how many books you want to create:");
        int n = sn.nextInt();
        sn.nextLine(); // consume the leftover newline

        Cbook[] obj = new Cbook[n];
        Cbook temp = new Cbook(null, null, 0);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter title, author, and price of book " + (i + 1));
            String t = sn.nextLine();
            String a = sn.nextLine();
            double p = Double.parseDouble(sn.nextLine());
            obj[i] = new Cbook(t, a, p);
        }

        // Find the book with the highest price using sorting (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (obj[j].price > obj[j + 1].price) {
                    temp.Copy(obj[j]);
                    obj[j].Copy(obj[j + 1]);
                    obj[j + 1].Copy(temp);
                }
            }
        }

        System.out.println("Book with highest price:");
        obj[n - 1].Print1(); // The last one has highest price
    }
}
