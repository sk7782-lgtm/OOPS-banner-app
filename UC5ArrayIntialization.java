
public class UC5ArrayInitialization {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", "O", "O", "P", "S", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}