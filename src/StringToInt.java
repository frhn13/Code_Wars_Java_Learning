public class StringToInt {
    public static int stringToNumber(String str) {
        int num = Integer.parseInt(str);
        return num;
    }
    public static void main(String[] args) {
        String num = "1234";
        System.out.println(stringToNumber(num));
    }
}
