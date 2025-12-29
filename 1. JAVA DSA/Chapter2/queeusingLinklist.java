import java.util.LinkedList;
class queeusingLinklist {
    @SuppressWarnings("FieldMayBeFinal")//only to remove vscode compiler problem
    private LinkedList<Integer> queue;
    public queeusingLinklist() {
        queue = new LinkedList<>();
    }
    
    public void enqueue(int data) {
        queue.addLast(data);
    }
    
    public int dequeue() {
        if (isEmpty1()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.removeFirst();
    } 
    public boolean isEmpty1() {
        return queue.isEmpty();
    }
    public void printfirst() {
        if (isEmpty1()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue.getFirst());
        }
    }
    public void clear() {
        queue.clear();
    }
}
@SuppressWarnings("unused")//to remove vscode compiler problem
class demo234432{
    public static void main(String[] args) {
        queeusingLinklist obj = new queeusingLinklist();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.printfirst(); 
        System.out.println(obj.dequeue());
        obj.printfirst();
        obj.clear();
    }
}