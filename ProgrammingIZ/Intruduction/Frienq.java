package ProgrammingIZ.Intruduction;

public class Frienq {
    public static void main(String[] args) {
        String str = "This is this";
        char ch = 'i';
        int Frienq = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                Frienq++;
            }
        }
        System.out.println(Frienq);
    }
}
