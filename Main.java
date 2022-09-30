package BankingApplication;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private void runApplication(){
        HashMap<Integer, AccountInfo> map = new HashMap<Integer, AccountInfo>();
        map.put(1010101, new AccountInfo("Varun Dinesh", 1010101, 1234, 10000.0));
        map.put(2020202, new AccountInfo("Rakshan", 2020202, 2345, 12000.0));
        map.put(3030303, new AccountInfo("Suresh", 3030303, 3456, 10870.0));
        map.put(4040404, new AccountInfo("Divya", 4040404, 4567, 9000.0));
        map.put(5050505, new AccountInfo("Mathan", 5050505, 5678, 8500.0));
        Scanner scan = new Scanner(System.in);
        a:while (true) {
            System.out.println("                   ATM Application");
            System.out.print("---------------------------------------------------------------");
            System.out.print("\nEnter Account No : ");
            int account = scan.nextInt();
            System.out.print("Enter the 4 digit pin :");
            int pin = scan.nextInt();
            if (map.containsKey((Integer) account)) {
                for (AccountInfo i : map.values()) {
                    if (i.getPinNum() == pin && i.getCustomerAccountNo() == account) {
                        AccountTransaction object = new AccountTransaction();
                        object.accountTransaction(i);
                        System.out.println("        Thanking You :)    ");
                        break a;
                    }
                }
            }
            System.out.println("Enter a valid Account Number and Password");
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.runApplication();
    }
}

