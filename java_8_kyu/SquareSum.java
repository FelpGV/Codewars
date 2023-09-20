package java_8_kyu;

public class SquareSum {
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for(int number : n){
            sum += number*number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] n = {1,2,2};
        int result = squareSum(n);
        System.out.println(result);
    }
}
