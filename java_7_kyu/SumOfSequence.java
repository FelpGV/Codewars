package java_7_kyu;

public class SumOfSequence {
    public static int sequenceSum(int start, int end, int step) {
        int sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        int step = 3;
        int solution = sequenceSum(start,end,step);
        System.out.println(solution);
    }
}
