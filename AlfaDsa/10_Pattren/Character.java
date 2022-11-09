public class Character {
    public static void main(String[] args) {
        int NL = 4;
        char ch = 'A';
        for (int line = 1; line <= NL; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++; // this only change in the block scope
            }
            System.out.println();
        }
    }

    public static char toUpperCase(char charAt) {
        return 0;
    }
}

/*
 * QUASTINE:-
 * A
 * BC
 * DEF
 * GHIJ
 */
