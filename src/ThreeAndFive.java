public class ThreeAndFive {
    public static int solution(int number) {
        int sum = 0;
        for (int x=0; x<number; x++) {
            if(x%3==0 || x%5==0) {
                sum += x;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
