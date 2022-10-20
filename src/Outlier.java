public class Outlier {
    public static int find(int[] integers) {
        int numOdd = 0;
        int numEven = 0;
        int answer = 0;
        for (int x:integers) {
            if (x%2==1) {
                numOdd += 1;
            }
            else {
                numEven += 1;
            }
        }
        if (numEven>2) {
            for (int x:integers) {
                if (x%2==1) {
                    answer = x;
                }
            }
        }
        else {
            for (int x: integers) {
                if (x % 2 == 0) {
                    answer = x;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] exampleTest1 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        System.out.println(find(exampleTest1));
    }
}
