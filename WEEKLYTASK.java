import java.util.Scanner;
/* 1.Write a Java program to input your full name and print a greeting message. */
public class WEEKLYTASK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Hello, " + fullName + "! Welcome to the Java programming world.");
        scanner.close();
    }
}