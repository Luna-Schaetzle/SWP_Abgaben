import java.util.Locale;
import java.util.Scanner;

public class shop {

    //private static anzanflow;
    public int anzanflow;
    public int anzanSalad;
    public int anzanCerial;
    Flower[] flower;
    Salad[] salads;
    Cerial[] cerials;



    Scanner scanner = new Scanner(System.in);


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
        String buyanswer;
        char morebuy = ' ';

        do {
            System.out.println("");

            System.out.println(COLORS.ANSI_BG_GREEN + "#### Plant Shop™ ####" + COLORS.ANSI_RESET + " U have: " + main.inventar.getMoney() + " ✿");
            System.out.println("# Flowers [f]#");
            for (int i = 0; i < this.anzanflow; i++) {
                System.out.print((i + 1) + " - ");
                //flower[i] = Flower.ranflower();
                System.out.println(flower[i].getName() + " " + flower[i].getPrice() + " ✿");

            }
            System.out.println("# Salad [s]#");
            for (int i = 0; i < this.anzanSalad; i++) {
                System.out.print((i + 1) + " - ");
                System.out.println(salads[i].getName() + " " + salads[i].getPrice() + " ✿");
            }
            System.out.println("# Cerials [c]#");
            for (int i = 0; i < this.anzanCerial; i++) {
                System.out.print((i + 1) + " - ");
                System.out.println(cerials[i].getName() + " " + cerials[i].getPrice() + " ✿");
            }
            do {
                System.out.println("Lisbeth: What do u wanna Buy: ");
                buyanswer = scanner.next().toLowerCase();
            } while (buyverarbeitung(buyanswer) == false);
            System.out.println("Lisbeth: Thanks for ur purchase! o(*^＠^*)o");
            System.out.println("Lisbeth: Do u wanna buy more [y/n]: ");
            morebuy = scanner.next().toLowerCase().charAt(0);


        }while (morebuy != 'n');

    }

    private boolean buyverarbeitung(String eingabe){
        String iwert;
        if (eingabe.charAt(0) == 'f'){
            for (int i = 0; i < this.anzanflow;i++){
                iwert = String.valueOf((i+1));
                if (eingabe.charAt(1) == iwert.charAt(0)){
                    main.inventar.addFlowers(flower[i]);
                    main.inventar.subMoney(flower[i].getPrice());
                    flower[i] = Flower.ranflower();
                    return true;
                }
            }

        }
        if (eingabe.charAt(0) == 's'){
            for (int i = 0; i < this.anzanSalad;i++){
                iwert = String.valueOf((i+1));
                if (eingabe.charAt(1) == iwert.charAt(0)){
                    main.inventar.addSalads(salads[i]);
                    main.inventar.subMoney(salads[i].getPrice());
                    salads[i] = Salad.ranSalad();
                    return true;
                }
            }

        }
        if (eingabe.charAt(0) == 'c'){
            for (int i = 0; i < this.anzanCerial;i++){

                iwert = String.valueOf((i+1));
                if (eingabe.charAt(1) == iwert.charAt(0)){
                    main.inventar.addCerials(cerials[i]);
                    main.inventar.subMoney(cerials[i].getPrice());
                    cerials[i] = Cerial.rancorn();
                    return true;
                }
            }

        }
        if (eingabe.charAt(0) == 'i'){
            System.out.println(main.inventar.toString());
            return false;
        }

        return false;
    }

    /*
    private void trade (){

    }

     */


    /*
    //IDEE: man gibt was ein und es erkennt welche planze es ist
    public void erkennung(String buyanswer){
        int i = 0;
        do {
            i++;
        }while (!buyanswer.equals(flower[i]) || i < 3);
        if (i == 3){

        }

    }

     */


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
