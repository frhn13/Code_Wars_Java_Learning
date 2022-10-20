public class SameSquare {
    public static boolean comp(int[] a, int[] b) {
        for(int x:a) {
            boolean squared = false;
            for (int y:b) {
                if (Math.pow(x, 2) == y) {
                    squared = true;
                }
            }
            if (squared == false) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = new int[] {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int[] c = new int[]{1,2,3};
        int[] d = new int[]{1,4,9};
        System.out.println(comp(a,b));
        System.out.println(comp(c,d));
    }
}
