public class IsTriangle {
    public static boolean isTriangle(int a, int b, int c){
        if ((a>=b) && (a>=c) && (a<(b+c))) {
            return true;
        }
        else if ((b>=a) && (b>=c) && (b<(a+c))) {
            return true;
        }
        else if ((c>=b) && (c>=a) && (c<(b+a))) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isTriangle(1,2,2));
    }
}
