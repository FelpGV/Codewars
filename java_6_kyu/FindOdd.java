package java_6_kyu;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        int oddNumbber = 0;
        Map<Integer, Integer> repetitions = new HashMap<>();
        for(int num : a){
            if(repetitions.containsKey(num)){
                repetitions.put(num, repetitions.get(num) + 1);
            } else {
                repetitions.put(num,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : repetitions.entrySet()){
            if (entry.getValue() % 2 != 0){
                oddNumbber = entry.getKey();
            }

        }
        return oddNumbber;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,3,4,3,3,3,2,2,1};
        int solution = findIt(a);
        System.out.println(solution);
    }

}
