import java.util.Scanner;


class Main {

	static boolean valid;
	static double ans;
	static double num;
	static double am;
	static double massSum;
	static double temp;
	static double[] nums;
	static int en;



  public static void main(String[] args) {

		valid = false;
		num = 0;
		ans = 0;
		am = 0;
		en = 0;
		massSum = 0 ;
		temp = 0 ;
		
				valid = false;
				
				Scanner s = new Scanner(System.in);
				
				while(valid == false)	{	
						
					print("enter amount of elements in compound");
					en = s.nextInt(); // get n
					
					if(en <= 1)
						print("invalid element no.");
					else valid = true;
							
					}
				
				nums = new double[en];
				
				for(int i = 0 ; i < en; ++i) {
					
					print("enter atomic mass of element "+(i+1)+":");
					temp = s.nextDouble();
					
					print("enter amount of atoms of element "+(i+1)+":");
					nums[i] = (temp*s.nextDouble());

          System.out.printf("total mass of element %d in the compound is %f.\n\n", i+1, nums[i]);
				}
				
				for(int i = 0; i < nums.length; ++i)
					massSum += nums[i]; 
				

				ans = massSum;
				
			print("The answer is "+ans+".");
			
			for(int i = 0; i < nums.length; ++i)
				System.out.printf("the mass percent composition of element %d is %f%%\n",(i+1),((nums[i]/ans)*100));
					
				
      System.exit(0);
  }
	
	public static void print(String text) {
		
		System.out.println(text+"\n");
	}
	
}