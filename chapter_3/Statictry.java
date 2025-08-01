public class Statictry {
    @SuppressWarnings("unused")
    int rn;
    String name;
    static String clg="SDC";
    Statictry(int r,String h){
        this.rn=r;
        this.name=h;
    }

    public Statictry(String name, int rn) {
        this.name = name;
        this.rn = rn;
    }
}
@SuppressWarnings("unused")
class Demo{
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        System.out.println(Statictry.clg);
        Statictry obj1=new Statictry(1,"ABC");
        Statictry obj2=new Statictry(2,"CDE");
        System.out.println(obj1.name);
        System.out.println(obj1.clg);
        obj1.clg="JPT";
        System.out.println(obj2.clg);
    }
}
