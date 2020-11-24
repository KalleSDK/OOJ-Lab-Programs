import java.util.Scanner;

class InvalidWithdrawal extends Exception{
    public InvalidWithdrawal(String s){
        super(s);
    }
}


class Account{
    double balance = 5000;

    void displayBalance(){
        System.out.println("Account balance: " + balance);
    }

    void withdraw(double amt) throws InvalidWithdrawal{
        if(amt > balance){
            throw new InvalidWithdrawal("Amount to be withdrawn is greater than balance");
        }
        balance -= amt;
        System.out.println("Withdrawn " + amt + " from account. New balance: " + balance);
    }

}



public class Bank {
    public static void main(String[] args) throws InvalidWithdrawal{
        int choice,flag = 1;
        double amount;
        Account a = new Account();
        Scanner sc = new Scanner(System.in);

        while(flag == 1){
            System.out.println("1. Balance\n2. Withdraw");
            System.out.println("Enter your option: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: a.displayBalance();
                        break;
                case 2: System.out.println("Enter amount to be withdrawn: ");
                        amount = sc.nextDouble();
                        a.withdraw(amount);
                        break;
                case 3: System.exit(0);
                        break;
                default: System.out.println("invlaid input");                        
            }
        }

    }    
}
