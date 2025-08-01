
import java.util.Scanner;

// 58) Create a base class complex with member variables real and imaginary. Also include the
// member method called display to print the value of complex number. Then create a child
// class complex1 with member variables real & imaginary and member method which adds
// its real with parent’s real and its imaginary with parent’s imaginary and returns the result
// as a complex type. Also include constructor that initializes it’s member variable values.
// Create an object of complex1 and call the add method on behalf of it to print the result.
public class complex {
    int real,imaginary;
    public void display(){
        System.out.println(real+"+"+imaginary+"i");
    }
}
class complex1 extends complex{
    int real,imaginary;
    public void add(){
        super.real=real+super.real;
        super.imaginary=imaginary+super.imaginary;
        display();
    }
    public void supervalu(int x,int y){
        super.real=x;
        super.imaginary=y;
    }

    complex1(int x,int y){
        real=x;
        imaginary=y;
    }
}
class jjp{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter real and imaginary partv of child class");
        int x=sn.nextInt();
        int y=sn.nextInt();
        complex1 obj=new complex1(x, y);
        System.out.println("enter real and imaginary partv of parent class");
        x=sn.nextInt();
        y=sn.nextInt();
        obj.supervalu(x, y);
        obj.add();
    }
}