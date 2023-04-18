
public class SumOfArgs {
    // Write a program that prints the sum of the numbers from all arguments
    // Example: java SumOfArgs 1 2 3 4 5 asf
    // Output: 15 not a numeric value

    /**
     * Integer.parseInt() converts a string to an integer
     * Integer.parseInt("1") -> 1
     * Integer.parseInt("2") -> 2
     * Integer.parseInt("3") -> 3
     * Integer.parseInt("4") -> 4
     * Integer.parseInt("5") -> 5
     * what does Integer.parseInt("asf") do?
     * Integer.parseInt("asf") -> ?
     */
    public static void main(String[] args) {


        int sum = 0;
        for (int i = 0; i < args.length; i++) {

            try {
                sum = sum + Integer.parseInt(args[i]);

            } catch (NumberFormatException e) {
                System.out.println("Not a numeric value");
            }
        }
        System.out.println(sum);
    }

}
