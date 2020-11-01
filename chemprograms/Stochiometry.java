import java.util.Scanner;

class Main {

	static double ans;
	static double temp;
	static int n;
	static double nums[];
	static double nums1[];
	static double sum;
	static double sum1;
	



  public static void main(String[] args) {
	double value = 0;
	ans = 0;
	temp =0;
	n = 0;
	sum = 0; 
	sum1 = 0; 
	double r0 = 0;
	double r1 = 0;
	  
	Scanner s = new Scanner(System.in);
	
	
				
	print("\nenter value: ");
	value = s.nextDouble();
	sum = 1;
	
	print("is this mass in (g)rams or (m)oles?\n(enter 'g' or 'm'): ");
	
	if(s.next().equals("g")) {
		sum = 0;
	
	print("enter amount of elements in compound (if given the molar mass, type 1): ");
	n = s.nextInt();
	
	nums = new double[n];
	
	for(int i = 0 ; i < n; ++i) {
		
		print("enter atomic mass of element "+(i+1)+": ");
		temp = s.nextDouble();
		
		print("enter amount of atoms of element "+(i+1)+" (if given the molar mass, type 1): ");
		nums[i] = (temp*s.nextDouble());

		
	}
	
	for(int i = 0; i < nums.length; ++i)
		sum += nums[i]; 
	
	System.out.printf("moles of compound are %f mol.\n\n", (value/sum));
	
	} //end if
	
	print("enter stoichiometric ratio of product (or numerator): ");
	r0 = s.nextInt();
	
	print("enter stoichiometric ratio of reactant (or denominator): ");
	r1 = s.nextInt();

  print("mols * ratio = "+((value/sum) * (r0/r1))+"\n"); 
	
	
	n = 0;
	temp = 0;
	print("enter amount of elements in compound to convert to g (if given the molar mass, type 1): ");
	n = s.nextInt();
	
	nums1 = new double[n];
	
	for(int i = 0 ; i < n; ++i) {
		
		print("enter atomic mass of element "+(i+1)+":");
		temp = s.nextDouble();
		
		print("enter amount of atoms of element "+(i+1)+" (if given the molar mass, type 1):");
		nums1[i] = (temp*s.nextDouble());

		
	}
	
	for(int i = 0; i < nums1.length; ++i)
		sum1 += nums1[i]; 
	
	
	ans = ((value/sum) * (r0/r1)) * sum1;
	
	
				
				
			print("The answer is "+ans+"g.");
      System.exit(0);
  }
	
	public static void print(String text) {
		
		System.out.println(text+"\n");
	}
	
}