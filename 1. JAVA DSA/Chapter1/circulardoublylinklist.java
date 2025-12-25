class dcnode {
    int data;
    dcnode pnode;
    dcnode nnode;
    dcnode(int d,dcnode p,dcnode n){
        data=d;
        pnode=p;
        nnode=n;
    }
    
}
class dcable{
    dcnode head,tail;
    boolean checkempty12(){
        return head==null&&tail==null;
    }
    void AddToHead(int d){
        if(checkempty12()){
            dcnode tem=new dcnode(d, null, null);
            head=tail=tem;
            head.pnode=head.nnode=tem;
        }
        else{
        dcnode tem = new dcnode(d, tail, head);
        head.pnode =tail.nnode=tem; 
        head = tem;
        }
    }
    void AddToTail(int d){
        if(checkempty12()){
            dcnode tem=new dcnode(d, null, null);
            head=tail=tem;
            head.pnode=head.nnode=tem;
        }
        else{
            dcnode tem=tail;
            tail=new dcnode(d,tem,head);
            tem.nnode=tail;
            head.pnode=tail;
        }

    }
    void printhai(){
        dcnode tem2=head;
        if(checkempty12()){
            System.out.println("this linklist is null");
        }
        else{
            do{
                System.out.print(tem2.data+"<->");
                tem2=tem2.nnode;
            }while(tem2 != head);
            System.out.println("head");        
        }
    }
    void revprint(){
        dcnode tem2=tail;
        if(checkempty12()){
            System.out.println("this linklist is null");
        }
        else{
            do{
                System.out.print(tem2.data+"<->");
                tem2=tem2.pnode;
            }while(tem2 != tail);
            System.out.println("null");        
            } 

    }
    void deletehead(){
        if(checkempty12()){
            System.out.println("this linklist is empty");
        }
        else if(head.nnode==head){
            head=tail=null;
        }
        else{
            head=head.nnode;
            head.pnode=tail;
            tail.nnode=head;
        }
    }
    void deletetail(){
        if(checkempty12()){
            System.out.println("this linklist is empty");
        }
        else if(head.nnode==head){
            head=tail=null;
        }
        else{
            tail=tail.pnode;
            tail.nnode=head;
            head.pnode=tail;
        }
    }
    void deleteany(int pos){
        if (checkempty12()) {
            System.out.println("the link list is null");
        }
        else if (pos <= 0) {
            System.out.println("Invalid position");
        }
        else if (pos == 1) {
            deletehead();
        }
        else{
            dcnode tem = head;
            for (int i = 1; i < pos; i++) {
                tem = tem.nnode;
                if (tem == head) {
                    System.out.println("Invalid position 2");
                    return;
                }
            }
            if (tem.nnode == tail) {
                deletetail();
            } 
            else {
                tem.pnode.nnode=tem.nnode;
                tem.nnode.pnode=tem.pnode;
            }
        }
    }
    void addtoany(int pos,int data){
        if (pos <= 0) {
            System.out.println("Invalid position");
        }
        else if (pos == 1) {
            AddToHead(data);
        }
        else{
            dcnode tem = head;
            for (int i = 1; i < pos-1; i++) {
                tem = tem.nnode;
                if (tem == head) {
                    System.out.println("Invalid position 2");
                    return;
                }
            }
            if (tem.nnode == head) {
                AddToTail(data);
            } 
            else {
                tem.nnode=tem.nnode.pnode = new dcnode(data, tem,tem.nnode);
            }
        }
    }
}
@SuppressWarnings("unused")
class jpttry123{
    public static void main(String[] args) {
        dcable obj=new dcable();
        obj.AddToHead(12);
        obj.AddToHead(13);
        obj.AddToHead(14);
        obj.AddToHead(15);
        obj.printhai();
        dcable obj1=new dcable();
        obj1.AddToTail(30);
        obj1.AddToTail(31);
        obj1.AddToTail(32);
        obj1.AddToTail(33);
        obj1.revprint();
        obj1.printhai();
        obj.printhai();
        obj.deletehead();
        obj.printhai();
        obj.deletetail();
        obj.printhai();
        obj.deleteany(7);
        obj.deleteany(4);
        obj.deleteany(2);
        obj.deleteany(1);
        obj.printhai();
        obj.addtoany(3,12);
        obj.addtoany(1,22);
        obj.addtoany(5, 89);
        obj.addtoany(4, 89);
        obj.printhai();

    }
}

