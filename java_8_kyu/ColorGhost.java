package java_8_kyu;

import java.util.Random;

public class ColorGhost {
    public static class Ghost {
        String color;

        public Ghost() {
            this.color = randomColor();
        }

        private String randomColor() {
            String[] colors = {"white","yellow","purple","red"};
            Random random = new Random();
            int randomColor = random.nextInt(colors.length);
            return colors[randomColor];
        }

        public String getColor() {
            return this.color;
        }
    }

    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());

    }

}


