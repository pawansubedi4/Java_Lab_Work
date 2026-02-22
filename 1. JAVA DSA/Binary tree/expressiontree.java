
import java.util.Stack;

class enode{
    char ch;
    enode left;
    enode right;
     public enode(char c){
        ch=c;
        left=null;
        right=null;
     }
}
public class expressiontree {
    public boolean isoperator(char c){
        return (c=='+'||c=='-'||c=='*'||c=='/');
    }
    enode create(String post){
        Stack<enode> obj=new Stack<>();
        for(int i=0;i<post.length();i++){
            char ch=post.charAt(i);
            if(!isoperator(ch)){
                obj.push(new enode(ch));
            }
            else if(ch==' '){
            }
            else{
                enode right=obj.pop();
                enode left=obj.pop();
                enode newnode=new enode(ch);
                newnode.left=left;
                newnode.right=right;
                obj.push(newnode);
            }
        }
        return obj.pop();

    }
    void inorder(enode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.ch+" ");
        inorder(root.right);
    }

}
@SuppressWarnings("unused")
class jptwe{
    public static void main(String[] args) {
        expressiontree obj=new expressiontree();
        enode root=obj.create("ab+c*");
        obj.inorder(root);
    }
}
