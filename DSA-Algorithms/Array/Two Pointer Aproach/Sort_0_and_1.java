/* Sort an array consisting of only 0's and 1's
 * Sample Input
 * 9
 * 1 0 0 1 0 1 1 0 0
 * 
 * 5
 * 1 0 1 0 0 
 * 
 * Sample Output
 * 0 0 0 0 0 1 1 1 1
 * 
 * 0 0 0 1 1
 */

import java.util.*;
public class Sort_0_and_1 
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
            if(arr[left]==1 && arr[right]==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0)
                left++;
            if(arr[right]==1)
                right--;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }    
}
