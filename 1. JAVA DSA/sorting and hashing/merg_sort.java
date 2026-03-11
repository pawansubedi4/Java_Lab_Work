public class merg_sort {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void mergsort(int[] arr){
        if(arr.length<=1){
            return;
        }
        int mid=arr.length/2;
        int[] left=new int[mid];
        int[] right=new int[(arr.length)-mid];
        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for (int i=0;i<right.length;i++){
            right[i]=arr[mid+i];
        }
        mergsort(left);
        mergsort(right);
        merge(left,right,arr);

    }
    public static void merge(int[] l,int[] r,int[] arr) {
        int i,j,k;
        i=j=k=0;
        while(i<l.length&&j<r.length){
            if(l[i]<r[j]){
                arr[k]=l[i];
                i++;
                k++;
            }
            else{
                arr[k]=r[j];
                j++;
                k++;
            }
        }
        while(i<l.length){
            arr[k]=l[i];
            i++;
            k++; 
        }
        while(j<r.length){
            arr[k]=r[j];
            j++;
            k++;

        }    
    }
    public static void main(String[] args) {
        int[] arr={1,23,12,34,12,89,56,19,10,48};
        mergsort(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
