public class Queues {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0) {
            return 0;
        }
        else {
            int total = 0;
            for (int x:customers) {
                total = total + x;
            }
            total = total / n;
            return total;
        }
    }
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue((new int[] {2}), 2));
    }
}
