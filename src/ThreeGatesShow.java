/*Written by Pawel Poreba
 * 
 * Program simulates a three gate show where after selecting a gate by contestant
 * one of the loosing gates is revealed( or random gate in second run).
 * He then is presented with a possibility to change the choice.
 */

import java.util.Random;

public class ThreeGatesShow {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rightChoice =0;
		 int rightChoiceWithSwitch=0;
		
		for(int i=0;i<1000000; i++){
			Random ran = new Random(); //simulate the right gate
			int x = ran.nextInt(3)+1;	// range from 1-3		
			
			Random ran2 = new Random(); // simulate the choice
			int y = ran2.nextInt(3)+1;	// range from 1-3		
			
			if(x==1){
				if(y==1){
					rightChoice ++;
				}
				else{
					rightChoiceWithSwitch ++;
				}
				
			}else if(x==2){
				if(y==2){
					rightChoice ++;
				}
				else{
					rightChoiceWithSwitch ++;
				}
			}else if(x==3){
				if(y==3){
					rightChoice ++;
				}
				else{
					rightChoiceWithSwitch ++;
				}
				
			}// end el if
			
		}// end for
		System.out.println("sample size 1000000");
		System.out.println("");
		System.out.println("if one of the loosing gates is revealed after the first choice is made");
		System.out.println("");
		System.out.println("while sticking to original choice would win: "+rightChoice+" times");
		System.out.println("while changing the choice would win: "+rightChoiceWithSwitch+" times");
		System.out.println("");
		System.out.println("");
	
		rightChoice=0;
		rightChoiceWithSwitch=0;
		for(int i=0;i<1000000; i++){
			Random ran = new Random(); //simulate the right gate
			int x = ran.nextInt(3)+1;	// range from 1-3		
			
			Random ran2 = new Random(); // simulate the choice
			int y = ran2.nextInt(3)+1;	// range from 1-3	
			
			if(x==1){
				if(y==1){
					rightChoice ++;
				}
				else if(y==3){
					rightChoiceWithSwitch ++;
				}				
			}else if(x==2){
				if(y==2){
					rightChoice ++;
				}
				else if(y==1){
					rightChoiceWithSwitch ++;
				}				
			}else if(x==3){
				if(y==3){
					rightChoice ++;
				}
				else if(y==2){
					rightChoiceWithSwitch ++;
				}				
				
			}//end of else if
			
		}// end of for
		
		System.out.println("if a random gate is revealed after making first choice is made");
		System.out.println("");
		System.out.println("while sticking to original choice would win: "+rightChoice+" times");
		System.out.println("while changing the choice would win: "+rightChoiceWithSwitch+" times");
		
	}// end of main
	
} // end of class
