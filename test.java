import java.util.Scanner;

public class test {
    // 1
    public static void odd(int n) {
        System.out.print("Odd numbers up to " + n + ": ");
        for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
            }
        }
    

    // 2
    public static void Nofdays(int d) {
        int y = d / 365;
        int ny = d % 365;
        int m = ny / 30;
        int da = ny % 30;
        System.out.println(d + " days = " + y + " years, " + m + " months, and " + da + " days.");
    }

    // 3
    public static void wc(String a) {
        int count = 0;
        int i = 0;
        int len = a.length();
    
        while (i < len) {
            while (i < len && (a.charAt(i) == ' ' || a.charAt(i) == '\t' || a.charAt(i) == '\n')) {
                i++;
            }
    
            if (i < len) {
                count++;
                            }
        }
        System.out.println("Word count: " + count);
    }

    // 4
    public static void isHarshad(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is NOT a Harshad number.");
        }
    }

    // 5
    public static void compoundInterest(double p, double r, double t) {
        double amount = p;
        for (int i = 0; i < (int)t; i++) {
            amount *= (1 + r / 100);
        }
        double ci = amount - p;
        System.out.println("Compound Interest: " + ci);
    }

    // 7
    public static void swapWithTemp(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }

    // 8
    public static void swapWithoutTemp(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }

    // 9
    public static void sumNatural(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("Sum = " + sum);
    }

    // 10
    public static void printFactors(int n) {
        System.out.print("Factors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 11
    public static void cube(int n) {
        System.out.println("Cube of " + n + " is " + (n * n * n));
    }

    // 12
    public static void isDuck(int n) {
        String s = String.valueOf(n);
        if (s.contains("0") && s.charAt(0) != '0') {
            System.out.println(n + " is a Duck number.");
        } else {
            System.out.println(n + " is NOT a Duck number.");
        }
    }

    // 13
    public static void printTables() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("---------------");
        }
    }

    // 14
    public static void sumSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        System.out.println("Sum of squares of digits: " + sum);
    }

    // 15
    public static void countCase(String s) {
        int upper = 0, lower = 0, digits = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upper++;
            } else if (Character.isLowerCase(c)) {
                lower++;
            } else if (Character.isDigit(c)) {
                digits++;
            }
        }
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digits);
    }

    // 17
    public static void reverseInt(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }

    // 18
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // 19
    public static void asciiValue(char c) {
        int ascii = (int) c;
        System.out.println("ASCII value of '" + c + "' is: " + ascii);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        odd(10);
        Nofdays(800);
        wc("This is a simple Java program.");
        isHarshad(18);
        compoundInterest(1000, 5, 3);
        swapWithTemp(10, 20);
        swapWithoutTemp(15, 25);
        sumNatural(10);
        printFactors(28);
        cube(3);
        isDuck(120);
        printTables();
        sumSquares(123);
        countCase("HelloWorld123");
        reverseInt(1234);
        fibonacci(10);
        asciiValue('A');

        sc.close();
    }
}