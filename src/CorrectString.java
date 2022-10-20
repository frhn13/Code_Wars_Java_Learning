public class CorrectString {
    public static String correct(String string) {
        string = string.replace("0", "O");
        string = string.replace("5", "S");
        string = string.replace("1", "I");
        return string;
    }
    public static void main(String[] args) {
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        System.out.println(correct("ERNE5T HEM1NGWAY - A FARWELL T0 ARM5"));
    }
}
