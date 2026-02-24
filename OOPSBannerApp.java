public class OopsBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    // Static method to print OOPS banner
    public static void printBanner() {

        String line1 = String.join("",
                "  OOOOO   ",
                "  OOOOO   ",
                "  PPPPPP  ",
                "  PPPPPP  ",
                "  SSSSSS  "
        );

        String line2 = String.join("",
                " O     O  ",
                " O     O  ",
                " P     P ",
                " P     P ",
                " S       "
        );

        String line3 = String.join("",
                " O     O  ",
                " O     O  ",
                " PPPPPP  ",
                " PPPPPP  ",
                "  SSSSS  "
        );

        String line4 = String.join("",
                " O     O  ",
                " O     O  ",
                " P       ",
                " P       ",
                "       S "
        );

        String line5 = String.join("",
                "  OOOOO   ",
                "  OOOOO   ",
                " P        ",
                " P        ",
                "  SSSSSS  "
        );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}