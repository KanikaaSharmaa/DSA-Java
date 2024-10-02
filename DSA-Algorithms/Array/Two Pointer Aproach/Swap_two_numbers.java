package Data_Structures_in_Java;
import java.util.*;
public class Swap_two_numbers 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();
        System.out.println("Before Swap:- ");
        System.out.println("first number: "+num1+ " Second number: "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swap:- ");
        System.out.println("first number: "+num1+ " Second number: "+num2);
        scn.close();

    }
    
}
