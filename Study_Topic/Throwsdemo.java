import java.io.IOException;

//It is used to declare an exception.
public class Throwsdemo {
    public static int div(int a, int b) throws ArithmeticException,IOException,NullPointerException
    {
        return a / b;
    }
    public static void main(String[] args) {
        try {
            System.out.println(div(2,0));
        } catch (ArithmeticException e) {
            System.out.println("error");
        }catch(IOException e)
        {
            
        }
       
        System.out.println("programming is good");
    }
}