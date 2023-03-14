import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {
        String myString = "Hello World";
        FileWriter writer = null;
        try {
            writer = new FileWriter("myFile.txt");
            writer.write(myString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Succefully wrote to file.");


    }


}
