import java.util.Random;

public class Cerial extends Plant{

    private int amOfCorp;
    private int size;

    public Cerial() {
    }

    public Cerial(String name, int thirst, int price, int selling_price, int amOfCorp, int size) {
        super(name, thirst, price, selling_price);
        this.amOfCorp = amOfCorp;
        this.size = size;
    }

    public Cerial(int amOfCorp, int size) {
        this.amOfCorp = amOfCorp;
        this.size = size;
    }
    static Cerial rancorn(){
        Cerial cerial;
        Random ran = new Random();
        int r = ran.nextInt(6);
        switch (r){
            case 0:

                cerial = new Cerial("Barley",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 1:
                cerial = new Cerial("Corn",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 2:
                cerial = new Cerial("oat",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 3:
                cerial = new Cerial("reis",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 4:
                cerial = new Cerial("sorghum",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 5:
                cerial = new Cerial("cane",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            default:
                cerial = new Cerial("6c",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;

        }

        return cerial;
    }


    public double getAmOfCorp() {
        return amOfCorp;
    }

    public void setAmOfCorp(int amOfCorp) {
        this.amOfCorp = amOfCorp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
