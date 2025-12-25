class cqueearray {
    int front=-1,rear=-1;
    @SuppressWarnings("FieldMayBeFinal")// only to remove vs code problem not necessary to write
    private int maxsize;
    @SuppressWarnings("FieldMayBeFinal")// only to remove vs code problem not necessary to write
    private Integer[] arr;

    public cqueearray(int size) {
        maxsize=size;
        arr=new Integer[size];
    }
    private boolean checkempty(){
        return front==-1;
    }
    private boolean checkfull(){
        return front==0&&rear==(maxsize-1)||front-1==rear;
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
            rear=(rear+1)%maxsize;
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
            front=(front+1)%maxsize;
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
                i=(i+1)%maxsize;
            }
        }
    }   
}
@SuppressWarnings("unused")// only to remove vs code problem not necessary to write
class demo234{
    public static void main(String[] args) {
        cqueearray obj=new cqueearray(5);
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
