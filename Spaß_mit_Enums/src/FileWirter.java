import java.io.FileWriter;
import java.io.IOException;

public class FileWirter {

    public static void main(String[] args) {

        try {
            writeToFile(args[0], args[1]);
        } catch (IOException e) {
            System.out.println("sorry somthing went wrong");
        }
        System.out.println("Success");

    }


    private static void writeToFile(String filename,String contant) throws IOException {
        FileWriter writer = null;
        writer = new FileWriter(filename);
        writer.write(contant);
        writer.close();

        //System.out.println("huhu");
    }


}
