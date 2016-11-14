import java.util.ArrayList;
import java.util.Arrays;

public class MnemonicClass {
	public ArrayList<String>  mnemonics(int numberInput){
		ArrayList<String> mnemonicList = new ArrayList<String>();
		char [][] letters = new char[3][10];
		//Splitting up the 3 digit integer into 3 seperate integers
		int num1 = ((numberInput / 1000000000) % 10);
		int num2 = ((numberInput / 100000000) % 10);
		int num3 = ((numberInput / 10000000) % 10);
		int num4 = ((numberInput / 1000000) % 10);
		int num5 = ((numberInput / 100000) % 10);
		int num6 = ((numberInput / 10000) % 10);
		int num7 = ((numberInput / 1000) % 10);
		int num8 = ((numberInput / 100) % 10);
		int num9 = ((numberInput / 10) % 10);
		int num10 = (numberInput % 10);
		int countMax = 3;
		//The function began as letters[x][y] = Character.toString((char)(num+'A'-1)).
		//This converts the int to the respective letter of the alphabet.
		//I then do 3*num - 5, 3*num - 4, 3*num - 3.
		//If num == 2, then it will give me back 1,2,3
		//If num == 3, then it will give me back 4,5,6
		
		
		/*
		letters[0][0] = (char)((3*num1)+'A'-6);
		letters[1][0] = (char)((3*num1)+'A'-5);
		letters[2][0] = (char)((3*num1)+'A'-4);
		letters[0][1] = (char)((3*num2)+'A'-6);
		letters[1][1] = (char)((3*num2)+'A'-5);
		letters[2][1] = (char)((3*num2)+'A'-4);
		letters[0][2] = (char)((3*num3)+'A'-6);
		letters[1][2] = (char)((3*num3)+'A'-5);
		letters[2][2] = (char)((3*num3)+'A'-4);
		letters[0][3] = (char)((3*num4)+'A'-6);
		letters[1][3] = (char)((3*num4)+'A'-5);
		letters[2][3] = (char)((3*num4)+'A'-4);
		letters[0][4] = (char)((3*num5)+'A'-6);
		letters[1][4] = (char)((3*num5)+'A'-5);
		letters[2][4] = (char)((3*num5)+'A'-4);
		letters[0][5] = (char)((3*num6)+'A'-6);
		letters[1][5] = (char)((3*num6)+'A'-5);
		letters[2][5] = (char)((3*num6)+'A'-4);
		letters[0][6] = (char)((3*num7)+'A'-6);
		letters[1][6] = (char)((3*num7)+'A'-5);
		letters[2][6] = (char)((3*num7)+'A'-4);
		letters[0][7] = (char)((3*num8)+'A'-6);
		letters[1][7] = (char)((3*num8)+'A'-5);
		letters[2][7] = (char)((3*num8)+'A'-4);
		letters[0][8] = (char)((3*num9)+'A'-6);
		letters[1][8] = (char)((3*num9)+'A'-5);
		letters[2][8] = (char)((3*num9)+'A'-4);
		letters[0][9] = (char)((3*num10)+'A'-6);
		letters[1][9] = (char)((3*num10)+'A'-5);
		letters[2][9] = (char)((3*num10)+'A'-4);
		*/
		
		for (int counter1 = 0; counter1 < 10; counter1++){
			int num = (int) ((numberInput / Math.pow(10, 9 - counter1)) % 10);
			for (int counter2 = 0 ; counter2 < countMax; counter2++){
				letters[counter2][counter1] = (char)((3*num1)+'A'-(6-counter2));
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
