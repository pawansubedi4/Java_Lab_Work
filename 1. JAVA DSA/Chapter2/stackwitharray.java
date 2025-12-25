class stackwitharray {
    @SuppressWarnings("FieldMayBeFinal")// only to remove vs code problem not necessary to write
    private int maxsize;
    private int pos=-1;
    @SuppressWarnings("FieldMayBeFinal")// only to remove vs code problem not necessary to write
    private Integer[] obj;

    public stackwitharray(int size) {
        maxsize=size;
        obj=new Integer[size];
    }
    void push(int dta){
        if (pos>=maxsize-1){
            System.out.println("overflow");
        }
        else{
            pos++;
            obj[pos]=dta;
            System.out.println(dta+" added");
        }
    }
    void pop(){
        if(pos==-1){
            System.out.println("underflow");
        }
        else{
            System.out.println(obj[pos]+" deleted");
            pos--;
        }  
    }
    int getvalue(){
        return obj[pos];
    }  
}
@SuppressWarnings("unused")// only to remove vs code problem not necessary to write
class demo123{
    public static void main(String[] args) {
        stackwitharray obj=new stackwitharray(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.getvalue());
        obj.push(5);
        obj.push(6);
        obj.pop();
        obj.pop();
        obj.pop();
        System.out.println(obj.getvalue());
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();


    }
}

