package LabAssignment1;

import javax.swing.JOptionPane;// package class for GUI


public class UserAssignment {
	
		public static void main(String[] arg) {
			
			String name=JOptionPane.showInputDialog("Enter your Name :");
			
			 
			if(name.isBlank()) {
				
				JOptionPane.showMessageDialog(null,"Please enter your name ");
				String name1=JOptionPane.showInputDialog("Enter your Name :");
				String S1=name1.trim();
				JOptionPane.showMessageDialog(null," Hello "+S1);
				
				String nameUppercase1=S1.toUpperCase();
				String Lowercase1=S1.toLowerCase();
				char ch=S1.charAt(0);
				System.out.println("Your Name is " + S1);
				System.out.println("Your Name in UpperCase "+ nameUppercase1);
				System.out.println("Your Name in LowerCase "+ Lowercase1);
				System.out.println("Your Name Starts with "+ ch+ " Alphabet");
				
				
				System.out.println("Total Number of Alphabets in your name is "+ S1.length());
				
				calBMI();
			}
			
			else {
				//JOptionPane.showMessageDialog(null," Hello "+name);
				
				String S2=name.trim();
				String nameUppercase=S2.toUpperCase();
						
				String Lowercase1=S2.toLowerCase();
				char ch=S2.charAt(0);
				System.out.println("Your Name is " + S2);
				System.out.println("Your Name in UpperCase "+ nameUppercase);
				System.out.println("Your Name in LowerCase "+ Lowercase1);
				System.out.println("Your Name Starts with "+ ch+ " Alphabet");
				System.out.println("Total Number of Alphabets in your name is "+ S2.length());
				calBMI();
				
				
				
			}
		}
			public static void calBMI() {
				// weight is an integer so we have to use conversion operator Integer.parseInt()
				 float weight=Float.parseFloat(JOptionPane.showInputDialog("Enter your Weight in kgs: "));
				JOptionPane.showMessageDialog(null,"Your "+weight+" in kgs");
				System.out.println("Your Weight is"+weight);
				
				// For Double type also we have to use conversion operator as above
				
				float height=Float.parseFloat(JOptionPane.showInputDialog("Enter Your Height in meters : "));
				JOptionPane.showMessageDialog(null," Your " +height +" meter tall");
				System.out.println("Your Height is "+height);
				
				// Calculate BMI
				float bmi=(weight)/(height*height);
				System.out.println("Your BMI is "+bmi);
				float f=100,m=2;
				float difference= f-bmi;
				System.out.println("Your BMI Difference is "+difference);
				float modulation = bmi%2;
				System.out.println("Your BMI Mod is "+modulation);
				System.out.println("Your BMI with Add 10 " +(bmi+10));
				printBMI(bmi);
				
			}
			// Prints BMI category
		    private static void printBMI(float bmi) {
		        if(bmi < 18.5) {
		            System.out.println("You are underweight");
		        }else if (bmi < 25) {
		            System.out.println("You are normal");
		        }else if (bmi < 30) {
		            System.out.println("You are overweight");
		        }else {
		            System.out.println("You are obesity");
		        }
		    }
		
			
			
		}

		

	


