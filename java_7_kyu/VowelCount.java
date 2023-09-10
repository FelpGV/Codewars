package java_7_kyu;

import java.util.Objects;

public class VowelCount {
    public static int getCount(String str) {
        int count = 0;
        String[] chars =  str.split("");
        for (String c : chars){
            if (Objects.equals(c, "a") || Objects.equals(c, "e") ||
                    Objects.equals(c, "i") || Objects.equals(c, "o") ||
                    Objects.equals(c, "u")
            ){
                count++;
            }
        }
        return count;
    }
    public static int getCount2(String str) {
        int count = 0;
        for (char c : str.toCharArray()){
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }

    public static int getCount3(String str) {
        return (int)str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    public static void main(String[] args) {
        String str = "abracadabra";
        int solution = getCount3(str);
        System.out.println(solution);
    }
}
