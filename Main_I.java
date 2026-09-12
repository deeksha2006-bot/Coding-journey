import java.util.Scanner;

interface Payable

{

    boolean processPayment(double amount);

    double getFee(double amount);

}

class CreditCard implements Payable

{

    public boolean processPayment(double amount)

    {

        return true;

    }

    public double getFee(double amount)

    {

        return amount*0.025;

    }

}

class UPI implements Payable

{

    public boolean processPayment(double amount)

    {

        return true;

    }

    public double getFee(double amount)

    {

        return 0.00;

    }

}

class Wallet implements Payable

{

    public double balance;

    Wallet(double balance)

    {

        this.balance = balance;

    }

    public boolean processPayment(double amount)

    {

        if(balance >= amount)

            return true;

        else

            return false;

    }

    public double getFee(double amount)

    {

        return 0.00;

    }

}

public class Main_I

{

    public static void main(String[] Purush)

    {

        Scanner sc = new Scanner(System.in);

        String type;

        double amount;

        System.out.println("Enter the type: ");

        type = sc.nextLine();

        System.out.println("Enter the amount: ");

        amount = sc.nextDouble();

        if(type.equals("CreditCard"))

        {

            CreditCard c = new CreditCard();

            System.out.println(c.processPayment(amount));

            System.out.println(c.getFee(amount));

        }

        else if(type.equals("UPI"))

        {

            UPI u = new UPI();

            System.out.println(u.processPayment(amount));

            System.out.println(u.getFee(amount));

        }

        else

        {

            double balance = sc.nextDouble();

            Wallet w = new Wallet(balance);

            System.out.println(w.processPayment(amount));

            System.out.println(w.getFee(amount));

        }

    }

}


