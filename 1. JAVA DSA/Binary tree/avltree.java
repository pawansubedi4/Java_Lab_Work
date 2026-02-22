class node{
    int data;
    node left;
    node right;
    node(int dta){
        data=dta;
        left=null;
        right=null;
    }
}      
class Avl_tree{
    public node insert(int dta,node root){
        if(root==null){
            root=new node(dta);
            return root;
        }
        if(dta<root.data){
           root.left=insert(dta,root.left);
        }
        else{
            root.right=insert(dta,root.right);
        }
       //for balancing
        int balance = getbalance(root);
        //LL
        if(balance>1&&dta<root.left.data)
            return rightRotate(root);
        //RR
        if(balance<-1&&dta>root.right.data)
            return leftRotate(root);
        //LR
        if(balance>1&&dta>root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        //RL
        if(balance<-1&&dta<root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public int findheight(node rot){
        if(rot==null){
            return 0;
        }
        int lef=findheight(rot.left);
        int rig=findheight(rot.right);
        if(lef>rig){
            return lef+1;
        }
        else{
            return rig+1;
        }
    }
    public int getbalance(node root){
        if(root==null){
            return 0;
        }
        return findheight(root.left)-findheight(root.right);
    }

    node rightRotate(node y) {
        node x=y.left;
        node T2=x.right;
        x.right=y;
        y.left=T2;
        return x;
    }
    node leftRotate(node x) {
        node y=x.right;
        node T2=y.left;
        y.left=x;
        x.right=T2;
        return y;
    }

    public boolean search(int key,node root){
        if(root==null){
            return false;
        }
        if(key<root.data){
            return search(key,root.left);
        }
        else if(key>root.data){
           return search(key,root.right); 
        }
        else{
            return true;
        }
    }
    public node delete(int key,node root){
        if(root==null){
            System.out.println("invalid key");
            return root;
        }
        if(key<root.data){
            root.left=delete(key,root.left);
        }
        else if(key>root.data){
            root.right=delete(key, root.right);
        }
        else{
            if(root.left==null&&root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                node jp=tocopy(root.right);
                root.data=jp.data;
                delete(jp.data,root.right);
            }
        }
        int balance = getbalance(root);
        //LL
        if(balance>1&&getbalance(root.left)>=0)
            return rightRotate(root);
        //LR
        if(balance>1&&getbalance(root.left)<0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        //RR
        if(balance<-1&&getbalance(root.right)<=0)
            return leftRotate(root);
        //RL
        if(balance<-1&&getbalance(root.right)>0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public node tocopy(node root){
        if(root.left==null){
            return root;
        }
        return tocopy(root.left);
    }
    
}
@SuppressWarnings("unused")
class dfjfjyud{
    public static void main(String[] args) {
        node root=null;
        int[] aa={1,2,12,33,23,56,34,13,11,14};
        Avl_tree obj=new Avl_tree();
        for(int a:aa){
            root=obj.insert(a,root);
        }  
        obj.inorder(root);
        System.out.println();
        System.out.println(obj.search(56, root));
        System.out.println(obj.search(4, root));
        root=obj.delete(23,root);
        obj.inorder(root);
        System.out.println();
        root=obj.delete(56,root);
        obj.inorder(root);
        System.out.println();
        root=obj.delete(11,root);
        obj.inorder(root);


    }
}    
