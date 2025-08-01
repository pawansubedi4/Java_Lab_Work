class demo{
    int x,y;
    void putvalue(int xr,int yr){
        x=xr;
        y=yr;
    }
    void pprint(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class Jpt {
    public static void main(String[] args) {
        demo obj=new demo();
        obj.putvalue(1,2);
        obj.pprint();

    }

}
