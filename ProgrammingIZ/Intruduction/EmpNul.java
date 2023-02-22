package ProgrammingIZ.Intruduction;

public class EmpNul {
    public static String IsEmpNull(String str) {
        if (str == null) {
            return "null";
        } else if (str.trim().isEmpty()) {
            return "Empty";
        }
        return "neither NULL nor EMPTY";
    }

    public static void main(String[] args) {
        String str = "       ";
        System.out.println(IsEmpNull(str));

    }
}
