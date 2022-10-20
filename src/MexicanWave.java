import java.util.*;

public class MexicanWave {
    public static String[] wave(String str) {
        String[] waveArray = new String[str.length()];
        for (int x=0; x<str.length(); x++) {
            char upper_case = Character.toUpperCase(str.charAt(x));
            String wavePart = str.replace(str.charAt(x), upper_case);
            waveArray[x] = wavePart;
        }
        return waveArray;
    }
    public static void main(String[] args) {
        String[] waveArray = wave("mexican wave");
        for (String x:waveArray) {
            System.out.println(x);
        }
    }
}
