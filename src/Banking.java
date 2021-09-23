import java.util.Scanner;

public class Banking {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double transfer,withdraw,balance = 1000.0;
        int inputnum;
        System.out.print("Enter your name : ");
        String name = input.next();
        System.out.println("Hello Mr. " + name);
        System.out.println("Mr. "+ name + "please tell us what do you want to do today");
        System.out.println("Enter the required number for the operation to begin");
        System.out.println("1. Check the balance. \n2. Transfer Money \n3. Withdraw Money \n4. Exit the ATM");
        inputnum = input.nextInt();
        if(inputnum == 1)
        {
            System.out.println("Your balance is : "+ balance);
        }
        if (inputnum == 2)
        {
            System.out.println("How much money do you want to transfer?");
            transfer=input.nextDouble();
            if (transfer > balance)
            {
                System.out.println("you dont have enough money to transfer");
            }
            else if (transfer < balance)
            {
                System.out.println("Your transfer will begin shortly");
                balance = balance - transfer;
                System.out.println("Your new balance is :" + balance);
            }
            else if (transfer == balance)
            {
                System.out.println("Your transfer will begin shortly");
                balance = balance - transfer;
                System.out.println("Your new balance is :" + balance);
            }
        }
        if (inputnum == 3)
        {
            System.out.println("How much money do you want to withdraw");
            withdraw=input.nextDouble();
            if (withdraw > balance)
            {
                System.out.println("You don't have enough balance to withdraw");
            }
            else if (withdraw < balance){
                System.out.println("Your withdraw will begin shortly");
                balance = balance - withdraw;
                System.out.println("your new balance is "+balance);
            }
            else if (withdraw == balance)
            {
                System.out.println("Your withdraw will begin shortly");
                balance = balance - withdraw;
                System.out.println("your new balance is " + balance);
            }
        }

        if (inputnum == 4)
        {
            System.out.println("exiting");
            System.exit(1);
        }
        else if (inputnum >= 5)
        {
            System.out.println("invalid option");
        }

    }
}
