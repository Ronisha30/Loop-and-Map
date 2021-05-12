import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arthmetics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int i,s=0,max,min,prod=1;
        {
            //take user input
            System.out.println("Input the 5 numbers : ");  
             
        }
            for (i=0;i<5;i++)
            {
                Integer answer = in.nextInt();
                nums.add(answer);

                //get the sum of the numbers 
                s +=nums.get(i);
                
                //get the product of the numbers
                prod = prod * answer;

        }
        System.out.println("The sum of 5 no is : " +s+"\nThe Product is : " +prod);
        // sort the numbers in ascending order

        Collections.sort(nums);
        // find smallest number
        min = nums.get(0);
  
        // find largest number
        max = nums.get(nums.size() - 1);

	    System.out.println("\nThe smallest of 5 no is : " +min+"\nAnd the largest is : " +max);
      }
    
}
