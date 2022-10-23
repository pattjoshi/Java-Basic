import java.util.Scanner;

public class PalimDrum {
    // PalimDrum Number
    public static boolean isPalimDrum(int num) {
        int palimdrum = num;// copied number into variable
        int reverse = 0;
        while (palimdrum != 0) {
            int reminder = palimdrum % 10;
            reverse = reverse * 10 + reminder;
            palimdrum /= 10;
        }
        // if original and the reverse of number is qqual means
        // number is palimdrome
        if (num == reverse) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Plimdrum;
        System.out.println("Enter a Number");
        Plimdrum = sc.nextInt();
        if (isPalimDrum(Plimdrum)) {
            System.out.println(Plimdrum + " Palimdrum Number");
        } else {
            System.out.println(Plimdrum + " Not a palimdrun number");
        }
        sc.close();

    }
}

/*
 * Writea Javaprogram to check ifanumber is apalindromeinJava?(121isapalindrome,
 * 321 is not)
 */

// Stape 1:- Create a function Plimdrum
// Stape 2:- variabe decleare
// Stape 3:- int reminder, palim,reverse,palimdrun
// Stape 1:- get reminder %10
// Stape 1:- revrse = reverse *10 + reminder
// Stape 1:- Small the number ; palimdrum = palimdrum /10;
// Stape 1:- chack num == reverse
// Stape 1:- call in main function

/*
 * A number is call edapal indromeifthenumberisequaltothereverseofanumbere.g.,
 * 121isapalindromebecausethereverseof121is121itself.Ontheotherhand,
 * 321isnotapalindrome because the reverse of 321 is 123, which is not equal to
 * 321
 */