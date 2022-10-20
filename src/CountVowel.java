public class CountVowel {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int x=0; x<str.length(); x++) {
            if (str.charAt(x)=='a' || str.charAt(x)=='e' || str.charAt(x)=='i' || str.charAt(x)=='o' || str.charAt(x)=='u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
}
