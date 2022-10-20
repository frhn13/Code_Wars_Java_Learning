public class RepeatString {
    public static String repeatStr(final int repeat, final String string) {
        String repeatedString = "";
        for (int x=0; x<repeat; x++) {
            repeatedString += string;
        }
        return repeatedString;
    }
    public static void main(String[] args) {
        System.out.println(repeatStr(5,"Hotel"));
    }
}
