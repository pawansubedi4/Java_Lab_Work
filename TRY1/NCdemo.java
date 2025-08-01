class Outer
{
    static int outer_x=1;
    static class Inner
    {
        int inner_x=2;
        void test()
        {
            System.out.println(inner_x);
            System.out.println(outer_x);
              
        }
    }
    static void display()
        {
            System.out.println(outer_x);
            Inner iobj= new Inner();
            iobj.test();
        }
}
public class NCdemo 
{
    public static void main(String args[])
    {
        // Outer o=new Outer();
        Outer.display();
    }
}