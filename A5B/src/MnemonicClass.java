import java.util.ArrayList;
import java.util.Arrays;
public class MnemonicClass {
	public ArrayList<String>  mnemonicPattern(int numberInput){
		ArrayList<String> mnemonicList = new ArrayList<String>();
		String [][] letters = new String[3][3];
		//Splitting up the 3 digit integer into 3 seperate integers
		int num1 = ((numberInput / 100) % 10);
		int num2 = ((numberInput / 10) % 10);
		int num3 = (numberInput % 10);
		
		//The function began as letters[x][y] = Character.toString((char)(num+'A'-1)).
		//This converts the int to the respective letter of the alphabet.
		//I then do 3*num - 5, 3*num - 4, 3*num - 3.
		//If num == 2, then it will give me back 1,2,3
		//If num == 3, then it will give me back 4,5,6
		
		letters[0][0] = Character.toString((char)((3*num1)+'A'-6));
		letters[1][0] = Character.toString((char)((3*num1)+'A'-5));
		letters[2][0] = Character.toString((char)((3*num1)+'A'-4));
		letters[0][1] = Character.toString((char)((3*num2)+'A'-6));
		letters[1][1] = Character.toString((char)((3*num2)+'A'-5));
		letters[2][1] = Character.toString((char)((3*num2)+'A'-4));
		letters[0][2] = Character.toString((char)((3*num3)+'A'-6));
		letters[1][2] = Character.toString((char)((3*num3)+'A'-5));
		letters[2][2] = Character.toString((char)((3*num3)+'A'-4));
		
		System.out.print(Arrays.deepToString(letters));

		return mnemonicList;
	}
	
	private void  mnemonicCombos(char[][] letters, int xCoord, int yCoord, ArrayList<String> mnemonicList){
		
	}
	
}
