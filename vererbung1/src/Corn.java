import java.util.Random;

public class Corn extends Plant{

    private int amOfCorp;
    private int size;

    public Corn() {
    }

    public Corn(String name, int thirst, int price, int selling_price, int amOfCorp, int size) {
        super(name, thirst, price, selling_price);
        this.amOfCorp = amOfCorp;
        this.size = size;
    }

    public Corn(int amOfCorp, int size) {
        this.amOfCorp = amOfCorp;
        this.size = size;
    }
    static Corn rancorn(){
        Corn corn;
        Random ran = new Random();
        int r = ran.nextInt(6);
        switch (r){
            case 0:

                corn = new Corn("0c",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 1:
                corn = new Corn("1c",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 2:
                corn = new Corn("2c",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 3:
                corn = new Corn("3c",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 4:
                corn = new Corn("4c",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            case 5:
                corn = new Corn("5c",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;
            default:
                corn = new Corn("6c",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),(ran.nextInt(3) + 1),(ran.nextInt(3) + 1));
                break;

        }

        return corn;
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
