/* Given Q queries, check if the given number is present in the array or not.
 * Note: Value of all the elements in the array is less than 10 to the power 5.
 *  
 * Sample Input
 * 7   -> Size of the array
 * 5 6 5 400 560 1000 400  -> Elements of the array
 * 3   -> number of queries
 * 5   -> query 1
 * 450 -> query 2
 * 400 -> query 3
 * 
 * Sample Output
 * Yes -> Output of query 1
 * No  -> Output of query 2
 * Yes -> Output of query 3
 */

package Data_Structures_in_Java;
import java.util.*;
public class Element_Found_or_not_Found 
{
    public static int[] makefrequencyarray(int []arr)
    {
        int []freq = new int[100001];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        return freq;
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
        int[] freq = makefrequencyarray(arr);
        System.out.print("Please input number of queries: ");
        int q = scn.nextInt();
        while(q>0)
        {
            int num = scn.nextInt();
            if(freq[num]>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
            q--;
        }
        scn.close();    
    }    
}
