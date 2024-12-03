// This program designs an ATM machine that can be used to withdraw, deposit and check balance
import java.util.Scanner;
public class AtmInterface {
    static BankAccount currentBalance = new BankAccount();
    static Scanner scanner = new Scanner(System.in); 
    public static void deposit(double amount){

        AtmInterface.currentBalance.initialAmount += amount;
        System.out.println("Deposit successful. Your new balance is: " + AtmInterface.currentBalance.initialAmount + "\nWhat other transaction do you want to make?");
    }
    public static void withdraw(double amount){
        if(AtmInterface.currentBalance.initialAmount < amount){
            System.out.println("Insufficient funds. Your current balance is: " + AtmInterface.currentBalance.initialAmount + "\nWhat other transaction do you want to make?");
        } else {
            AtmInterface.currentBalance.initialAmount -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + AtmInterface.currentBalance.initialAmount + "\nWhat other transaction do you want to make?");
        }
    }
    public static void checkBalance(){
        System.out.println("Your current balance is: " + AtmInterface.currentBalance.initialAmount + "\nWhat other transaction do you want to make?");
    }
}
