import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CardNumber {

    public static void main(String args[]){
        System.out.println("here");
        Random rnd = new Random();
        long number = rnd.nextLong()*100000000000L;
        long number2 = (long) (rnd.nextLong() * 1e16);


        //double randomNum = Math.random();


        String cNum = String.valueOf(number2);
        System.out.println("Card#:" + cNum);
        //System.out.println(number);
        //System.out.println(number2);

        CreateFile myFile = new CreateFile();
        myFile.createFileMethod();

    }//main





}
