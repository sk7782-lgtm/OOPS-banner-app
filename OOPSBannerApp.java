




import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        printBanner("OOPS");
    }

    public static void initializePatterns() {

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

    }

    public static void printBanner(String word) {

        for (int i = 0; i < 5; i++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);
                System.out.print(pattern[i] + " ");

            }

            System.out.println();
        }
    }
}