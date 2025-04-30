import java.util.Scanner;

public class WEEKLYTASK2_MAY3{
    public static void odd(int a){
        for (int i = 1; i<=a; i++){
            if(i%2!=0) {
                System.out.println(i);
            }
        }

    }


    public static void Nofdays(int d) {
        int y = d / 365;
        int ny = d % 365;
        
        int m = ny / 30;
        int da = ny % 30;
    
        System.out.println(d + " days = " + y + " years, " 
            + m + " months, and " + da + " days.");
        }

    public static void wc(String a){
            
    
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        odd(a);

        System.out.print("Enter the number of Days: ");
        int d = sc.nextInt();
        Nofdays(d);

        sc.close();
    }
}