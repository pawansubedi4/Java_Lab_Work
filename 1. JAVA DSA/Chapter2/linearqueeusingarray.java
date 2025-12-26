class linearqueeusingarray {
    int front=-1,rear=-1;
    @SuppressWarnings("FieldMayBeFinal")
    private int maxsize;
    @SuppressWarnings("FieldMayBeFinal")
    private Integer[] arr;
    public linearqueeusingarray(int size) {
        maxsize=size;
        arr=new Integer[size];
    }
    private boolean checkempty(){
        return front==-1;
    }
    private boolean checkfull(){
        return rear==(maxsize-1);
    }
    void push(int dta){
        if (checkempty()){
            front++;
            rear++;
            arr[rear]=dta;
            System.out.println("add");
        }
        else if(checkfull()){
            System.out.println("this quee is full hai");
        }
        else{
            rear++;
            arr[rear]=dta;
            System.out.println("add");
        }
    }
    int pop(){
        if (checkempty()){
            System.out.println("this quee is null");
            return -1;
        }
        int pt=arr[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front++;
        }
        return pt;
    }
    void printall(){
        if (checkempty()){
            System.out.println("this is null");
        }
        else{
            int i=front;
            while(true){
                System.out.print(arr[i]+" ");
                if (i==rear){
                    break;
                }
                i++;
            }
        }
    }   
}
@SuppressWarnings("unused")
class demo2345{
    public static void main(String[] args) {
        linearqueeusingarray obj=new linearqueeusingarray(5);
        obj.push(12);
        obj.push(13);
        obj.push(14);
        obj.push(15);
        obj.push(16);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        obj.push(17);
        obj.push(18);
        obj.printall();
        
    }
}
