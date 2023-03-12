public abstract class Plant {

    private boolean isplanted;
    private int growstatus;
    private int waterstaus;
    private int thirst;
    private int price;
    private int selling_price;

    public Plant(int thirst, int price, int selling_price) {
        this.isplanted = false;
        this.growstatus = 0;
        this.waterstaus = 0;
        this.thirst = thirst;
        this.price = price;
        this.selling_price = selling_price;
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
