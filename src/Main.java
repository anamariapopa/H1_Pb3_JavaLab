public class Main {

    public static void main() {
        int[] a = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] c = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] d = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        //1
        int[] resultAdd = BigNumberCalculator.add(a, b);
        System.out.print("Addition = ");
        BigNumberCalculator.printNumber(resultAdd);

        //2
        int[] resultDiff = BigNumberCalculator.substract(c, d);
        System.out.print("Substraction = ");
        BigNumberCalculator.printNumber(resultDiff);

        //3
        int[] resultMul = BigNumberCalculator.multiply(a, 2);
        System.out.print("Multiplication = ");
        BigNumberCalculator.printNumber(resultMul);

        //4
        int[] resultDiv = BigNumberCalculator.divide(a, 2);
        System.out.print("Division = ");
        BigNumberCalculator.printNumber(resultDiv);
    }
}
