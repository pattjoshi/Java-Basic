public class Accmod {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Om prakash";
        myAcc.setPassWord("om0,,9");

    }
}

class BankAccount {
    public String userName;
    private String password;

    public void setPassWord(String pws) {
        pws = password;
    }
}
