import java.io.BufferedReader;
import java.io.FileReader;
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

        /**
         * Read the file and print it to the console
         */
            readAndPrintFileContents(args[0]);


        /*
        try {
            readFromFile(args[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
         */


    }


    /**
     * Read a file and print it to the console
     * @param fileName
     */
    public static void readAndPrintFileContents(String fileName) {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }



    /**
     * Write a string to a file
     * @param filename
     * @param contant
     * @throws IOException
     */
    private static void writeToFile(String filename,String contant) throws IOException {
        FileWriter writer = null;
        writer = new FileWriter(filename);
        writer.write(contant);
        writer.close();

        //System.out.println("huhu");
    }


}
