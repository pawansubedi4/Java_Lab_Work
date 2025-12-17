import java.io.File;
import java.io.IOException;
public class createfile {
    public static void main(String[] args) {
        try {
            File obj = new File("jpt/jpt.txt");

            if (obj.createNewFile()) {
             System.out.println("Folder created successfully!");
            } else {
                System.out.println("Folder already exists or failed to create.");
            }
            
        } catch (IOException e) {
            System.out.println("error aayo");
        }
    }
}
