package Data_Structures_in_Java;
import java.util.*;
public class Square_of_Non_Decreasing_array 
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
        int []array = new int[n];
        int left =0, right = n-1,i=n-1;
        while(left<=right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
                array[i] = arr[left]*arr[left];
                left++;
                i--;
            }
            else
            {
                array[i] = arr[right]*arr[right];
                i--;
                right--;
            }
        }
        for(int e=0;e<array.length;e++)
        {
            System.out.print(array[e]+" ");
        }
        scn.close();    
    }
}
