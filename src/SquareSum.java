public class SquareSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int x:n) {
            sum = (int) (sum + Math.pow(x,2));
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {1,2,2}));
    }
}
