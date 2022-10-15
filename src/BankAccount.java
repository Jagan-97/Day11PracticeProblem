public class BankAccount{
    static int amount = 20000;
    public static int getBalance(){
        return amount;
    }
    public static void withdraw(int amt){
        System.out.println(" ");
        if(amount < amt)
        {
            System.out.println("nValid Withdrawal Amount Please Check Ur Balance");
        }else{
            amount = (amount - amt);
            System.out.println("Please Collect your " + amt +" Rupees");
            System.out.println(" ");
            System.out.println("Available Balance: " +amount);
            System.out.println(" ");
        }
    }
}
