class box{
    int data;
    box nxt;
    box(int x){
        data=x;
        nxt=null;
    }
    box(int x,box n){
        data=x;
        nxt=n;
    }
}
class Toconnect123{
    box head,tail;
    boolean checkempty12(){
        return head==null&&tail==null;
    }
    void AddToHead(int x){
        if (checkempty12()){
            head=tail=new box(x);
            System.out.println("addeded to 1st");
        }
        else{
            head=new box(x,head);
            System.out.println("new addeded to head");
        }
    }
    void AddToTail(int x){
        if (checkempty12()){
            head=tail=new box(x);
            System.out.println("addeded to last");
        }
        else{
            tail=tail.nxt=new box(x);
            System.out.println(" new addeded to last");
        }
    }
    void printbyhead(box tem){
        if (tem.nxt==null)
            System.out.println(tem.data);
        else{
            System.out.println(tem.data);
            printbyhead(tem.nxt);
        }
    }
    void printbytail(box tem){
        if (tem.nxt!=null){
            printbytail(tem.nxt);
            System.out.println(tem.data);
        }    
        else{
            System.out.println(tem.data);
        }

    }
    void printhai(){
        box tem2=head;
            if(checkempty12()){
                System.out.println("this linklist is null");
            }
            else{
                while(tem2 != null){
                    System.out.print(tem2.data+"->");
                    tem2=tem2.nxt;
                }
                System.out.println("null");        
            } 
    }
    void addtoany(int dta, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }
        else if (pos == 1) {
            AddToHead(dta);
            return;
        }
        box tem = head;
        for (int i = 1; i < pos - 1; i++) {
            if (tem == null) {
                System.out.println("Invalid position");
                return;
            }
            tem = tem.nxt;
        }
        if (tem == null) {
            System.out.println("Invalid position");
            return;
        }
        if (tem.nxt == null) {
            AddToTail(dta);
        } 
        else {
            tem.nxt = new box(dta, tem.nxt);
        }
    }

    int searchindex(int data){
        box tem2=head;
        int idx=0;
        if(checkempty12()){
            System.out.println("this linklist is null");
            return -1;
        }
        else{
            while(tem2 != null){
                if(tem2.data==data){
                    return idx;
                }
                else {
                    tem2=tem2.nxt;
                    idx++;

                }
            }        
        }
        System.out.println("this search is not in linklist");
        return -1;
    }
    void deletehead(){
        if(checkempty12()){
            System.out.println("this linklist is empty");
        }
        else if(head.nxt==null){
            head=tail=null;
        }
        else{
            head=head.nxt;
        }
    }
    void deletetail(){
        if(checkempty12()){
            System.out.println("this linklist is empty");
        }
        else if(head.nxt==null){
            head=tail=null;
        }
        else{
            box tem=head;
            while(tem!=tail){
                if(tem.nxt==tail){
                    tail=tem;
                    tail.nxt=null;
                }
                else{
                    tem=tem.nxt;
                }
            }
        }
    }
    void deleteofany(int idx){
        if(checkempty12()){
            System.out.println("invalid option");
        }
        else if(head==tail){
            if(idx==1){
                head=tail=null;
            }
            else{
                System.out.println("invalid option");
            }      
        }
        // else if(head.nxt==tail){
        //     if(idx==1){
        //         head=tail;
        //         head.nxt=null;
        //     }
        //     else if(idx==2){
        //         tail=head;
        //         tail.nxt=null;
        //     }
        // }
        else{
            box ptem=null;
            box tem=head;
            for (int i=1;i<idx;i++){
                if(tem==null){
                    break;
                }
                else{
                    ptem=tem;
                    tem=tem.nxt;
                }

            }
            if(tem==null){
                System.out.println("invalid option");
            }
            else if(ptem==null){
                deletehead();
            }
            else if(tem.nxt==null){
                deletetail();
            }
            else{
                ptem.nxt=tem.nxt;
            }

        }

    }

}
@SuppressWarnings("unused")
class try123{
    public static void main(String[] args) {
        Toconnect123 obj=new Toconnect123();
        obj.AddToHead(12);
        obj.AddToHead(13);
        obj.AddToHead(14);
        obj.AddToHead(15);
        obj.AddToHead(16);
        Toconnect123 obj1=new Toconnect123();
        obj1.AddToTail(34);
        obj1.AddToTail(35);
        obj1.AddToTail(36);
        obj1.AddToTail(37);
        obj.printbyhead(obj.head);
        obj1.printbyhead(obj1.head);
        obj.printbytail(obj.head);
        obj1.printbytail(obj1.head);
        obj.printhai();
        obj1.printhai();
        obj.deletehead();
        obj.printhai();
        obj1.deletetail();
        obj1.printhai();
        System.out.println(obj.searchindex(112));
        obj1.addtoany(22, 5);
        obj1.printhai();
        obj1.deleteofany(45);
        obj1.printhai();

        


    }
}