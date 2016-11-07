
public class IntPatternClass {
	public String pattern(int number){
		String pattern;
		String prevPattern;
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
