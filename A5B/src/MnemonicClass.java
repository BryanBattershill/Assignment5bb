/****************************************************************************
*
* Created by: Bryan Battershill
* Created on: Nov 2016
* This program will convert a number into every possible letter combination
* (Cellphone keypad)
*
****************************************************************************/

import java.util.ArrayList;

public class MnemonicClass {
	public ArrayList<String>  mnemonics(long numberInput){
		ArrayList<String> mnemonicList = new ArrayList<String>();
		String inputAsString = String.valueOf(numberInput);
		int totalDigits = inputAsString.length();
		char [][] letters = new char[4][totalDigits];
		int countMax = 3;
		int offset = 0;
		
		//Splitting up the numberInput into single digits to convert to letters
		for (int counter1 = 0; counter1 < totalDigits; counter1++){
			
			int num = (int) ((numberInput / Math.pow(10, totalDigits - 1 - counter1)) % 10);
			
			if (num < 2){
				System.out.println("Numbers must be from 2-9.");
				System.exit(1);
			}
			//Special cases (4 letters, offset from regular pattern)
			if (num == 7){
				countMax = 4;
			}
			else if (num == 8){
				offset = 1;
			}
			else if (num == 9){
				countMax = 4;
				offset = 1;
			}
			
			for (int counter2 = 0 ; counter2 < countMax; counter2++){
				letters[counter2][counter1] = (char)((3*num)+offset+'A'-(6-counter2));
			}
			
			countMax = 3;
			offset = 0;
		}
		//Function does not have to return a list because all copies of the list
		//are edited when one is changed
		mnemonicCombos(letters, mnemonicList, "", 0, totalDigits - 1);
		
		return mnemonicList;
	}
	
	private void  mnemonicCombos(char[][] letters, ArrayList<String> mnemonicList, String currentWord, int yIndex, int digits){
		//Goes through each possible letter for place
		for (int xIndex = 0; xIndex < 4; xIndex++){
			//The number may have only corresponded to 3 letters, so there are some null values
			if (letters[xIndex][yIndex] != '\0'){
				
				currentWord = currentWord + letters[xIndex][yIndex];
				
				if (yIndex != digits){
					//Goes down a level in the tree (next place)
					mnemonicCombos(letters, mnemonicList, currentWord, yIndex + 1, digits);
				}
				else if (yIndex == digits){
					//At the bottom of the tree so string is added onto list
					mnemonicList.add(currentWord);
				}
				
				//Remove letter added
				currentWord = currentWord.substring(0, currentWord.length()-1);	
			}
		}
	}
	
}
