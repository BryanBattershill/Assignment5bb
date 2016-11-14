import java.util.ArrayList;
import java.util.Arrays;

public class MnemonicClass {
	public ArrayList<String>  mnemonics(double numberInput){
		ArrayList<String> mnemonicList = new ArrayList<String>();
		char [][] letters = new char[3][10];
		int countMax = 3;
		
		//Splitting up the 3 digit integer into 3 seperate integers
		//The function began as letters[x][y] = Character.toString((char)(num+'A'-1)).
				//This converts the int to the respective letter of the alphabet.
				//I then do 3*num - 5, 3*num - 4, 3*num - 3.
				//If num == 2, then it will give me back 1,2,3
				//If num == 3, then it will give me back 4,5,6
		
		for (int counter1 = 0; counter1 < 10; counter1++){
			int num = (int) ((numberInput / Math.pow(10, 9 - counter1)) % 10);
			for (int counter2 = 0 ; counter2 < countMax; counter2++){
				letters[counter2][counter1] = (char)((3*num)+'A'-(6-counter2));
			}
		}
		
		System.out.println(Arrays.deepToString(letters));
		//mnemonicCombos(letters, mnemonicList, "", 0);
		
		return mnemonicList;
	}
	
	private void  mnemonicCombos(char[][] letters, ArrayList<String> mnemonicList, String currentWord, int yIndex){
		for (int xIndex = 0; xIndex < 3; xIndex++){
			currentWord = currentWord + letters[xIndex][yIndex];
			if (yIndex != 2){
				mnemonicCombos(letters, mnemonicList, currentWord, yIndex + 1);
			}
			if (yIndex == 2){
				mnemonicList.add(currentWord);
				
			}
		}
	}
	
}
