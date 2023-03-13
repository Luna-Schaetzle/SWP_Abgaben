import java.util.Random;
import java.util.concurrent.Flow;

public class Flower extends Plant{

    public String color;
    public int amOfSeeds;
    //public boolean eatable;

    public Flower(Flower ranflower){

    }

    public Flower(String name, int thirst, int price, int selling_price, String color, int amOfSeeds) {
        super(name, thirst, price, selling_price);
        this.color = color;
        this.amOfSeeds = amOfSeeds;
        //this.eatable = eatable;
    }

    static Flower ranflower(){
        Flower ranflower;
        Random ran = new Random();
        int r = ran.nextInt(6);
        switch (r){
            case 0:

                ranflower = new Flower("Anemone",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 1:
                ranflower = new Flower("orchid",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_BRIGHT_CYAN,(ran.nextInt(3) + 1));
                break;
            case 2:
                ranflower = new Flower("Tulip",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_BRIGHT_PURPLE,(ran.nextInt(3) + 1));
                break;
            case 3:
                ranflower = new Flower("Lavender",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_PURPLE,(ran.nextInt(3) + 1));
                break;
            case 4:
                ranflower = new Flower("Rose",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_RED,(ran.nextInt(3) + 1));
                break;
            case 5:
                ranflower = new Flower("Poppy",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_RED,(ran.nextInt(3) + 1));
                break;
            default:
                ranflower = new Flower("6",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;

        }

        return ranflower;
    }

    public Flower(String color, int amOfSeeds) {
        this.color = color;
        this.amOfSeeds = amOfSeeds;
        //this.eatable = eatable;
    }



    public int getAmOfSeeds() {
        return amOfSeeds;
    }

    public void setAmOfSeeds(int amOfSeeds) {
        this.amOfSeeds = amOfSeeds;
    }

    /*
    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

     */

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
