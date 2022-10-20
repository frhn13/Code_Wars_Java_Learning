public class YesOrNo {
    public static String boolToWord(boolean b) {
        if (b==true) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
    public static void main(String[] args) {
        System.out.println(boolToWord(true));
    }
}
