
import java.util.Scanner;
class Rs_paisa{
    int rs,paisa;
    void print(){
        System.out.println("rupeese = "+rs+"\npaisa = "+paisa);
    }
}

public class Currency {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        Rs_paisa obj=new Rs_paisa();
        System.out.println("enter rupees and paisa:");
        obj.rs=sn.nextInt();
        obj.paisa=sn.nextInt();
        obj.rs=obj.rs+obj.paisa/100;
        obj.paisa=obj.paisa%100;
        obj.print();

    }
    
}
