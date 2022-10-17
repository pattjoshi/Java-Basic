import java.util.Scanner;

// WriteaJavaprogramto inputweeknumber(1-7)andprintdayofweeknameusing switch case

public class weekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tusday");
                break;
            case 3:
                System.out.println("wedDay");
                break;
            case 4:
                System.out.println("ThuDay");
                break;
            case 5:
                System.out.println("FryDay");
                break;
            case 6:
                System.out.println("SutDay");
                break;
            case 7:
                System.out.println("SunDay");
                break;
            default:
                System.out.println("Please enter Day Between 1 to 7 , Thank You !");
        }
        sc.close();
    }
}
