package java_6_kyu;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String hour = String.valueOf((seconds/3600 > 0) ? (seconds/3600 > 9) ? seconds/3600 : "0"+seconds/3600 : "00");
        String minutes = String.valueOf((seconds%3600 > 59) ? ((seconds%3600)/60 > 9) ? (seconds%3600)/60 : "0" + (seconds%3600)/60 : "00");
        return hour+":"+minutes+":"+((seconds%60 > 9) ? seconds%60 : "0" + seconds%60);
    }

    public static void main(String[] args) {
        int seconds = 3600;
        String solution = makeReadable(seconds);
        System.out.println(solution);
    }
}
