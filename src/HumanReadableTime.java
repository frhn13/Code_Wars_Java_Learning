public class HumanReadableTime {
    public static String makeReadable(double seconds) {
        int final_hours;
        int final_minutes;
        int final_seconds;
        final_hours = Math.floorDiv((int) seconds,3600);
        seconds = (seconds/3600) - final_hours;
        final_minutes = Math.floorDiv((int) (seconds*60), 1);
        seconds = (seconds*60) - final_minutes;
        System.out.println(seconds);
        final_seconds = (int) (seconds*60);
        String new_time = String.format("%d:%d:%d", final_hours,final_minutes,final_seconds);
        return new_time;
    }
    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
    }
}
