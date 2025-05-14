import java.util.Scanner;

public class Task_May14{
    static void arrayAvgChe(){
        Scanner sc = new Scanner(System.in);

        int[] oneDArray = new int[5];
        int total = 0;

        for(int i = 0;i<oneDArray.length;i++){
            System.out.print("Enter array element: ");
            int a = sc.nextInt();
            oneDArray[i]=a;
            total = total + oneDArray[i];
        }
        int avg = total/5;
        System.out.print("Average value is " + avg);
    }
    public static void main(String[] args) {
        arrayAvgChe();
    }
}