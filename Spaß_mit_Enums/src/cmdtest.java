import java.io.IOException;

public class cmdtest {

    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dir");
        try {
            Process p = pb.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Success");


        try {
            Runtime.getRuntime().exec("cmd /c cls");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Success");


    }

}
