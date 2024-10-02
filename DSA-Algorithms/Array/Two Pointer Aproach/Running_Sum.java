/*
 * Given an integer array 'a', return the prefix sum/running sum in the same array without 
 * creating a new array.
 * 
 * Sample Input
 * 5 -> Size of the array
 * 2 1 3 4 5 -> Elements of the array
 * 
 * 6 -> Size of the array
 * 6 5 2 3 4 1 -> Elements of the array
 * 
 * Sample Output
 * 2 3 6 10 15 -> prefix sum/running sum
 * 
 * 6 11 13 16 20 21 -> prefix sum/running sum
 */
package Data_Structures_in_Java;
import java.util.*;
public class Running_Sum 
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
        for(int i=1;i<arr.length;i++)
        {
            arr[i] += arr[i-1];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }    
}
