/****************************************************************************
*
* Created by: Bryan Battershill
* Created on: Nov 2016
* This program is a stub for the 3 problems (mnemonic, intpattern, astpattern)
*
****************************************************************************/
import java.util.Scanner;

public class MainRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner userIn = new Scanner(System.in);
		int classChosen = -1;
		long numChosen;
		
		//Choosing which function to use
		System.out.println("Which function (number) would you like to access?" 
				+ '\n' + "1. Mnemonics" + '\n' + "2. Number Pattern" + '\n' + "3. Asterisk Pattern");
		
		if (userIn.hasNextInt()){
			classChosen = userIn.nextInt();
			if ((classChosen < 1) || (classChosen >3)){
				System.out.println("Must be 1-3.");
				System.exit(1);
			}
		}
		else {
			System.out.println("That is invalid.");
			System.exit(1);
		}
		
		//Choosing what to input into function
		System.out.println("Enter a number.");
		if (userIn.hasNextInt()){
			numChosen = userIn.nextLong();
			if (classChosen == 1){
				MnemonicClass mnemonic = new MnemonicClass();
				//print the list
				System.out.println(mnemonic.mnemonics(numChosen).toString());
			}
			else if (classChosen == 2){
				IntPatternClass intPattern = new IntPatternClass();
				//print the pattern
				System.out.println(intPattern.pattern((int)numChosen));
			}
			else if (classChosen == 3){
				AsteriskClass ast = new AsteriskClass();
				//make the pattern (printed inside function)
				ast.astPattern((int)numChosen, 1);
			}
		}
		else {
			System.out.println("That is invalid.");
			System.exit(1);
		}
	}

}
