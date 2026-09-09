import java.util.Scanner;
public class inputs
{
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the integer: ");
 int a = in.nextInt();
 System.out.println("Enter the float value: ");
 float b = in.nextFloat();
 System.out.println("Enter the double value: ");
 double c = in.nextDouble();
 System.out.println("Enter the character value: ");
 char d = in.next().charAt(0);
 System.out.println("Enter the boolean value: ");7
 boolean e = in.nextBoolean();
 System.out.println("Enter the string value: ");
 in.nextLine();
 String str = in.nextLine();
 System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+str);
 } }
