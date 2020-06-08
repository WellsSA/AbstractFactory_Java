package exercicio_7_1;

public class InvertString extends TransformString {
	@Override
	public String transformTo(String str) {
		String[] chars = str.split("");
		String builtStr = "";
		for(int i = chars.length -1; i >= 0; i--) builtStr += chars[i];
		return builtStr;
	}
}
