import java.util.Scanner;

public class string1

{

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        String user_pass = sc.nextLine();

        int len = user_pass.length();

        boolean flag = true;

        if(len<6 || len>15) 

        {

            System.out.println("Length must be 6-15.");

            flag = false;

        }

        else

        {

            char ch = user_pass.charAt(0);

            if(Character.isLetter(ch)==true)

            {

                for(int i=1; i<len; i++)

                {

                    ch = user_pass.charAt(i);

                    if(ch == ' ')

                    {

                        System.out.println("Must not contain spaces.");

                        flag = false;

                        break;

                    }

                }

            }

            else

            {

                System.out.println("Must start with a letter.");

                flag = false;

            }

        }

        if(flag == true)

            System.out.println("Valid");

    }

}


