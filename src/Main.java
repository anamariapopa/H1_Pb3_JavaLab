public class Main {

    public static void main() {
        int[] a = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] c = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] d = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        //1
        int[] resultAdd = BigNumberCalculator.add(a, b);
        System.out.print("Addition = ");
        for (int i = 0; i < resultAdd.length; i++) {
            System.out.print(resultAdd[i]);
        }

        System.out.println();

        //2
        int[] resultDiff = BigNumberCalculator.substract(c, d);
        System.out.print("Substraction = ");
        for (int i = 0; i < resultDiff.length; i++) {
            System.out.print(resultDiff[i]);
        }
    }
}
