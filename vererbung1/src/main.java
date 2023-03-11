public class main {

    public static final String ANSI_RESET = "\u001B[0m";


    public static final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String ANSI_BRIGHT_BG_CYAN   = "\u001B[106m";
    public static final String ANSI_BRIGHT_BG_WHITE  = "\u001B[107m";

    public static void main(String[] args) {

        //Game_start.start();

        transflag();


    }

    public static void transflag (){
        //Trans Rights

        final String ANSI_RESET = "\u001B[0m";


        final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
        final String ANSI_BRIGHT_BG_CYAN   = "\u001B[106m";
        final String ANSI_BRIGHT_BG_WHITE  = "\u001B[107m";


        System.out.println(ANSI_BRIGHT_BG_CYAN + "                          " + ANSI_RESET);
        System.out.println(ANSI_BRIGHT_BG_PURPLE + "                          " + ANSI_RESET);
        System.out.println(ANSI_BRIGHT_BG_WHITE + "                          " + ANSI_RESET);
        System.out.println(ANSI_BRIGHT_BG_PURPLE + "                          " + ANSI_RESET);
        System.out.println(ANSI_BRIGHT_BG_CYAN + "                          " + ANSI_RESET);
    }


}
