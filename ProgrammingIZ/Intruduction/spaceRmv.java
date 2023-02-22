package ProgrammingIZ.Intruduction;

public class spaceRmv {
    public static void main(String[] args) {
        String sentence = "Thi s n f dfs jfis dnsf sns       sfsfs se f sdf            dss";
        String newStr = sentence.replaceAll("\\s", "");
        System.out.println(newStr);
    }
}
