class employee{
    public void getsalary(){
        System.out.println("your salary is 35000");
    }
}
class Pawan1 extends employee{
    public void getsalary(){
        System.out.println("your salary is 70000");
    }
}    



public class Methodoverriding1 {
    public static void main(String[] args) {
        employee obj=new Pawan1();
        employee obj1=new employee();
        obj.getsalary();
        obj1.getsalary();
    }
    
}
