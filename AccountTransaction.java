package BankingApplication;

import java.util.Scanner;

public class AccountTransaction {
    public void accountTransaction(AccountInfo i) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
        System.out.println("                Welcome " + i.getCustomerName());
        System.out.println("---------------------------------------------------------------");
        int loop;
        do {
            System.out.println("Press 1 for Deposit");
            System.out.println("Press 2 for Withdraw");
            System.out.println("Press 3 for Check Balance");
            System.out.println("Press 4 for Exit");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Enter : ");
            loop = scan.nextInt();
            switch (loop) {
                case 1:
                    System.out.println("Current Balance : " + i.getBalance());
                    System.out.print("Enter the amount : ");
                    int amount = scan.nextInt();
                    i.setBalance(i.getBalance() + amount);
                    System.out.println("\nYour Money has been successfully deposited");
                    System.out.println("Now Balance : " + i.getBalance());
                    System.out.println("---------------------------------------------------------------");

                    break;
                case 2:
                    System.out.println("Current Balance : " + i.getBalance());
                    System.out.print("Enter the amount : ");
                    amount = scan.nextInt();
                    if (amount < i.getBalance()) i.setBalance(i.getBalance() - amount);
                    else {
                        System.out.println("\"Insufficient Balance\"\n");
                        break;
                    }
                    System.out.println("Please collect your money");
                    System.out.println("\nAmount withdraw Successfully");
                    System.out.println("Now Balance : " + i.getBalance());
                    System.out.println("---------------------------------------------------------------");

                    break;
                case 3:
                    System.out.println("Account Number : " + i.getCustomerAccountNo());
                    System.out.println("Name : " + i.getCustomerName());
                    System.out.println("Balance : " + i.getBalance());
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please give the valid option");

            }
        } while (loop != 4);

    }
}
