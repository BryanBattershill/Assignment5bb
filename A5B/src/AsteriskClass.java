
public class AsteriskClass {
	public void astPattern(int number, int lines){
		String pattern = "";
		String ast = "*";
		for (int counter = 1; counter < lines; counter++){
			pattern = " " + pattern;
		}
		for (int counter = 0; counter < number; counter++){
			pattern = pattern + " " + ast;
		}	
		System.out.println(pattern);
		
		if (number > 1){ 
			astPattern(number - 1, lines + 1);
		}
		System.out.println(pattern);
	}
}
