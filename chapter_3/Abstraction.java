abstract class bank{
    int x=1;
    abstract  void checkbalance();
    public void rules(){
        System.out.println("bank need to follow folloing rule:");
    }
}
class glbl extends bank{
    int x=100000;
    void checkbalance(){
        System.out.println("your balance is "+x);
    }
    void withdraw(){
        System.out.println("your withdraw 500");
        this.x=x-500;
        System.out.println("your balance is "+x);
    } 
}
class nmb extends bank{
    int y=120000;
    void checkbalance(){
        System.out.println("your balance is "+y);
    }
    void add_balance(){
        System.out.println("your depositing 500");
        y=y+500;
        System.out.println("your balance is "+y);

    }

}
public class Abstraction {
    public static void main(String[] args) {
       glbl obj=new glbl();
       obj.checkbalance();
       obj.withdraw();
       bank obj1=new glbl();
       obj1.checkbalance();
    //    obj1.withdraw();    we cant do that
        nmb obj3=new nmb();
        obj3.checkbalance();
        obj3.add_balance();
    }
}
