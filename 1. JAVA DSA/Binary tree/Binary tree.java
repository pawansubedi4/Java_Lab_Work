import java.util.LinkedList;
import java.util.Queue;
class node{
    int data;
    node left;
    node right;
    public node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Binary_tree {
    static int  idx=-1;
    public node addnode(int arr[]){
        idx++;
        if(arr[idx]==-1){
            return null;
        }
        node root=new node(arr[idx]);
        root.left=addnode(arr);
        root.right=addnode(arr);
        return root;
    }
    public void preordertrav(node rot){
        if(rot==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(rot.data+" ");
        preordertrav(rot.left);
        preordertrav(rot.right);
    }
    public void inordertrav(node rot){
        if(rot==null){
            return;
        }
        inordertrav(rot.left);
        System.out.print(rot.data+" ");
        inordertrav(rot.right);
    }
    public void postordertrav(node rot){
        if(rot==null){
            return;
        }
        postordertrav(rot.left);
        postordertrav(rot.right);
        System.out.print(rot.data+" ");
    }
    public void leveltrav(node rot){
        Queue<node> q=new LinkedList<>();
        if(rot==null){
            return;
        }
        q.add(rot);
        q.add(null);
        while(!q.isEmpty()){
            node cuNode=q.remove();
            if(cuNode==null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
                else
                    break;
            }
            else{
                System.out.print(cuNode.data +" ");
                if(cuNode.left!=null){
                    q.add(cuNode.left);
                }
                if(cuNode.right!=null){
                    q.add(cuNode.right);
                }
            }
        }
    }
    public int countnode(node rot){
        if(rot==null){
            return 0;
        }
        int lef=countnode(rot.left);
        int rig=countnode(rot.right);
        return lef+rig+1;
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
    public int sumofnode(node rot){
        if (rot==null){
            return 0;
        }
        int lef=sumofnode(rot.left);
        int rig=sumofnode(rot.right);
        return lef+rig+rot.data;
    }
    public int diameter(node rot){
        if(rot==null){
            return 0;
        }
        int diam1=diameter(rot.left);
        int diam2=diameter(rot.right);
        int diam3=findheight(rot.left)+findheight(rot.right)+1;
        return Math.max(Math.max(diam1,diam2),diam3);
    }
}
@SuppressWarnings("unused")
class kjfdkjfdkj{
    public static void main(String[] args) {
      int[]  arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      Binary_tree obj=new Binary_tree();
      node root=obj.addnode(arr);
      System.out.println(root.data);
      obj.preordertrav(root);
      System.out.println();
      obj.inordertrav(root);
        System.out.println();
      obj.postordertrav(root);
        System.out.println();
      obj.leveltrav(root);
      System.out.println(obj.countnode(root));
      System.out.println(obj.findheight(root));
      System.out.println(obj.sumofnode(root));
      System.out.println(obj.diameter(root));
    }
}
