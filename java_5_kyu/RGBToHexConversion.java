package java_5_kyu;
public class RGBToHexConversion {
    public static String rgb(int r, int g, int b) {
        String hex = "";
        hex += (r > 255) ? "F" : (r < 10) ? "0" : (r/16 > 9) ? Integer.toHexString(r/16).toUpperCase() : String.valueOf(r / 16);
        hex += (r > 255) ? "F" : (r < 0) ? "0" :  (r%16 > 9) ? Integer.toHexString(r%16).toUpperCase() : String.valueOf(r % 16);
        hex += (g > 255) ? "F" : (g < 10) ? "0" : (g/16 > 9) ? Integer.toHexString(g/16).toUpperCase() : String.valueOf(g / 16);
        hex += (g > 255) ? "F" : (g < 0) ? "0" : (g%16 > 9) ? Integer.toHexString(g%16).toUpperCase() : String.valueOf(g % 16);
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
