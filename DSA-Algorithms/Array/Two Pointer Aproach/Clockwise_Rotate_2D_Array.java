package Data_Structures_in_Java;
import java.util.*;
public class Clockwise_Rotate_2D_Array 
{

    public static void print_array(int [][]arr1,int row,int column)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Reverse_Array(int [][]arr,int r,int c)
    {
        int i=0;
        while(i<r)
        {
            int left=0, right=c-1;
            while(left<right)
            {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
            i++;
        }
        print_array(arr,r,c);
    }

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rows for the matrix: ");
        int r = scn.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int c = scn.nextInt();
        int [][]arr = new int[r][c];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        if(r != c)
        {
            // Creating a new array for transpose
            // Rectangle Matrix(where rows is not equals to columns)
            int [][]arr1 = new int[c][r];
            for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr1[i].length;j++)
                {
                    arr1[i][j] = arr[j][i];
                }
            }
            Reverse_Array(arr1,c,r);
        }
        else
        {
            // Transpose of Square matrix(Where rows is equals to columns)
            // Transpose in the same given matrix(In-place Transpose)
            for(int i=0;i<r;i++)
            {
                for(int j=i+1;j<c;j++)
                {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            Reverse_Array(arr,r,c);
        }
        scn.close(); 
    }    
}
