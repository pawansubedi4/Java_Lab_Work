class Jptexception extends Exception{
    public Jptexception(){
        System.out.println("it is costum error hai");
    }
}


public class Costumeexpection {
    public static void main(String[] args) {
        try{
            int x=17;
            if (x<18){
                throw new Jptexception();
            }
        }catch(Jptexception ex){
            System.out.println(ex);
        }
        
    }
    
}
