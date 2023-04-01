/*
Credits to Elyah for the idea
improved by me (Luna)
CopyRight 2023
by Luna
 */


import java.util.Scanner;

import java.util.Random;

public class textToImage {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BG_BLACK = "\u001B[40m";
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_PURPLE = "\u001B[45m";
    public static final String ANSI_BG_CYAN = "\u001B[46m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";

    public static final String ANSI_BRIGHT_BG_BLACK = "\u001B[100m";
    public static final String ANSI_BRIGHT_BG_RED = "\u001B[101m";
    public static final String ANSI_BRIGHT_BG_GREEN = "\u001B[102m";
    public static final String ANSI_BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String ANSI_BRIGHT_BG_BLUE = "\u001B[104m";
    public static final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String ANSI_BRIGHT_BG_CYAN = "\u001B[106m";
    public static final String ANSI_BRIGHT_BG_WHITE = "\u001B[107m";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("What broad should it be");
        int broad = scan.nextInt();

        System.out.println("What height should it be");
        int height = scan.nextInt();

        for (int a = 0; a < height; a++) {
            for (int b = 0; b < broad; b++) {
                int randomcolor = random.nextInt(16);

                if (randomcolor == 15) {
                    System.out.print(ANSI_BG_GREEN + "   " + ANSI_RESET);

                }
                if (randomcolor == 14) {
                    System.out.print(ANSI_BG_BLUE + "   " + ANSI_RESET);

                }
                if (randomcolor == 13) {
                    System.out.print(ANSI_BG_WHITE + "   " + ANSI_RESET);
                }
                if (randomcolor == 12) {
                    System.out.print(ANSI_BG_PURPLE + "   " + ANSI_RESET);
                }
                if (randomcolor == 11) {
                    System.out.print(ANSI_BG_YELLOW + "   " + ANSI_RESET);
                }
                if (randomcolor == 10) {
                    System.out.print(ANSI_BG_CYAN + "   " + ANSI_RESET);

                }
                if (randomcolor == 9) {
                    System.out.print(ANSI_BG_BLACK + "   " + ANSI_RESET);

                }
                if (randomcolor == 8) {
                    System.out.print(ANSI_BG_RED + "   " + ANSI_RESET);

                }
                if (randomcolor == 7) {
                    System.out.print(ANSI_BRIGHT_BG_PURPLE + "   " + ANSI_RESET);

                }
                if (randomcolor == 6) {
                    System.out.print(ANSI_BRIGHT_BG_RED + "   " + ANSI_RESET);

                }
                if (randomcolor == 5) {
                    System.out.print(ANSI_BRIGHT_BG_BLACK + "   " + ANSI_RESET);

                }
                if (randomcolor == 4) {
                    System.out.print(ANSI_BRIGHT_BG_BLUE + "   " + ANSI_RESET);

                }
                if (randomcolor == 3) {
                    System.out.print(ANSI_BRIGHT_BG_GREEN + "   " + ANSI_RESET);

                }
                if (randomcolor == 2) {
                    System.out.print(ANSI_BRIGHT_BG_WHITE + "   " + ANSI_RESET);

                }
                if (randomcolor == 1) {
                    System.out.print(ANSI_BRIGHT_BG_CYAN + "   " + ANSI_RESET);

                }
                if (randomcolor == 0) {
                    System.out.print(ANSI_BRIGHT_BG_YELLOW + "   " + ANSI_RESET);

                }


            }
            System.out.println();
        }


        //}while(i==1);

    }
}