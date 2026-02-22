class bubblesort{
    public static void main(String[] args){
        int arr[]={1,23,45,12,34,56,12,890,45,123,45};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}