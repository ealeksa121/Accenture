package day3.task3;

public class BankAccount {

    double balance = 1000000000.45;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double showBalance() {
       return balance;
    }

    public void depositMoney(double addingAmount) {
        if (addingAmount < 0) {
            System.out.println("You can't add negative amount of money");
        } else if (addingAmount >= 5000) {
            System.out.println("You cant deposit more than 5000$ in one day");
        } else {
            System.out.println("You have added " + addingAmount + "$ to your balance");
            balance += addingAmount;
        }
    }

    public void withdrawMoney(double withdrawAmount) {
        if (withdrawAmount > balance) {
            balance = balance - withdrawAmount;
            System.out.println("You withdraw this amount: " + withdrawAmount);
            System.out.println("Your balance now is:  " + balance);
        } else {
            System.out.println("Withdraw unsuccessful, balance is not enough to withdraw needed amount ");
        }
    }

    public void transferMoney(double transferAmount, BankAccount transferBankAcc) {
        if (transferAmount > balance) {
            transferBankAcc.depositMoney(transferAmount);
        } else {
            System.out.println("You don't have enough money in your bank account to make a transfer");
        }
    }


}
