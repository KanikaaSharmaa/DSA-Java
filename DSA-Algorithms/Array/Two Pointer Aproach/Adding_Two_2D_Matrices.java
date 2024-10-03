package Data_Structures_in_Java;
import java.util.*;
public class Adding_Two_2D_Matrices 
{
    public static void print_array(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = scn.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = scn.nextInt();
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements of array 1: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr1[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the elements of array 2: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr2[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        print_array(arr);
        scn.close();
    }
}
