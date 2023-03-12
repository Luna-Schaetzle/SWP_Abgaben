import java.util.Arrays;
import java.util.Scanner;

public class Game_start {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private String gender;
    private String[] pronouns = new String[2];

    public Game_start() {

        System.out.print("Enter your name: ");
        this.name = scanner.next();
        System.out.print("Enter your gender: ");
        this.gender = scanner.next().toLowerCase();
        if (gender.equals("female")){
            this.pronouns[0] = "she";
            this.pronouns[1] = "her";
        }
        else if (gender.equals("male")){
            this.pronouns[0] = "he";
            this.pronouns[1] = "his";
        }
        else{
            this.pronouns[0] = "they";
            this.pronouns[1] = "them";
        }

        introduceArtemis();

        //System.out.println(pronouns[0] + "/" + pronouns[1]);
    }

    private void introduceArtemis (){
        //artemisnameprint();
        System.out.println("Artemis: Hello " + name + " my name is Artemis");
        sleep(3000);
        System.out.println("Artemis: I will help you making ur on little farm :3");
        sleep(4000);
        System.out.println("Artemis: Lets start with buying some seeds to start.");
        sleep(4000);
        System.out.println("Artemis: come lets travel to the shop.");
        sleep(8000);
        shop.printshop();
    }

    private void artemisnameprint (){
        final String ANSI_RESET = "\u001B[0m";


        final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
        final String ANSI_BRIGHT_BG_CYAN   = "\u001B[106m";
        final String ANSI_BRIGHT_BG_WHITE  = "\u001B[107m";

        System.out.print(COLORS.ANSI_BLACK + ANSI_BRIGHT_BG_CYAN + "A" + ANSI_RESET);
        System.out.print(COLORS.ANSI_BLACK + ANSI_BRIGHT_BG_PURPLE + "r" + ANSI_RESET);
        System.out.print(COLORS.ANSI_BLACK + ANSI_BRIGHT_BG_WHITE + "t" + ANSI_RESET);
        System.out.print(COLORS.ANSI_BLACK + ANSI_BRIGHT_BG_WHITE + "e" + ANSI_RESET);
        System.out.print(COLORS.ANSI_BLACK + ANSI_BRIGHT_BG_WHITE + "m" + ANSI_RESET);
        System.out.print(COLORS.ANSI_BLACK + ANSI_BRIGHT_BG_PURPLE + "i" + ANSI_RESET);
        System.out.print(COLORS.ANSI_BLACK + ANSI_BRIGHT_BG_CYAN + "s" + ANSI_RESET);
        System.out.print(": ");


    }

    private void sleep (int milli){
        try {
            Thread.sleep(milli);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}

