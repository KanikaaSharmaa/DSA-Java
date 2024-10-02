package Data_Structures_in_Java;
import java.util.*;
public class Second_Largest_Element 
{
    public static int find_max(int []arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        // Arrays.sort(arr);
        // int second_max = 0;
        // for(int i=arr.length-1;i>0;i--)
        // {
        //     if(arr[i]>arr[i-1])
        //     {
        //         second_max = arr[i-1];
        //         break;
        //     }
        // }
        // System.out.print(second_max);

        //Optimized solution
        int max = find_max(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == max)
                arr[i] = Integer.MIN_VALUE;
        }
        int second_max = find_max(arr);
        System.out.print(second_max);
        scn.close();    
    }    
}
