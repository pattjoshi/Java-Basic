
public class ArrayFunArg {
    public static void update(int mark[]) {
        for (int i = 0; i < mark.length; i++) {
            mark[i] = mark[i] + 1;
        }
    }

    public static void main(String[] args) {
        int mark[] = { 66, 55, 44 };
        update(mark);
        // Print the marks
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
        System.out.println();// next line
    }
}
// referance reflact the value in main function