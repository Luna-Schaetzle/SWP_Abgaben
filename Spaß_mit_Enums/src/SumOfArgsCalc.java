public class SumOfArgsCalc {
    public static void main(String[] args) {
        double result = 0;
        double[] numbers = new double[args.length];

        for (int i = 0; i < args.length; i++) {

            try {
                numbers[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                if (args[i].equals("Addition") || args[i].equals("+")) {
                    result = numbers[i-2] + numbers[i-1];
                } else if (args[i].equals("Subtraction") || args[i].equals("-")) {
                    result = numbers[i-2] - numbers[i-1];
                } else if (args[i].equals("Multiplication") || args[i].equals("*")) {
                    result = numbers[i-2] * numbers[i-1];
                } else if (args[i].equals("Division") || args[i].equals("/")) {
                    result = numbers[i-2] / numbers[i-1];
                } else if (args[i].equals("Modulo") || args[i].equals("%")) {
                    result = numbers[i-2] % numbers[i-1];
                }
                else if (args[i].equals("Power") || args[i].equals("^")) {
                    result = (double) Math.pow(numbers[i - 2], numbers[i - 1]);
                } else if (args[i].equals("SquareRoot") || args[i].equals("sqrt")) {
                    result = (double) Math.sqrt(numbers[i - 1]);
                } else if (args[i].equals("CubeRoot") || args[i].equals("cbrt")) {
                    result = (double) Math.cbrt(numbers[i - 1]);
                } else if (args[i].equals("Logarithm") || args[i].equals("log")) {
                    result = (double) Math.log(numbers[i - 1]);
                } else if (args[i].equals("Absolute") || args[i].equals("abs")) {
                    result = Math.abs(numbers[i - 1]);
                } else if (args[i].equals("Ceiling") || args[i].equals("ceil")) {
                    result = (double) Math.ceil(numbers[i - 1]);
                } else if (args[i].equals("Floor") || args[i].equals("floor")) {
                    result = (double) Math.floor(numbers[i - 1]);
                } else if (args[i].equals("Round") || args[i].equals("round")) {
                    result = Math.round(numbers[i - 1]);
                } else if (args[i].equals("Max") || args[i].equals("max")) {
                    result = Math.max(numbers[i - 2], numbers[i - 1]);
                } else if (args[i].equals("Min") || args[i].equals("min")) {
                    result = Math.min(numbers[i - 2], numbers[i - 1]);
                } else if (args[i].equals("Sin") || args[i].equals("sin")) {
                    result = (double) Math.sin(numbers[i - 1]);
                } else if (args[i].equals("Cos") || args[i].equals("cos")) {
                    result = (double) Math.cos(numbers[i - 1]);
                } else if (args[i].equals("Tan") || args[i].equals("tan")) {
                    result = (double) Math.tan(numbers[i - 1]);
                } else if (args[i].equals("Random") || args[i].equals("random")) {
                    result = (double) Math.random();
                } else if (args[i].equals("RandomRange") || args[i].equals("randomrange")) {
                    result = (double) Math.random() * numbers[i - 1];
                }
                else {
                    System.out.println("Not a numeric value");
                }

            }
        }
        System.out.println(result);
    }
}
