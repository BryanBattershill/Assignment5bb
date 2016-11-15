/****************************************************************************
*
* Created by: Bryan Battershill
* Created on: Nov 2016
* This program creates an hourglass of asterisks
*
****************************************************************************/

public class AsteriskClass {
	public void astPattern(int number, int lines){
		String pattern = "";
		
		if (number < 1){
			System.out.println("Number must be greater than 0.");
			System.exit(1);
		}
		//Add indent
		for (int counter = 1; counter < lines; counter++){
			pattern = " " + pattern;
		}
		//Add asterisks with spaces
		for (int counter = 0; counter < number; counter++){
			pattern = pattern + " " + "*";
		}	
		
		System.out.println(pattern);
		
		if (number > 1){ 
			astPattern(number - 1, lines + 1);
		}
		
		System.out.println(pattern);
	}
}
