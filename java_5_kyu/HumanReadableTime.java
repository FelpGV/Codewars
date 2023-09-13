package java_5_kyu;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String hours = String.valueOf((seconds/3600 > 0) ? (seconds/3600 > 9) ? seconds/3600 : "0"+seconds/3600 : "00");
        String minutes = String.valueOf((seconds%3600 > 59) ? ((seconds/60)%60 > 9) ? (seconds/60)%60 : "0" + (seconds/60)%60 : "00");
        return hours+":"+minutes+":"+((seconds%60 > 9) ? seconds%60 : "0" + seconds%60);
    }

    public static String makeReadable2(int seconds) {
        return String.format("%02d:%02d:%02d", seconds/ 3600, (seconds/60)%60, seconds%60);
    }

    public static void main(String[] args) {
        int seconds = 3661;
        String solution = makeReadable2(seconds);
        System.out.println(solution);
    }
}
