
public class AsteriskClass {
	public void astPattern(int number, int lines){
		String prevPattern = "";
		String ast = "*";
		for (int counter = 0; counter < number; counter++){
			prevPattern = prevPattern + " " + ast;
		}	
		System.out.println(prevPattern);
		if (number > 1){ 
			astPattern(number - 1, 1);
		}
		System.out.println(prevPattern);
	}
}
