import java.util.Scanner;

public class Game_start {

    //public static Object inventar;
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
        System.out.println("Artemis: Lets start with buying some seeds to plant.");
        sleep(3000);
        System.out.println("Artemis: Here some Money for u");
        //inventar.addMoney(100);
        System.out.println("U got 100✿");
        sleep(4000);
        System.out.println("Artemis: Follow me to the Plant Shop.");
        sleep(3000);
        System.out.print("U enter the: ");
        System.out.println(COLORS.ANSI_BG_GREEN + "#### Plant Shop™ ####" + COLORS.ANSI_RESET);
        sleep(2000);
        System.out.println("Listbeth: Hellow Artemis how are u?");
        sleep(2500);
        System.out.println("Artemis: I'm doing GOOD d=====(￣▽￣*)b ");
        sleep(4000);
        if (gender.equals("female")){
            System.out.println("Lisbeth: Who is this beautiful Girl ur with? (❁´◡`❁)");
        }
        else if (gender.equals("male")){
            System.out.println("Lisbeth: Who is this beautiful Boy ur with? (❁´◡`❁)");
        }
        else{
            System.out.println("Lisbeth: Who is this beautiful Person ur with? (❁´◡`❁)");
        }
        sleep(3000);
        System.out.println("Artemis: Thats " + name + ".");
        sleep(1000);
        System.out.println("Artemis: " + pronouns[0] + " is with me to grab some seeds for " + pronouns[1] + " litle farm ヽ(✿ﾟ▽ﾟ)ノ");
        sleep(6000);
        System.out.println("Lisbeth: |(@^0^@)| nice! Look what i Have");
        sleep(3000);

         


        main.inventar.addMoney(100);
        shop shop1 = new shop(3,3,3);
        shop1.printshop();
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

