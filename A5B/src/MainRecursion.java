import java.util.ArrayList;

public class MainRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		IntPatternClass intPattern = new IntPatternClass();
		AsteriskClass ast = new AsteriskClass();
		MnemonicClass mnemonic = new MnemonicClass();
		ArrayList<String> mnemonicList = new ArrayList<String>();
		//System.out.println(intPattern.pattern(7));
		//ast.astPattern(5, 1);
		mnemonicList = mnemonic.mnemonics(22222222222.0);
		System.out.println(mnemonicList.toString());
	}

}
