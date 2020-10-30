/* atoms/mol/g converter, by Mateo Smith 8/31/2020
 * #NCAT24
 * in order to use exponential numbers, you must use E notation (enter "6.022 * 10^23" as "6.022E23". no quotes obviously :p
 */



package chemConversions;

import java.util.Scanner;
import java.lang.Math;

public class main {
	static boolean loop;
	static boolean valid;
	static double ans;
	static double num;
	static double am;
	static double massSum;
	static double temp;
	static double avo =  6.022*Math.pow(10, 23);
	static double[] nums;
	static int en;
	
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		loop = true;
		valid = false;
		num = 0;
		ans = 0;
		am = 0;
		en = 0;
		massSum = 0 ;
		temp = 0 ;
		
		
		while(loop == true) {
		
			print("input value to convert:");
			
			num = s.nextDouble();
			
			print("this is: \n1) atoms\n2) mols\n3) g");
			
			int i0 = s.nextInt();
			
			
			
			print("convert to (type corresponding number and press enter): \n1) atoms\n2) mols\n3) g\n");
			
			int i1 = s.nextInt();
			
			
			if(i0 == i1 || 0 > i0 || i0 > 3 || 0 > i1 || i1 >4 ){
				
				print("Invalid. Exiting");
				System.exit(0);
			}
			
			
			switch(i1) {
			
			case 1:
				
				if(i0 == 2)   //mols to atoms
					ans = num*avo;
				
				else {    //g to atoms
					print("enter atomic mass: ");
					am = s.nextDouble();
					ans = (num/am)*avo;
					 }
				break;
			
					
			case 2:
				
				if(i0 == 1)   //atoms to mols
					ans = num / avo;
				
				else {    //g to mols
					print("enter atomic mass: ");
					am = s.nextDouble();
					ans = (num / am);
					 }
				
				break;
				
			case 3:
				if(i0 == 1) {       //atoms to g
					print("enter atomic mass: ");
					am = s.nextDouble();
					ans = (num/avo)*am;
				}
					
				
				else {      //mols to g
					print("enter atomic mass: ");
					am = s.nextDouble();
					ans = (num * am);
					 }
				break;
				
			case 4:
				
				print("deprecated!");
				System.exit(0);
				
				valid = false;
				
				Scanner s = new Scanner(System.in);
				
				while(valid == false)	{	
						
					print("enter amount of elements in compound (+1 if you want to find amt of moles): ");
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
				}
				
				for(int i = 0; i < nums.length-1; ++i)
					massSum += nums[i]; 
				
				en = 0;
				print("which element would you like to find the mass of?");
				en = s.nextInt();
				
				print("num is "+num);
				print("massSum is "+massSum);
				print("nums[i-1] is"+nums[en-1]);
				
				ans = (num/massSum)*nums[en-1];
				
				break;
				
			
			default:
				print("The answer is "+ans+". Convert again? (y/n)");
				print("'"+i0+"' is invalid. Exiting");
				System.exit(0);
				
			
			}
			
			print("The answer is "+ans+". Convert again? (y/n)");
			
			if(!s.next().equals("y"))
				loop = false;
			
		}
		
		print("ight peace");
		System.exit(0);
		
	}
	
	public static void print(String text) {
		
		System.out.println(text+"\n");
	}
	

}
