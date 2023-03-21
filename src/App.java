public class App {
    public static void main(String[] args) throws Exception {
        int number = 8;
        for (int i = 1; i <= number; i++) {
            String line = "";
            for (int j = 0; j < i; j++) {
                line = line + i;
            }
            System.out.println(line);
        }
    }
}
