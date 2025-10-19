public class BigNumberCalculator {

    //1
    public static int[] add(int[] a, int[] b) {
        int n = a.length;
        int[] result = new int[n+1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result;
    }

    //2
    public static int[] substract(int[] a, int[] b) {
        int n = a.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = a[i] - b[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            }
            else borrow = 0;
            result[i] = diff;
        }

        return result;
    }

    //3
    public static int[] multiply(int[] a, int number) {
        int n = a.length;
        int[] result = new int[n+n-1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int product = a[i] * number + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }
        result[0] = carry;
        return result;
    }

    //4
    public static int[] divide(int[] a, int number) {
        int n = a.length;
        int[] result = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int current = remainder * 10 + a[i];
            result[i] = current / number;
            remainder = current % number;
        }

        return result;
    }

    //print without the (possible) 0 from the beginning
    public static void printNumber(int[] number) {
        int i = 0;
        while (i < number.length - 1 && number[i] == 0)
            i++;
        for (; i < number.length; i++)
            System.out.print(number[i]);
        System.out.println();
    }
}
