package java_7_kyu;

import java.util.Arrays;
import java.util.stream.Stream;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        String[] numbersList = numbers.split(" ");
        int highest = Integer.parseInt(numbersList[0]);
        int lowest = Integer.parseInt(numbersList[0]);
        for(String number : numbersList){
            if(highest < Integer.parseInt(number)){
                highest = Integer.parseInt(number);
            }
            if(lowest > Integer.parseInt(number)){
                lowest = Integer.parseInt(number);
            }
        }
        return highest + " " + lowest;
    }

    public static String highAndLow2(String numbers) {
        String[] numbersList = numbers.split(" ");
        int highest = Arrays.stream(numbersList).mapToInt(Integer::valueOf).max().orElse(0);
        int lowest = Arrays.stream(numbersList).mapToInt(Integer::valueOf).min().orElse(0);

        return highest + " " + lowest;
    }


    public static void main(String[] args) {
        String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        String solution = highAndLow2(numbers);
        System.out.println(solution);
    }

}
