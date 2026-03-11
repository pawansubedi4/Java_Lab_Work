public class selectionsort {
    public static void main(String[] args) {
        int arr[]={1,23,45,12,34,56,12,890,45,123,45};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int tem=arr[min];
            arr[min]=arr[i];
            arr[i]=tem;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
