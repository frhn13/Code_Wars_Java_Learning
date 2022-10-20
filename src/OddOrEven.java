public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int x: array) {
            sum += x;
        }
        if (sum%2 == 1) {
            return "odd";
        }
        else {
            return "even";
        }
    }

    public static void main(String[] args) {
        int[] numArr = {1,2,3,4,5};
        System.out.println(oddOrEven(numArr));
    }
}
