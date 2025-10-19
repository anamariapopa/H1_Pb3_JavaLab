public class Main {

    public static void main() {
        int[] a = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        //1
        int[] result = BigNumberCalculator.add(a, b);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

        System.out.println();

        //2
    }
}
