import java.util.Scanner;

public class test {

    // 1. Print odd numbers
    public static void odd(int a) {
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // 2. Convert days to years, months, days
    public static void Nofdays(int d) {
        int y = d / 365;
        int ny = d % 365;
        int m = ny / 30;
        int da = ny % 30;

        System.out.println(d + " days = " + y + " years, " + m + " months, and " + da + " days.");
    }

    // 3. Word count
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
                while (i < len && a.charAt(i) != ' ' && a.charAt(i) != '\t' && a.charAt(i) != '\n') {
                    i++;
                }
            }
        }
    
        System.out.println("Word count: " + count);
    }
    

    // 4. Harshad number check
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

    // 5. Compound Interest
    public static void compoundInterest(double p, double r, double t) {
        double amount = p;
        for (int i = 0; i < (int)t; i++) {
            amount *= (1 + r / 100);
        }
    
        double ci = amount - p;
        System.out.println("Compound Interest: " + ci);
    }
        
    

    // 6. Palindrome Prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void isPalindromePrime(int n) {
        int reversed = 0, original = n;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        if (reversed == original && isPrime(original)) {
            System.out.println(original + " is a Palindrome Prime.");
        } else {
            System.out.println(original + " is NOT a Palindrome Prime.");
        }
    }

    // 7. Swap using temp
    public static void swapWithTemp(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }

    // 8. Swap without temp
    public static void swapWithoutTemp(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }

    // 9. Sum of first n natural numbers
    public static void sumNatural(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("Sum = " + sum);
    }

    // 10. Print factors
    public static void printFactors(int n) {
        System.out.print("Factors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 11. Cube of number
    public static void cube(int n) {
        System.out.println("Cube of " + n + " is " + (n * n * n));
    }

    // 12. Duck number
    public static void isDuck(int n) {
        String s = String.valueOf(n);
        if (s.contains("0") && s.charAt(0) != '0') {
            System.out.println(n + " is a Duck number.");
        } else {
            System.out.println(n + " is NOT a Duck number.");
        }
    }

    // 13. Multiplication tables 1 to 10
    public static void printTables() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("---------------");
        }
    }

    // 14. Sum of squares of digits
    public static void sumSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        System.out.println("Sum of squares of digits: " + sum);
    }

    // 15. Count uppercase and lowercase
    public static void countCase(String s) {
        int upper = 0, lower = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            if (Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
    }

    // 16. Kaprekar number
    public static void isKaprekar(int n) {
        int sq = n * n;
        String str = String.valueOf(sq);
        for (int i = 1; i < str.length(); i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));
            if (right != 0 && left + right == n) {
                System.out.println(n + " is a Kaprekar number.");
                return;
            }
        }
        if (n == 1) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is NOT a Kaprekar number.");
        }
    }

    // 17. Reverse integer (no string)
    public static void reverseInt(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }

    // 18. Fibonacci series
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

    // 19. ASCII value
    public static void asciiValue(char c) {
        System.out.println("ASCII value of '" + c + "' is " + (int) c);
    }

    // Main method to test everything
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        odd(10);
        Nofdays(800);
        wc("This is a simple Java program.");
        isHarshad(18);
        compoundInterest(1000, 5, 3);
        isPalindromePrime(131);
        swapWithTemp(10, 20);
        swapWithoutTemp(15, 25);
        sumNatural(10);
        printFactors(28);
        cube(3);
        isDuck(120);
        printTables();
        sumSquares(123);
        countCase("HelloWorld123");
        isKaprekar(45);
        reverseInt(1234);
        fibonacci(10);
        asciiValue('A');

        sc.close();
    }
}
