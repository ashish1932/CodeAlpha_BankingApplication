import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        do {
            System.out.println("\n===== Simple Banking Application =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("₹" + depositAmount + " deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2: // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("₹" + withdrawAmount + " withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 3: // Check balance
                    System.out.println("Your current balance is: ₹" + balance);
                    break;

                case 4: // Exit
                    System.out.println("Exiting the application. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
