import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinToDen {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int den = 0;
        int power = binary.size()-1;
        for (int x=0; x<binary.size(); x++) {
            if (binary.get(x) == 1) {
                den += Math.pow(2, power);
            }
            power -= 1;
        }
        return den;
    }
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt((new ArrayList<>(Arrays.asList(1,0,0,1)))));
    }
}
