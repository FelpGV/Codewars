package java_7_kyu;

import java.util.HashMap;

public class Isograms {
    public static boolean  isIsogram(String str) {
        HashMap<Character, Integer> str_ = new HashMap<>();
        for(char letter : str.toLowerCase().toCharArray()){
            if(str_.containsKey(letter)){
                return false;
            } else {
                str_.put(letter,1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "moOse";
        boolean result = isIsogram(str);
        System.out.println(result);
    }

}
