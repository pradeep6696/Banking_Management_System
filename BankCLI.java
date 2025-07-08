package Practice.BankingSystem;
import java.util.Scanner;
public class BankCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManager manager = new BankManager();
        int choice;

        do {

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    manager.createAccount(accNo, name);
                    System.out.println("Account created successfully.");
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    BankAccount account = manager.getAccount(accNo);
                    if (account != null) {
                        account.deposit(deposit);
                        System.out.println("Amount deposited.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    account = manager.getAccount(accNo);
                    if (account != null) {
                        account.withdraw(withdraw);
                        System.out.println("Amount withdrawn.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    account = manager.getAccount(accNo);
                    if (account != null) {
                        System.out.println("Available Balance: " + account.getAvailableBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter amount for Fixed Deposit: ");
                    double fd = sc.nextDouble();
                    account = manager.getAccount(accNo);
                    if (account != null) {
                        account.createFD(fd);
                        System.out.println("Fixed Deposit created.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using SimpleBank CLI!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);


    }
}