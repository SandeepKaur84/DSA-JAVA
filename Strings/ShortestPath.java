package Strings;

public class ShortestPath {

    public static void findShortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        float path = (float) Math.sqrt(x2 + y2);
        System.out.println(path);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        findShortestPath(str);
    }
}
