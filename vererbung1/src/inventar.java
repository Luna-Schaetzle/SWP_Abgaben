import java.util.ArrayList;

public class inventar {


    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Salad> salads = new ArrayList<>();
    ArrayList<Cerial> cerials = new ArrayList<>();

    public inventar(ArrayList<Flower> flowers, ArrayList<Salad> salads, ArrayList<Cerial> cerials) {
        this.flowers = flowers;
        this.salads = salads;
        this.cerials = cerials;
    }

    public inventar() {
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
