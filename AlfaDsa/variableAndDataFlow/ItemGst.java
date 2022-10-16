
/*
 * Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill
 * 
 * (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
 */

import java.util.Scanner;

public class ItemGst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pan = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        // with out gst
        float total = pan + pencil + eraser;
        System.out.println(total);
        // New bill 18% GST
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% Text:- " + newTotal);
        sc.close();
    }

}

/*
 * 3 number input float
 * Output = cost of total
 * make new bill with 18% GST
 */