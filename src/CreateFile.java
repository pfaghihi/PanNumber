import java.io.File;
import java.io.IOException;

public class CreateFile {

    public void createFileMethod(){
        File myObj = new File("C:\\Users\\c0679445\\Desktop\\input.txt");
        try {
            if (myObj.createNewFile()){
                System.out.println("file created");
            }else {
                System.out.println("file alreadye exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
