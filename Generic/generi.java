public class generi<T> {
    T x ,y;
    public void put(T x1,T y1){
        x=x1;
        y=y1;
    }
    public void get(){
        System.out.println("X ="+x);
        System.out.println("Y = "+y);
    }
}
class jkp{
    public static void main(String[] args) {
        generi<Integer> obj=new generi<>();
        obj.get();
        obj.put(12,13);
        obj.get();
        generi<String> obj1=new generi<>();
        obj1.get();
        obj1.put("Pawan","hai");
        obj1.get();
    }
}
