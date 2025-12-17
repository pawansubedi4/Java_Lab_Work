interface jjp<T>{
    public void add(T x);

}
class genericinterface<t> implements jjp<t>{
    t value;

    public void add(t x){
        value=x;
        System.out.println("added successfully");
    }   
}
class jh{
    public static void main(String[] args) {
        genericinterface<Double> obj=new genericinterface<>();
        obj.add(2.0);
    }
}
