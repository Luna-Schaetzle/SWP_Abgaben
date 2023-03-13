import java.util.ArrayList;

public class Inventar {

    private int money;
    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Salad> salads = new ArrayList<>();
    ArrayList<Cerial> cerials = new ArrayList<>();



    //wird noch verbessert
    @Override
    public String toString() {
        return "Inventar{" +
                "money=" + money +
                ", flowers=" + flowers +
                ", salads=" + salads +
                ", cerials=" + cerials +
                '}';
    }

    public Inventar(ArrayList<Flower> flowers, ArrayList<Salad> salads, ArrayList<Cerial> cerials) {
        this.flowers = flowers;
        this.salads = salads;
        this.cerials = cerials;
    }

    public Inventar() {
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money = this.money + money;
    }

    public void subMoney(int money) {
        this.money = this.money - money;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public void addFlowers(Flower flower){
        this.flowers.add(flower);
    }

    public ArrayList<Salad> getSalads() {
        return salads;
    }

    public void addSalads (Salad salad){
        this.salads.add(salad);
    }

    public void setSalads(ArrayList<Salad> salads) {
        this.salads = salads;
    }

    public ArrayList<Cerial> getCerials() {
        return cerials;
    }

    public void setCerials(ArrayList<Cerial> cerials) {
        this.cerials = cerials;
    }

    public void addCerials(Cerial cerial){
        this.cerials.add(cerial);
    }
}
