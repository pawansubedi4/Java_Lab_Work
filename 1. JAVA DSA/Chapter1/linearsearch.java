class linear1{
    int[] arr=new int[10];
    void insert(int key,int index){
        arr[index]=key;
    }
    int search(int key){
        int idx=0;
        for(int i=0;i<10;i++){
            if (arr[i]==key){
                idx=i;
                break;
            }
            else{
                idx=-1;
            }
        }
        return idx;
    }
    void sort(){
        int t;
        for(int i=0;i<10;i++){
            for (int j=i+1;j<10;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
    void traverser(){
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }   
}

@SuppressWarnings("unused")
class demo{
    public static void main(String[] args) {
        linear1 obj=new linear1();
        obj.insert(10,0);
        obj.insert(11,1);
        obj.insert(19,2);
        obj.insert(7,3);
        obj.insert(10,4);
        System.out.println(obj.search(7));
        System.out.println(obj.search(22));
        obj.sort();
        obj.traverser();
    }
}