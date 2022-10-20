public class CamelCase {
    public static String camelCase(String input) {
        for (int x=0; x<input.length(); x++) {
            if (Character.isUpperCase(input.charAt(x))) {
                char lower_case = Character.toLowerCase(input.charAt(x));
                input = input.replace(input.charAt(x), lower_case);
                StringBuffer stringBuffer = new StringBuffer(input);
                stringBuffer.insert(x, ' ');
                input = String.valueOf(stringBuffer);
            }
        }
        return input;
    }
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }
}
