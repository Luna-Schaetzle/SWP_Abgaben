public abstract class Plant {

    private String name;
    private int health;
    private boolean isplanted;
    private int growstatus;
    private int waterstaus;
    private int thirst;
    private int price;
    private int selling_price;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isIsplanted() {
        return isplanted;
    }

    public void setIsplanted(boolean isplanted) {
        this.isplanted = isplanted;
    }

    public int getGrowstatus() {
        return growstatus;
    }

    public void setGrowstatus(int growstatus) {
        this.growstatus = growstatus;
    }

    public int getWaterstaus() {
        return waterstaus;
    }

    public void setWaterstaus(int waterstaus) {
        this.waterstaus = waterstaus;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(int selling_price) {
        this.selling_price = selling_price;
    }
}
