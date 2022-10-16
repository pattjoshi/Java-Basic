
/*
* naprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.
* (Hint : area of a square is (side x side))
*/
import java.util.Scanner;

public class SideofaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int square = sc.nextInt();
        int area = square * square;
        System.out.println("Area of a square is :- " + area);
        sc.close();
    }

}
