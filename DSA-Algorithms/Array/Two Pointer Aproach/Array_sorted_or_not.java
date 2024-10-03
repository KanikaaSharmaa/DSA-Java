package Data_Structures_in_Java;
import java.util.*;
public class Array_sorted_or_not 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        boolean flag = true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        scn.close();
    }    
}
