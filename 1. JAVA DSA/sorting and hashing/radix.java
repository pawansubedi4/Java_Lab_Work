
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
        return queue.removeFirst();
    } 
    public boolean isEmpty1() {
        return queue.isEmpty();
    }
}

public class radix {
    static int max=0;
    // static int getdigit(int dta,int idx){
    //     int rem=0;
    //     for(int i=1;i<=idx;i++){
    //         rem=dta%10;
    //         dta=dta/10;
    //     }
    //     return rem;
    // }
    static int[] radix1(int[] arr){
        queeusingLinklist[] ob=new queeusingLinklist[10];
        for(int i=0;i<=9;i++){
            ob[i]=new queeusingLinklist();
        }
        for(int i=0;i<arr.length;i++){
            int len=(int)Math.log10(arr[i]) + 1;
            if(max<len){
                max=len;
            }
        }
        for(int j=1;j<=max;j++){
            for(int i=0;i<arr.length;i++){
                int p=arr[i];
                for(int k=1;k<j;k++){
                    p=p/10;
                }
                int r=p%10;
                ob[r].enqueue(arr[i]);
            }
            
            int c=0;
            for(int k=0;k<10;k++){
                while(!ob[k].isEmpty1()){
                    arr[c]=ob[k].dequeue();
                    c++;
                }
            }
        }
        // for(int j=1;j<=max;j++){
        //     for(int i=0;i<arr.length;i++){
        //         int r=getdigit(arr[i], j);
        //         ob[r].enqueue(arr[i]);
        //     }
        //     int c=0;
        //     for(int k=0;k<10;k++){
        //         while(!ob[k].isEmpty1()){
        //             arr[c]=ob[k].dequeue();
        //             c++;
        //         }
        //     }
        // }
        return arr;

    }
    public static void main(String[] args) {
        int arr[]={1,23,45,12,34,56,12,890,45,123,45};
        int res[]=radix1(arr);
        for (int a:res){
            System.out.print(a+" ");
        }
        

    }
}
