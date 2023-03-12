public class Flower extends Plant{

    public String color;

    public Flower(int thirst, int price, int selling_price, String color) {
        super(thirst, price, selling_price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
