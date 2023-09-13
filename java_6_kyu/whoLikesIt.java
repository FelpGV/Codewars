package java_6_kyu;

public class whoLikesIt {
    public static String whoLikesIt_(String... names) {
        String who = (names.length == 0) ? "no one" : "";
        if(names.length == 1) { who = names[0];}
        if(names.length == 2) { who = names[0] + " and " + names[1];}
        if(names.length == 3) { who = names[0] + ", " + names[1] + " and " + names[2];}
        if(names.length > 3) { who = names[0] + ", " + names[1] + " and " + (names.length-2) + " others" ;}
        return who + ((names.length > 1) ? " like this" : " likes this");
    }

    public static void main(String[] args) {
        String[] names = {"Alex", "Jacob", "Mark", "Max"};
        String solution = whoLikesIt_(names);
        System.out.println(solution);
    }
}
