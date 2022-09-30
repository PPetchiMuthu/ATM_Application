package BankingApplication;

public class AccountInfo {
    private double balance;
    private String customerName;
    private int customerAccountNo;
    private int pinNum;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public int getCustomerAccountNo() {
        return customerAccountNo;
    }

    public void setCustomerAccountNo(int customerAccountNo) {
        this.customerAccountNo = customerAccountNo;
    }


    public int getPinNum() {
        return pinNum;
    }

    public void setPinNum(int pinNum) {
        this.pinNum = pinNum;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public AccountInfo(String customerName, int customerAccountNo, int pinNum, double balance) {
        this.customerName = customerName;
        this.customerAccountNo = customerAccountNo;
        this.pinNum = pinNum;
        this.balance = balance;
    }


}
