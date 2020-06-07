package exercicio_7_1;

public class Main {

	public static void main(String[] args) {

		TransformString ts;
		
		ts = new Uppercase();
		StringTransformer.transform(ts);
		
		ts = new Lowercase();
		StringTransformer.transform(ts);
	}

}
