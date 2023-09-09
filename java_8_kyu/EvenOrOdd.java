package java_8_kyu;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int number = 7;
        String solution = even_or_odd(number);
        System.out.println(solution);
    }
}
