import java.util.LinkedList;
class stackwithlinkedlist {
    @SuppressWarnings("FieldMayBeFinal") // only to remove vs code problem not necessary to write
    private LinkedList<Integer> obj=new LinkedList<>();
    boolean checkempty(){
        return obj.isEmpty();
    }
    void push(int data){
        obj.addFirst(data);
        System.out.println(data+" added");
    }
    int getvalue1(){
        if(checkempty()){
            System.out.println("this stack is null");
            return 0;
        }
        else{
            return obj.getFirst();
        }
    }
    void pop(){
        if (checkempty()){
            System.out.println("under flow");
        }
        else{
            System.out.println(obj.getFirst()+" deleted");
            obj.removeFirst();
        }
    }
    void clear(){
        obj.clear();
        System.out.println("the stack is cleared");
    }
}
@SuppressWarnings("unused")// only to remove vs code problem not necessary to write
class demo23{
    public static void main(String[] args) {
        stackwithlinkedlist obj=new stackwithlinkedlist();
        obj.push(12);
        obj.push(13);
        System.out.println(obj.getvalue1());
        obj.pop();
        obj.pop();
        obj.pop();
        obj.push(14);
        obj.push(15);
        obj.pop();
        obj.clear();
        obj.push(12);
        System.out.println(obj.getvalue1());
    }
}
