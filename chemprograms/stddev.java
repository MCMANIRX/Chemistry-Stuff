package chemRev;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
	
	static double[] nums;
	static double tempSum;
	static double avg;
	static int n; 
	static int sf; 
	static double tempavg;
	static boolean valid;
	
	
	public static void main(String[] args) {
		tempSum = 0;
		n = 0;
		tempavg = 0;
		avg = 0;
		valid = false;
		
		Scanner s = new Scanner(System.in);
		
		while(valid ==false)	{	
				
			p("n: ");
			n = s.nextInt(); // get n
			
			if(n <= 1)
				p("invalid n");
			else valid = true;
					
			}
		
		nums = new double[n]; //set floating point array to size of n
		
		
		//loop to get all numbers in sample
		for(int i = 0 ; i < n; ++i) {
			
			p("enter number "+(i+1)+":");
			nums[i] = s.nextDouble();
		}
		
		//get average of numbers in sample
		for(int i = 0; i < nums.length; ++i)
			tempavg += nums[i]; 

		avg = tempavg/n;
		
		
		//get sum of (nums[i] - avg)^2
		for(int i = 0; i < nums.length; ++i) 
			tempSum += Math.pow((nums[i] - avg), 2); 

		
		
		p("Average is "+avg);
		p("Sum of squares is "+tempSum);
		p("Standard deviation is "+(Math.sqrt(tempSum/(n-1)))); //print std. dev
		
		
		System.exit(0); //end program
		
	}
	
	
	
	public static void p(String x) {
		
		if(x.equals("<<<!@!@!>>>"))
			System.out.println("(Enter any key to see the answer)");
		else
		System.out.println(x);
		  
		 
	}
	

}
