/*
    Output Format
    A bar chart of asteriks representing value of array a

    Constraints
    1<=n<=30
    0<=n1,n2,....n elements <=10

    Sample Input
    8
    8
    2
    5
    7
    5
    1
    6
    9

    Sample Output
                                *
    *                           *
    *           *               *
    *           *           *   *
    *       *   *   *       *   *
    *       *   *   *       *   *
    *       *   *   *       *   *
    *   *   *   *   *       *   *
    *   *   *   *   *   *   *   *
    
 */

package Data_Structures_in_Java;
import java.util.*;
public class Bar_Chart 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        System.out.println();

        int []array = new int[n];
        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i] = scn.nextInt();
        }
        System.out.println();

        int max = array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];  
            }
        }
        for(int i=max;i>0;i--)
        {
            for(int j=0;j<array.length;j++)
            {
                if(array[j]>=i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
    
}
