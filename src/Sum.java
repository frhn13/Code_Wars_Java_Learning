public class Sum {
    public static int GetSum(int a, int b) {
        int sum = 0;
        if (a>b) {
            for(int x=b; x<=a; x++) {
                sum += x;
            }
        }
        else {
            for(int x=a; x<=b; x++) {
                sum += x;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(GetSum(5,5));
    }
}
