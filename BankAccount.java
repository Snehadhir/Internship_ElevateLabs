import java.util.ArrayList;
import java.util.Scanner;

class Account{
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;

    // Constructor.
    public Account(String accountHolder){
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    //Deposit Method
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            transactionHistory.add("Deposited: $ " +amount);
            System.out.println("$ "+amount+" deposited successfully.");
        }else{
            System.out.println("Invalid deposit amount!");
        }
    }
    // Withdraw method
    public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            transactionHistory.add("Withdraw: $ "+amount);
            System.out.println("$ "+amount+" withdraw successfully.");
        }else{
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    //Display Balance
    public void displayBlanace(){
        System.out.println("Current Balance: $"+ balance);
    }
    //Display transanction history.
    public void showTransactionHistory(){
        System.out.println("Transaction History.");
        for(int i=0;i<transactionHistory.size();i++){
            System.out.println("- "+transactionHistory.get(i));
        }
    }
}
public class BankAccount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Bank!");
        System.out.print("Enter account Holder name: ");
        String name = sc.nextLine();

        Account account = new Account(name);

        int choice;
        do{
            System.out.println("-------Menu--------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice(1-5): ");
            choice = sc.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2: 
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3: 
                    account.displayBlanace();
                    break;
                case 4: 
                    account.showTransactionHistory();
                    break;
                case 5: 
                    System.out.println("Thank you for using the App!");
                    break;
                default:
                    System.out.println("Invalid choice. Try Again!");
            }
        }while(choice!=5);
        sc.close();
    }
}
