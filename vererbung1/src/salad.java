public class salad extends Plant{

    private int naerwert;

    public salad(int thirst, int price, int selling_price, int naerwert) {
        super(thirst, price, selling_price);
        this.naerwert = naerwert;
    }

    public int getNaerwert() {
        return naerwert;
    }

    public void setNaerwert(int naerwert) {
        this.naerwert = naerwert;
    }
}
