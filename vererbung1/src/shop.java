import java.util.Random;
import java.util.concurrent.Flow;

public class shop {

    //private static anzanflow;
    public int anzanflow;
    public int anzanSalad;
    public int anzanCorn;

    public shop(int anzanflow, int anzanSalad, int anzanCorn) {
        this.anzanflow = anzanflow;
        this.anzanSalad = anzanSalad;
        this.anzanCorn = anzanCorn;
    }

    public void printshop(){
        Flower[] flower = new Flower[anzanflow];

        System.out.println("");

        System.out.println(COLORS.ANSI_BG_GREEN + "#### Plant Shop™ ####" + COLORS.ANSI_RESET);
        System.out.println("# Flowers #");
        for (int i = 0; i < this.anzanflow;i++){
            System.out.print((i+1) + " - ");
            flower[i] = Flower.ranflower();
            System.out.println(flower[i].getName());
        }
        System.out.println("# Salad #");
        System.out.println("1 - ");
        System.out.println("2 - ");
        System.out.println("3 - ");
        System.out.println("# Corn #");
        System.out.println("1 - ");
        System.out.println("2 - ");
        System.out.println("3 - ");
    }



    /*
    private Flower ranflower(){
        Flower ranflower;
        Random ran = new Random();
        int r = ran.nextInt(6);
        switch (r){
            case 0:

                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 1:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 2:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 3:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 4:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 5:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            default:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;

        }

        return ranflower;
    }

     */

}
