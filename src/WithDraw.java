import java.util.Scanner;
public class WithDraw extends BankAccount{
        static int withDraw;
        public static void showMenu()
        {
            System.out.println("Please Select an option below:");
            System.out.println("Press 1 to Withdraw Amount.");
            System.out.println("Press 2 to View Balance");
            System.out.println("Press any key to Exit");
            System.out.println(" ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Press any key: ");
            withDraw = scanner.nextInt();
            switch (withDraw) {
                case 1:
                    System.out.print("Please Enter the amount to withdraw: ");
                    int withamt=scanner.nextInt();
                    withdraw(withamt);
                    showMenu();
                    break;
                case 2:
                    System.out.println("Your Account Balance is "+getBalance()+" Rupees");
                    System.out.println(" ");
                    showMenu();
                    break;
                default:
                    System.out.println("Transaction Ended, Your Indian Bank Account Logout Successfully !");
                    System.exit(0);
                    break;
            }

        }
}
