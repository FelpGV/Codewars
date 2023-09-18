package java_5_kyu;

import java.util.HashMap;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        HashMap<Character, Integer> str2Letters = new HashMap<>();
        for(char letter : str2.toCharArray()){
            if(str2Letters.containsKey(letter)){
                str2Letters.put(letter, str2Letters.get(letter) + 1);
            } else {
                str2Letters.put(letter,1);
            }
        }
        HashMap<Character, Integer> str1Letters = new HashMap<>();
        for(char letter : str1.toCharArray()){
            if(str1Letters.containsKey(letter)){
                str1Letters.put(letter, str1Letters.get(letter) + 1);
            } else {
                str1Letters.put(letter,1);
            }
        }
        for (Character letter : str2Letters.keySet()) {
            if(!str1Letters.containsKey(letter)){
                return false;
            }
            if (str1Letters.containsKey(letter) ){
                if (str1Letters.get(letter) < str2Letters.get(letter)){
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "scriptjavx";
        String str2 = "javascript";
        boolean solution = scramble(str1,str2);
        System.out.println(solution);
    }
}
