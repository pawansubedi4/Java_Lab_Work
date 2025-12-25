class binarysearch {
    public static int  searchn(int[] arr,int key){
        int tail=0;
        int head=(arr.length-1);
        while(tail<head){
            int mid=(head+tail)/2;
            if (key<arr[mid]){
                head=mid-1;
            }
            else if(key>arr[mid]){
                tail=mid+1;

            }
            else{
                return mid;
            }    

        }
        return-1;
        
    }  
    public static void main(String[] args) {
        int[] arr12={1,3,5,6,7,8,9};
        System.out.println(searchn(arr12,8));
    }
}
