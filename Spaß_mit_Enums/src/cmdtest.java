public class cmdtest {

    public static void main(String[] args) {

        try {
            Process rt = Runtime.getRuntime().exec("cmd /c dir");
        }catch (Exception e) {
            System.out.println("sorry somthing went wrong");
        }
        System.out.println("Success");


    }

}
