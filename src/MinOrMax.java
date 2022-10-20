public class MinOrMax {
    public static int min(int[] list) {
        int minVal = list[0];
        for (int x: list) {
            if (x<minVal) {
                minVal = x;
            }
        }
        return minVal;
    }

    public static int max(int[] list) {
        int maxVal = list[0];
        for (int x: list) {
            if (x>maxVal) {
                maxVal = x;
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        System.out.println(max(new int[] {1,2,3,4,5}));
        System.out.println(min(new int[] {1,2,3,4,5}));
    }
}
