import java.util.Scanner;
public class array
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        //find the sum ,max,min
        int sum = arr[0],max = arr[0],min = arr[0];
        for(int i=1; i<size; i++)
        {
            sum += arr[i];
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        


    

