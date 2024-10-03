package Data_Structures_in_Java;
import java.util.*;
public class FindSum_2D_Array 
{
    public static void Find_sum(int [][]arr,int r1,int c1,int r2,int c2)
    {
        int sum =0;
        for(int i=r1;i<=r2;i++)
        {
            if(c1>0)
                sum+=(arr[i][c2]-arr[i][c1-1]);
            else
                sum+=arr[i][c2];
        }
        System.out.println(sum);
    } 

    public static void prefix_sum(int [][]arr,int r1,int c1,int r2,int c2)
    {
        for(int i=r1;i<=r2;i++)
        {
            for(int j=1;j<=c2;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }
        Find_sum(arr,r1,c1,r2,c2);
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
        System.out.print("Give me starting row coordinate : ");
        int r1 = scn.nextInt();
        System.out.print("Give me starting column coordinate : ");
        int c1 = scn.nextInt();
        System.out.print("Give me ending row coordinate : ");
        int r2 = scn.nextInt();
        System.out.print("Give me ending column coordinate : ");
        int c2 = scn.nextInt();
        prefix_sum(arr,r1,c1,r2,c2);
        scn.close();    
    }    
}
