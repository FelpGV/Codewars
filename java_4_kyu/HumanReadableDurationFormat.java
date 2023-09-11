package java_4_kyu;

import java.util.ArrayList;

public class HumanReadableDurationFormat {
    public static String formatDuration(int seconds) {
        ArrayList<String> durationList = new ArrayList<>();
        String duration = "";
        if (seconds >= 31536000) {
            int years = seconds / 31536000;
            if (years == 1) {
                durationList.add(years + " year");
            } else {
                durationList.add(years + " years");
            }
            seconds = seconds % 31536000;
        }

        if (seconds >= 86400) {
            int days = seconds / 86400;
            if (days == 1) {
                durationList.add(days + " day");
            } else {
                durationList.add(days + " days");
            }
            seconds = seconds % 86400;
        }

        if (seconds >= 3600) {
            int hours = seconds / 3600;
            if (hours == 1) {
                durationList.add(hours + " hour");
            } else {
                durationList.add(hours + " hours");
            }
            seconds = seconds % 3600;
        }

        if (seconds >= 60) {
            int minutes = seconds / 60;
            if (minutes == 1) {
                durationList.add(minutes + " minute");
            } else {
                durationList.add(minutes + " minutes");
            }
            seconds = seconds % 60;
        }

        if (seconds > 0) {
            if (seconds == 1) {
                durationList.add(seconds + " second");
            } else {
                durationList.add(seconds + " seconds");
            }
        }
        if(durationList.size() > 0){
            if(durationList.size() == 1){
                duration += durationList.get(0);
            } else {
                duration = String.join(", ", durationList.subList(0,durationList.size() - 1));
                duration += " and " + durationList.get(durationList.size() - 1);
            }

        }


        if (durationList.size() == 0) {
            duration = "now";
        }

        return duration;
    }

    public static void main(String[] args) {
        int seconds = 10;
        String solution = formatDuration(seconds);
        System.out.println(solution);

    }
}
