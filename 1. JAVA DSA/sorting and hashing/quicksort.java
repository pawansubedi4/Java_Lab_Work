public class quicksort {
    public static void quicksort1(int[] arr,int lo,int hi) {
        if(lo<hi){
            int pivot=partationr(arr,lo,hi);
            quicksort1(arr, lo,pivot-1);
            quicksort1(arr, pivot+1, hi);
        }
    }
    // public static int partationl(int[] arr,int lo,int hi){
    //     int pivot=arr[lo];
    //     int i=lo;
    //     for(int j=lo+1;j<=hi;j++){
    //         if(arr[j]<=pivot){
    //             i++;
    //             int tem=arr[j];
    //             arr[j]=arr[i];
    //             arr[i]=tem;
    //         }
    //     }
    //     int tem=arr[lo];
    //     arr[lo]=arr[i];
    //     arr[i]=tem;
    //     return i;
    // }
    public static int partationr(int[] arr,int lo,int hi){
        int pivot=arr[hi];
        int i=lo-1;
        for(int j=lo;j<hi;j++){
            if(arr[j]<=pivot){
                i++;
                int tem=arr[j];
                arr[j]=arr[i];
                arr[i]=tem;
            }
        }
        int tem=arr[hi];
        arr[hi]=arr[i+1];
        arr[i+1]=tem;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={18,2,34,56,73,26,37,21,46,78,3};
        quicksort1(arr,0,arr.length-1);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}