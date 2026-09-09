import java.util.Scanner;

public class P2

{

    public static void main(String[] args)

    {

        int balance, withdraw, type;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the account balance: ");

        balance = in.nextInt();

        System.out.println("Enter the amount to withdraw: ");

        withdraw = in.nextInt();

        System.out.println("Enter the type of transaction (1 for Savings, 2 for Current): ");

        type = in.nextInt();

        if(withdraw%100 != 0)

        {

            System.out.println("NOT A MULTIPLE OF 100.");

        }

        else if(withdraw >= 50000)

        {

            System.out.println("EXCEEDS MAXIMUM LIMIT.");

        }

        else if(type == 1)

        {  

            if((balance - withdraw) < 500)

            {

                System.out.println("INSUFFICIENT BALANCE.");

            }

            else

            {

                balance -= withdraw;

                System.out.println("SUCCESS.\nNew balance: " + balance);

            }

        }

        else if(type == 2)

        {

            if(withdraw >= 25000)

            {

                balance -= 50;

                System.out.println("CHARGES APPLIED!");

            }

            balance -= withdraw;

            System.out.println("SUCCESS.\nNew balance: " + balance);

        }

    }

}


