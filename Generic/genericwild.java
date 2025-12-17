class genericwild<T> {

    public genericwild() {
        System.out.println("obj created");
    }
    
}
class jf{
    public static void main(String[] args) {
        
    
    genericwild<?> obj=new genericwild<>();
    genericwild<String> obj1=new genericwild<>();
    obj=obj1;
    }
}
