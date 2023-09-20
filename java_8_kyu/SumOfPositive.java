package java_8_kyu;

import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(n -> n >= 0).sum();
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,3,4,5};
        int result = sum(arr);
        System.out.println(result);
    }
}
