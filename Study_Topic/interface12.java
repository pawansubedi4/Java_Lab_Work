interface  Box{
    int x=12;        //  public static final
    void area(int l,int b);    // 1. in interface method are always public and abstract
    void perimeter(int l,int b);

}
class rectangul implements Box{
    public void area(int l,int b){ // public raknai parcha kinake 1 mathi public vaya pach tal aaru huna mildaina
        System.out.println("the result is "+l*b);
    }
    public void perimeter(int l,int b){
        System.out.println("the result is "+(l+b)*2);
    } 
}
class square implements Box{
    public void area(int l,int b){ // public raknai parcha kinake 1 mathi public vaya pach tal aaru huna mildaina
        System.out.println("the result is "+l*b);
    }
    public void perimeter(int l,int b){
        System.out.println("the result is "+(l+b)*2);

    }  
}
public class interface12 {
    public static void main(String[] args) {
        rectangul obj1=new rectangul();
        square obj2=new square();
        obj1.area(2,3);
        obj2.area(2, 3);
        obj2.perimeter(2,3);
        
    }
}
