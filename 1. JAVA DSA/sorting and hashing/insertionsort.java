public class insertionsort {
    public static void main(String[] args) {
        int arr[]={1,23,45,12,34,56,12,890,45,123,45};
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int tem=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tem;
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
