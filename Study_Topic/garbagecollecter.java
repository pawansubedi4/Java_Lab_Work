class A1 {
    public A1() {
        System.out.println("object created");
    }
    public void jjp()
    {
        System.out.println("the pawan");
    }

    protected void finalize() {
        System.out.println("Object destroyed");
    }
}
public class garbagecollecter {
    public static void main(String[] args) {
        A1 obj1;  // first ma yeuta A type ko obj1 vanne object banayo
        obj1=new A1();
        obj1=new A1();
        obj1=new A1();  // obj1 vanna obj ko name ma 4 ota obj create vayo
        obj1=new A1();   // 4 ota obj chai create vayo tara yo last ko matrai refrenced xa aaru chai xaina
                       // latest lai refer garcha to obj1 la
        // obj1=null;
        System.gc(); // calling garbage collecter; aaba garbage collecter la mati ko 3 ota 
                     // unrefrenced obj lai destroy garcha
        obj1.jjp(); //  this cannot be called because garbage collecter delete that obj1 object
        System.out.println("hi");

    }
    
}
