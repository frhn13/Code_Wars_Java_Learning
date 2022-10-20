import java.util.ArrayList;

public class SameArrays {
    public static ArrayList<Integer> arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> c = new ArrayList<>();
        for (int x=0;x<a.length;x++) {
            boolean exists = false;
            for (int y=0;y<b.length;y++) {
                if (a[x] == b[y]) {
                    exists = true;
                }
            }
            if (!exists) {
                c.add(a[x]);
            }
        }
        return c;
    }
    public static void main(String[] args) {
        ArrayList<Integer> c = arrayDiff(new int [] {1,2,3,4,5,6}, new int[] {1,2,5,6});
        for (Integer x:c) {
            System.out.println(x);
        }
    }
}
