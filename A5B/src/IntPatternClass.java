/****************************************************************************
*
* Created by: Bryan Battershill
* Created on: Nov 2016
* This program will create a cool pattern of numbers
*
****************************************************************************/

public class IntPatternClass {
	public String pattern(int number){
		String pattern;
		String prevPattern;
		
		if ((number < 1)||(number > 15)){
			System.out.println("Number must be from 1-15.");
			System.exit(1);
		}
		
		if (number == 1){
			pattern = " 1 ";
		}
		else {
			prevPattern = pattern(number - 1);
			
			if (number > 5){
				pattern = prevPattern + " " + number + " \n" + prevPattern;
			}
			else {
				pattern = prevPattern + " " + number + " " + prevPattern;
			}
		}
		
		return pattern;
	}
}
