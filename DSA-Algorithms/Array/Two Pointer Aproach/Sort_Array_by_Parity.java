/*
 * Sample Input
 * 6 -> Size of an array
 * 1 2 3 4 5 6 -> Elements of an array
 * 
 * 7 -> Size of an array
 * 3 4 5 6 8 1 9 -> Elements of an array
 * 
 * Sample Output
 * 6 2 4 3 5 1 -> Sorting of array by parity
 * 
 * 8 4 6 5 3 1 9 -> Sorting of array by parity
 */

import java.util.*;
public class Sort_Array_by_Parity 
{
    public static int[] swap(int []arr,int left,int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return arr; 
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
        int left =0, right = n-1;
        while(left<right) 
        {
            if(arr[left]%2==1 && arr[right]%2==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2 == 0)
            {
                left++;
            }
            if(arr[right]%2 == 1)
            {
                right--;
            }
        }    
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        scn.close();
    }    
}
