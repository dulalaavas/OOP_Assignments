import java.util.Scanner;
public class Q1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String x = sc.nextLine();

        String y = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            y += x.charAt(i);
        }

        System.out.println("Reversed word: " + y);

        sc.close();
    }
}
