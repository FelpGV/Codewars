package java_5_kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        List<String> newWordsList = new ArrayList<>();
        for (String word : words){
            String newWord = "";
            if ((word.charAt(0) >= 'a' && word.charAt(0) <= 'z' )|| (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')){
                for (int i = 1; i < word.length(); i++) {
                    newWord += word.charAt(i);
                }
                newWord += word.charAt(0) + "ay";
                newWordsList.add(newWord);
            } else {
                newWordsList.add(word);
            }

        }
        return String.join(" ", newWordsList);
    }


    public static String pigIt2(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String str = "Hello world !";
        String solution = pigIt(str);
        System.out.println(solution);
    }
}
