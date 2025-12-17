import java.io.*;
class inpu{
    public static void main(String[] args) {
        try {
            FileReader dat=new FileReader("jpt/jpt.txt");
            int ch;
            while ((ch=dat.read())>-1){
                System.out.println(ch);
            }
            dat.close();
            
        } catch (IOException e) {
            System.out.println("error");
        }

    }
}