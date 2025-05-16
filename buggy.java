// Buggy Java Code: Simple Banking System (with bugs)
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();
                    bank.createAccount(name);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int accNum = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depAmt = sc.nextInt();
                    bank.deposit(accNum, depAmt);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int accNumW = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withAmt = sc.nextInt();
                    bank.withdraw(accNumW, withAmt);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}

class Bank {
    List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String name) {
        Account acc = new Account(name);
        accounts.add(acc);
        System.out.println("Account created! Account number: " + acc.getAccountNumber());
    }

    public void deposit(int accNum, double amount) {
        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.deposit = amount; // BUG: Should be acc.deposit(amount)
            System.out.println("Deposited " + amount + " to account " + accNum);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accNum, double amount) {
        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.withdraw(amount);
            System.out.println("Withdrawn " + amount + " from account " + accNum);
        } else {
            System.out.println("Account not found.");
        }
    }

    private Account findAccount(int accNum) {
        for (Account a : accounts) {
            if (a.accountNumber == accNum) { // should use a.getAccountNumber()
                return a;
            }
        }
        return null;
    }
}

class Account {
    private static int count = 1000;
    public int accountNumber;
    public String holderName;
    public double balance;

    public Account(String name) {
        holderName = name;
        accountNumber = count++;
        balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amt) {
        if (amt < 0) {
            System.out.println("Negative deposit not allowed.");
        } else
            balance += amt;
    }

    public void withdraw(double amt) {
        if (amt < 0 || amt > balance)
            System.out.println("Invalid withdrawal.");
        else
            balance =- amt; // BUG: should be balance -= amt;
    }
}

       
