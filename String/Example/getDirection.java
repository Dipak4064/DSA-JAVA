package String.Example;

import static java.lang.Math.sqrt;

public class getDirection {
    public static int getPath(String str) {
        int n = str.length();
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            char dir = str.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'S') {
                y--;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (int) sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getPath(str));
    }
}
