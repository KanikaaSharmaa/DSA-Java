/* Rotate the given array 'a' by k steps where k is non-negative without using extra space.
 * Note: k can be greater than n as well.
 * 
 * Sample Input
 * 5 -> Size of the array
 * 1 2 3 4 5 -> Elements of the array
 * 3 -> number of times to rotate an array
 * 
 * 5 -> Size of the array
 * 1 2 3 4 5 -> Elements of the array
 * 7 -> number of times to rotate an array
 * 
 * Sample Output
 * 3 4 5 1 2 -> array after rotation
 * 
 * 4 5 1 2 3 ->array after rotation
 * 
 * 
*/

import java.util.*;
public class Rotate_Array_by_K_Steps 
{
    public static int[] rotate_array(int []arr,int start ,int end)
    {
        while(start<end) 
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = scn.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }     
        System.out.print("Please input number of times you want to rotate an array: ");
        int k = scn.nextInt();
        k=k%n;
        rotate_array(arr,0,n-1);
        rotate_array(arr,0,k-1);
        rotate_array(arr,k,n-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }    
}
