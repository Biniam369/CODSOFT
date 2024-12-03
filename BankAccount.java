// This program generates random account number for the user and creates a new account
import java.util.Scanner;
public class BankAccount {
    public static double initialAmount;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[]  args){
        System.out.println("================================\n");
        System.out.println("Welcome to our Simple Banking System");
        System.out.println("Enter the initial amount of money you want to have in your bank account");
        initialAmount = scanner.nextDouble();
        while(true){
            System.out.println("\nChoose your option:");
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("Enter the amount of money you wish to deposit");
                    double depositAmount = scanner.nextDouble();
                    AtmInterface.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount of money you wish to withdraw");
                    double withdrawAmount = scanner.nextDouble();
                    AtmInterface.withdraw(withdrawAmount);
                    break;
                case 3:
                    AtmInterface.checkBalance();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
