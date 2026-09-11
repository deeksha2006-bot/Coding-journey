class BankAccount

{

    private String AccountNumber;

    private String HolderName;

    private double Balance;

    BankAccount(String A, String H, double B)

    {

        AccountNumber = A;

        HolderName = H;

        Balance = B;

    }

    boolean deposit(double Amount)

    {

        if(Amount > 0)

        {

            Balance += Amount;

            return true;

        }

        else

        {

            return false;

        }

    }

    boolean withdraw(double Amount)

    {

        if(Amount>0 && (Balance-Amount)>=500)

        {

            Balance -= Amount;

            return true;

        }

        else

            return false;

    }

    void display()

    {

        System.out.println("New Balance: "+Balance);

    }

}

public class Bank

{

    public static void main(String [] Purush)

    {

        BankAccount obj = new  BankAccount("ABC123", "Anu", 500000.00);

        if(obj.deposit(5000.00)==true);

            obj.display();

        if(obj.withdraw(200000.00)==true);

            obj.display();

    }

}



