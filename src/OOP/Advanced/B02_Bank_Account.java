package OOP.Advanced;

import java.util.Scanner;

public class B02_Bank_Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Account2[] accountList = new Account2[n];

        for (int i = 0; i < n; i++) {
            accountList[i] = new Account2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
    }
}

class Account2 {
    private String ID;
    private String customerID;
    private String accNumber;
    private String pin;
    private long soDU;

    public Account2(String ID, String customerID, String accNumber, String pin, long soDU) {
        this.ID = ID;
        this.customerID = customerID;
        this.accNumber = accNumber;
        this.pin = pin;
        this.soDU = soDU;
    }


}
