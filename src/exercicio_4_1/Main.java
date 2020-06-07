package exercicio_4_1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String[][] vet = {{"1","2","3","4"}, {"A","Zezim","Zuleide", "Creide2"}};
		
		Map<Integer, String> map = new MapAdapter(vet);
		
	    System.out.println(map);
	}

}
