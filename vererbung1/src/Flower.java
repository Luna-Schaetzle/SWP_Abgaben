public class Flower extends Plant{

    public String color;
    public int amOfSeeds;
    public boolean eatable;

    public Flower() {
    }

    public int getAmOfSeeds() {
        return amOfSeeds;
    }

    public void setAmOfSeeds(int amOfSeeds) {
        this.amOfSeeds = amOfSeeds;
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
