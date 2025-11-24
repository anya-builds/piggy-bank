package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to console bank!");
        System.out.println("""
                1) Open Account
                2) Deposit
                3) Withdraw
                4) Transfer
                5) Account Statement 
                6) List Accounts
                7) Search Accounts by Customer Name
                8) Exit
                """);
        System.out.println("CHOOSE: ");
        String choice=scanner.nextLine().trim();
        System.out.println("CHOICE: "+choice);
    }
}
