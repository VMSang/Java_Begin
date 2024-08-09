package OOP.Advanced;

import java.util.Scanner;

public class B01_Account_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng tài khoản
        int n = sc.nextInt();
        sc.nextLine(); // Đọc ký tự newline sau khi đọc số nguyên

        Account[] accountList = new Account[n];

        // Nhập thông tin tài khoản
        for (int i = 0; i < n; i++) {
            String ID = sc.nextLine();
            String customerID = sc.nextLine();
            String username = sc.nextLine();
            String password = sc.nextLine();
            accountList[i] = new Account(ID, customerID, username, password);
        }

        // Kiểm tra đăng nhập
        int q = sc.nextInt();
        sc.nextLine(); // Đọc ký tự newline sau khi đọc số nguyên

        while (q-- > 0) {
            String username = sc.nextLine();
            String userpassword = sc.nextLine();
            boolean check = false;
            for (int i = 0; i < n; i++) {
                if (accountList[i].getUsername().equals(username) && accountList[i].getPassword().equals(userpassword)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login Failed");
            }
        }

        sc.close(); // Đóng Scanner khi không còn sử dụng
    }
}

class Account {
    private String ID;
    private String customerID;
    private String username;
    private String password;

    public Account() {
    }

    public Account(String ID, String customerID, String username, String password) {
        this.ID = ID;
        this.customerID = customerID;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
