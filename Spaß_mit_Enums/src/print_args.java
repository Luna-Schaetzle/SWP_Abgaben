public class print_args {

        public static void main(String[] args) {
            for (String a:args){
                System.out.println(a);
            }
            System.out.println("End of arguments \n");
            //args 0 gibt uns ein wie die Datei heist
            //args 1 ist der Inhalt der in die Datei kommt

            System.out.println("Anzahl der Argumente: " + args.length);

            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        }

}
