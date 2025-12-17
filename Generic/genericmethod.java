public class genericmethod {
    <t,y> genericmethod(t x,y y){
        System.out.println(x);
        System.out.println(y);

    }
    public <T,Y> void print(T x,Y y){
        System.out.println(x);
        System.out.println(y);
    }
    public <t> void printarray(t[] arr){
        for (t ob:arr){
            System.out.println(ob);
        }
    }
    public <q> q getvalue(q[] ar,int i){
        return ar[i];
    }
    
}
class jk{
    public static void main(String[] args) {
        genericmethod obj=new genericmethod(1.2,"pawan");
        obj.print(1,2);
        obj.print(1.3,11.3);
        Integer[] i={1,2,3,4};
        String[] s={"sa","ra","ga"};
        obj.printarray(i);
        obj.printarray(s);
        System.out.println("the value is "+obj.getvalue(s, 1));
    }
}
