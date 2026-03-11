




import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        printBanner("OOPS", patternMap);
    }

    public static void printBanner(String word, Map<Character, String[]> map) {

        for (int i = 0; i < 5; i++) {

            for (char c : word.toCharArray()) {
                System.out.print(map.get(c)[i] + " ");
            }

            System.out.println();
        }
    }
}