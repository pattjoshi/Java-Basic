/*    
* In a program,input3numbers:A,BandC.Youhaveto outputtheaverageofthese 3 numbers.
* 
* (Hint : Average of N numbers is sum of those numbers divided by N)
*/

import java.util.Scanner;

public class Avg3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (a + b + c) / 3;
        System.out.println(avg);
        sc.close();

    }
}
