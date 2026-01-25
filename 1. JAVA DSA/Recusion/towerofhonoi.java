class tower{
    public static void tower1(int n,char from,char aux,char to){
        if(n==0){
            return;
        }
        tower1(n-1,from,to,aux);
        System.out.println("move disk "+n+" from "+from+" to "+to);
        tower1(n-1,aux,from,to);
    }
    public static void main(String[] args) {
        tower1(3, 'A', 'B',  'C');
    }
}