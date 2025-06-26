class volume_class {
    int l;
    int b;
    int h;
    public static void main(String[] args){
        volume_class ob=new volume_class();
        ob.l=3;
        ob.b=4;
        ob.h=5;
        int volum=ob.l*ob.h*ob.b;
        System.out.println("the volum is "+volum);

    }
    
}
