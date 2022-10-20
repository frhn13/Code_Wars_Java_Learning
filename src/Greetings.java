public class Greetings {
    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }
    public static void main(String[] args) {
        String name = "Sierra";
        System.out.println(greet(name));
    }
}
