package java_5_kyu;
public class RGBToHexConversion {
    public static String rgb(int r, int g, int b) {
        String hex = "";
        hex = getString(r, hex);
        hex = getString(g, hex);
        hex = getString(b, hex);
        return hex;
    }

    private static String getString(int b, String hex) {
        hex += (b > 255) ? "F" : (b < 10) ? "0" : (b/16 > 9) ? Integer.toHexString(b/16).toUpperCase() : String.valueOf(b / 16);
        hex += (b > 255) ? "F" : (b < 0) ? "0" : (b%16 > 9) ? Integer.toHexString(b%16).toUpperCase() : String.valueOf(b % 16);
        return hex;
    }

    public static void main(String[] args) {
        int r = 42;
        int g = 2;
        int b = 3;
        String solution = rgb(r,g,b);
        System.out.println(solution);
    }
}
