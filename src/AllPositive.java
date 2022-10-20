public class AllPositive {
    public static int sum(int[] arr) {
        int total = 0;
        for (int x: arr) {
            if (x>=0) {
                total += x;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,-3,4,5}));
    }
}
