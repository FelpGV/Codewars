package java_7_kyu;

public class SquareDigit {
    public static int squareDigits(int n) {
        String numbers = Integer.toString(n);
        String digits = "";
        for (int number : numbers.toCharArray()){
            digits += (int)Math.pow(Character.getNumericValue(number),2);
        }
        return Integer.parseInt(digits);
    }

    public static void main(String[] args) {
        int n = 765;
        int solution = squareDigits(n);
        System.out.println(solution);
    }
}
