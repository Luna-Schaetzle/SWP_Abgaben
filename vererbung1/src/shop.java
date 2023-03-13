public class shop {

    //private static anzanflow;
    public int anzanflow;
    public int anzanSalad;
    public int anzanCerial;
    Flower[] flower;
    Salad[] salads;
    Cerial[] cerials;


    public shop(int anzanflow, int anzanSalad, int anzanCerial) {
        this.anzanflow = anzanflow;
        this.anzanSalad = anzanSalad;
        this.anzanCerial = anzanCerial;

        flower = new Flower[anzanflow];
        salads = new Salad[anzanSalad];
        cerials = new Cerial[anzanCerial];

        for (int i = 0; i < anzanflow;i++){
            flower[i] = Flower.ranflower();
        }
        for (int i = 0; i < anzanSalad;i++){
            salads[i] = Salad.ranSalad();
        }
        for (int i = 0; i < anzanCerial; i++){
            cerials[i] = Cerial.rancorn();
        }
    }

    public void printshop(){

        System.out.println("");

        System.out.println(COLORS.ANSI_BG_GREEN + "#### Plant Shop™ ####" + COLORS.ANSI_RESET);
        System.out.println("# Flowers #");
        for (int i = 0; i < this.anzanflow;i++){
            System.out.print((i+1) + " - ");
            //flower[i] = Flower.ranflower();
            System.out.println(flower[i].getName() + " " + flower[i].getPrice() + " ✿");

        }
        System.out.println("# Salad #");
        for (int i = 0; i < this.anzanSalad;i++){
            System.out.print((i+1) + " - ");
            //salads[i] = Salad.ranSalad();
            System.out.println(salads[i].getName() + " " + salads[i].getPrice() + " ✿");
        }
        System.out.println("# Cerials #");
        for (int i = 0; i < this.anzanCerial; i++){
            System.out.print((i+1) + " - ");
            //cerials[i] = Cerial.rancorn();
            System.out.println(cerials[i].getName() + " " + cerials[i].getPrice() + " ✿");
        }


    }


    // System.out.format("%15s%15s%15s%n", row);

    /*
    private Flower ranflower(){
        Flower ranflower;
        Random ran = new Random();
        int r = ran.nextInt(6);
        switch (r){
            case 0:

                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 1:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 2:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 3:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 4:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            case 5:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;
            default:
                ranflower = new Flower("Anemonen",(ran.nextInt(7) + 3),(ran.nextInt(10) + 5),(ran.nextInt(8) + 3),COLORS.ANSI_YELLOW,(ran.nextInt(3) + 1));
                break;

        }

        return ranflower;
    }

     */

}
