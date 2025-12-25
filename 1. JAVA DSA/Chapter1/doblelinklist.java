class dnode {
    int data;
    dnode pnode;
    dnode nnode;
    dnode(int d,dnode p,dnode n){

        data=d;
        pnode=p;
        nnode=n;
    }
    
}
class dable{
    dnode head,tail;
    boolean checkempty12(){
        return head==null&&tail==null;
    }
    void AddToHead(int d){
        if(checkempty12()){
            head=tail=new dnode(d, null, null);
        }
        else{
            dnode tem=head;
            head=new dnode(d,null,head);
            tem.pnode=head;
            

        }
    }
    void AddToTail(int d){
        if(checkempty12()){
            head=tail=new dnode(d, null, null);
        }
        else{
            dnode tem=tail;
            tail=new dnode(d,tem,null);
            tem.nnode=tail;
        }

    }
    void printhai(){
        dnode tem2=head;
            if(checkempty12()){
                System.out.println("this linklist is null");
            }
            else{
                while(tem2 != null){
                    System.out.print(tem2.data+"<->");
                    tem2=tem2.nnode;
                }
                System.out.println("null");        
            } 
    }
    void revprint(){
        dnode tem2=tail;
        if(checkempty12()){
                System.out.println("this linklist is null");
            }
            else{
                while(tem2 != null){
                    System.out.print(tem2.data+"<->");
                    tem2=tem2.pnode;
                }
                System.out.println("null");        
            } 

    }
    void deletehead(){
        if(checkempty12()){
            System.out.println("this linklist is empty");
        }
        else if(head.nnode==null){
            head=tail=null;

        }
        else{
            head=head.nnode;
            head.pnode=null;
        }
    }
    void deletetail(){
        if(checkempty12()){
            System.out.println("this linklist is empty");
        }
        else if(head.nnode==null){
            head=tail=null;
        }
        else{
            tail=tail.pnode;
            tail.nnode=null;
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
            dnode tem=head;
            for(int i=1;i<pos;i++){
                if(tem==null){
                    break;
                }
                tem=tem.nnode;
            }
            if(tem==null){
                System.out.println("invalid option");
            }
            else if(tem==tail){
                deletetail();
            }
            else{
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
            dnode tem = head;
            for (int i = 1; i < pos-1; i++) {
                if (tem == null) {
                    System.out.println("Invalid position 2");
                    return;
                }
                tem = tem.nnode;
            }
            if (tem.nnode == null) {
                AddToTail(data);
            } 
            else {
                tem.nnode=tem.nnode.pnode = new dnode(data, tem,tem.nnode);
            }
        }
    }
}
@SuppressWarnings("unused")
class jpttry{
    public static void main(String[] args) {
        dable obj=new dable();
        obj.AddToHead(12);
        obj.AddToHead(13);
        obj.AddToHead(14);
        obj.AddToHead(15);
        obj.printhai();
        dable obj1=new dable();
        obj1.AddToTail(30);
        obj1.AddToTail(31);
        obj1.AddToTail(32);
        obj1.AddToTail(33);
        obj.revprint();
        obj1.printhai();
        obj.printhai();
        obj.deletehead();
        obj.printhai();
        obj.deletetail();
        obj.printhai();
        obj.deleteany(7);
        obj.printhai();
        obj.addtoany(3,12);
        obj.addtoany(1,22);
        obj.addtoany(3, 89);
        obj.printhai();

    }
}
