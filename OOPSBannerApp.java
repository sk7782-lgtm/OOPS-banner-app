public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            " *****     *****     *****      *****  ",
            "*     *   *     *   *     *    *     * ",
            "*     *   *     *   *     *    *        ",
            "*     *   *     *   *****       *****   ",
            "*     *   *     *   *               *   ",
            "*     *   *     *   *         *     *    ",
            " *****     *****    *          *****     "

        };

        for (String row : banner) {
            System.out.println(row);
        }
    }
}