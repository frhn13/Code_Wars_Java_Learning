public class UpperCase {
    public static String abbrevName(String name) {
        String initials="";
        for (int x=0; x<name.length(); x++) {
            if(x==0) {
                initials+=(String.valueOf(name.charAt(x))).toUpperCase();
            }
            if (name.charAt(x)==' ') {
                initials+=".";
                initials+=(String.valueOf(name.charAt(x+1))).toUpperCase();
            }
        }
        return initials;
    }
    public static void main(String[] args) {
        String initials = abbrevName("joe fej");
        System.out.println(initials);
    }
}
