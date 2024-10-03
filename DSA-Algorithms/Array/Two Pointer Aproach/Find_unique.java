package Data_Structures_in_Java;
import java.util.*;
public class Find_unique 
{
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
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
                System.out.print(arr[i]);
        }
        scn.close();
    }    
}
