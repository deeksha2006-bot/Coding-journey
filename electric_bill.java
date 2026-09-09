import java.util.Scanner;

public class electric_bill
{
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            int units = in.nextInt();
            float ans;

            if(units <= 100)
            {
                ans = units * 1.5f;
            }
            else if(units <= 200)
            {
                ans = 100 * 1.5f + (units - 100) * 2.5f;
            }
            else
            {
                ans = 100 * 1.5f + 100 * 2.5f + (units - 200) * 4.0f;
            }

            System.out.println("Electricity Bill: " + ans);
        }
    }
}