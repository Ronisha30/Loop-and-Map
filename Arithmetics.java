import java.util.ArrayList;
import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in);){
        ArrayList<Integer> nums = new ArrayList<>();
        int i,s=0,max=0,prod=1;
        
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

                // find the greatest number
                if (nums.get(i) > max)
                max = nums.get(i);
                
        }
        int smallest = nums.get(0);
            for(int x : nums ){
            if (x < smallest) {
                smallest = x;
            }
        }
        System.out.println("The sum of 5 no is : " +s);
        System.out.println("\nThe Product is : " +prod);
        System.out.println("\nThe smallest no is : " +smallest);
        System.out.println("\nThe largest no is : " +max);
      }
    
}
}