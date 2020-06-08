package exercicio_7_1;

public class Main {

	public static void main(String[] args) {

		TransformString ts;
		
		ts = new UppercaseString();
		StringTransformer.transform(ts);
		
		ts = new LowercaseString();
		StringTransformer.transform(ts);
		
		ts = new DuplicateString();
		StringTransformer.transform(ts);
		
		ts = new InvertString();
		StringTransformer.transform(ts);
	}

}
