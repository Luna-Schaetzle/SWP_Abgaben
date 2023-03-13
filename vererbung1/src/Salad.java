import java.util.Random;

public class Salad extends Plant{

    private int nutrianValue;

    public Salad(String name, int thirst, int price, int selling_price, int nutrianValue) {
        super(name, thirst, price, selling_price);
        this.nutrianValue = nutrianValue;
    }

    public Salad(int nutrianValue) {
        this.nutrianValue = nutrianValue;
    }


    public Salad() {
    }

    static Salad ranSalad(){
        Salad ransalad;
        Random ran = new Random();
        int r = ran.nextInt(6);
        switch (r){
            case 0:

                ransalad = new Salad("Anemone",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1));
                break;
            case 1:
                ransalad = new Salad("1",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1));
                break;
            case 2:
                ransalad = new Salad("2",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1));
                break;
            case 3:
                ransalad = new Salad("3",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1));
                break;
            case 4:
                ransalad = new Salad("4",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1));
                break;
            case 5:
                ransalad = new Salad("5",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1));
                break;
            default:
                ransalad = new Salad("6",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1));
                break;

        }

        return ransalad;
    }

    public int getNutrianValue() {
        return nutrianValue;
    }

    public void setNutrianValue(int nutrianValue) {
        this.nutrianValue = nutrianValue;
    }
}
