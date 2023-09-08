package java_6_kyu;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Multiples_of_3_or_5 {
    public static int solution(int number) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 3; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                multiples.add(i);
            }
        }
        int sum = 0;
        for (int n : multiples){
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        int number = 15;
        int solution = solution(number);
        System.out.println(solution);

    }
}
