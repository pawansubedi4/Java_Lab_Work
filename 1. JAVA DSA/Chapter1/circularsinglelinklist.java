class node{
    int data;
    node nxt;
    node(int x){
        data=x;
        nxt=null;
    }
    node(int x,node n){
        data=x;
        nxt=n;
    }

}
class circularlinklist1{
    node head,tail;
    boolean checkempty12(){
        return head==null&&tail==null;
    }
    void AddToHead(int x){
        if (checkempty12()){
            head=tail=new node(x);
            head.nxt=head;
            System.out.println("addeded to 1st");
        }
        else{
            head=new node(x,head);
            tail.nxt=head;
            System.out.println("new addeded to head");
        }
    }
    void AddToTail(int x){
        if (checkempty12()){
            head=tail=new node(x);
            tail.nxt=head;
            System.out.println("addeded to last");
        }
        else{
            tail=tail.nxt=new node(x,head);
            System.out.println(" new addeded to last");
        }
    }
    void printhai(){
        node tem2=head;
            if(checkempty12()){
                System.out.println("this linklist is null");
            }
            else{
                do{
                    System.out.print(tem2.data+"->");
                    tem2=tem2.nxt;
                }while(tem2 != head);
                System.out.println("head");        
            } 
    }
    void delfirst(){
            if(checkempty12()){
                System.out.println("this linklist is null");
            }
            else if (head==tail){
                head=tail=null;
            }
            else{
                head=head.nxt;
                tail.nxt=head;
            }
    }
    void dellast(){
        if(checkempty12()){
            System.out.println("this linklist is null");
        }
        else if (head==tail){
            head=tail=null;
        }
        else{
            node tem=head;
            while(tem.nxt!=tail){
                tem=tem.nxt;
            }
            tail = tem;
            tail.nxt = head;
        }


    }
    void addtoanyl(int dta, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position");
        }
        else if (pos == 1) {
            AddToHead(dta);
        }
        else{
            node tem = head;
            for (int i = 1; i < pos-1; i++) {
                tem = tem.nxt;
                if (tem == head) {
                    System.out.println("Invalid position 2");
                    return;
                }
            }
            if (tem.nxt == head) {
                AddToTail(dta);
            } 
            else {
                tem.nxt = new node(dta, tem.nxt);
            }
        }
    }
    void delany(int pos) {
        if (checkempty12()) {
            System.out.println("the link list is null");
        }
        else if (pos <= 0) {
            System.out.println("Invalid position");
        }
        else if (pos == 1) {
            delfirst();
        }
        else{
            node tem = head;
            for (int i = 1; i < pos-1; i++) {
                tem = tem.nxt;
                if (tem == head) {
                    System.out.println("Invalid position 2");
                    return;
                }
            }
            if (tem.nxt == tail) {
                dellast();
            } 
            else {
                tem.nxt = tem.nxt.nxt;
            }
        }
    }
}

@SuppressWarnings("unused")
class hjhj{
    public static void main(String[] args) {
        circularlinklist1 obj=new circularlinklist1();
        obj.AddToHead(12);
        obj.AddToHead(22);
        obj.AddToHead(32);
        obj.AddToHead(42);
        obj.printhai();
        circularlinklist1 obj1=new circularlinklist1();
        obj1.AddToTail(10);
        obj1.AddToTail(13);
        obj1.AddToTail(16);
        obj1.delfirst();
        obj1.printhai();
        obj1.AddToTail(12);
        obj1.AddToTail(23);
        obj1.AddToTail(15);
        obj1.dellast();
        obj1.printhai();
        obj1.addtoanyl(56, 3);
        obj1.printhai();
        obj1.delany(6);
        obj1.printhai();
    }
}