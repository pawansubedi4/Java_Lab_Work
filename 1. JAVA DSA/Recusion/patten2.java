class patten2 {
    public static void patteni(int i){
        if(i==6){
            return;
        }
        pattenj(1,i);
    }
    public static void pattenj(int j,int i){
        if(j==i){
            System.out.println(j);
            patteni(i+1);
        }
        else{
            System.out.print(j);
            pattenj(j+1,i);
        }

    }
    public static void main(String[] args) {
        patteni(1);
    }
    
}
