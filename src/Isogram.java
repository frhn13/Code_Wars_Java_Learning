public class Isogram {
    public static boolean isIsogram(String str) {
        boolean iso = true;
        for (int x=0; x<str.length(); x++) {
            for (int y=0; y<str.length(); y++) {
                if (str.charAt(x) == str.charAt(y) && x!=y) {
                    iso = false;
                }
            }
        }
        return iso;
    }
    public static void main(String[] args) {
        System.out.println(isIsogram("Ii"));
    }
}
