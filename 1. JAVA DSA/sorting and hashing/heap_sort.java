public class heap_sort {
    public static void heapsort(int[] arr) {
        int n=arr.length-1;
        for(int i=(n-1)/2;i>=0;i--){
            hepify(arr,n,i);
        }
        for(int i=n;i>=0;i--){
            swap(arr,0,i);
            hepify(arr,i,0);
        } 
    }
    public static void swap(int[] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }
    public static void hepify(int[] arr,int n,int p) {
        int l=p*2+1;
        int r=p*2+2;
        int largestidx=p;
        if(l<n&&arr[largestidx]<arr[l])
            largestidx=l;
        if(r<n&&arr[largestidx]<arr[r])
            largestidx=r;

        if(p!=largestidx){
            swap(arr,p,largestidx);
            hepify(arr,n,largestidx);
        }
        
    }
    
    public static void main(String[] args) {
        int[] arr={12,19,59,92,45,76,87,23,12,56};
        heapsort(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    
}
