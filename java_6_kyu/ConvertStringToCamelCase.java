package java_6_kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s){
        String[] words = s.split("[_-]");
        for (int i = 1; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }
        return String.join("", words);
    }

    static String toCamelCase2(String s){
        String[] words = s.split("[_-]");
        return words[0] + Arrays.stream(words)
                .skip(1)
                .map(word -> Character.toUpperCase(word.charAt(0))+ word.substring(1))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "the-stealth_warrior";
        String solution = toCamelCase2(s);
        System.out.println(solution);
    }
}
