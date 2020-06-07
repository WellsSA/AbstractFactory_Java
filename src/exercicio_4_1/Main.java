package exercicio_4_1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * expected: 
		 * [
		 *  [chave1, chave2, chave3],
		 *  [coluna1, coluna2, coluna3]
		 * ]
		 */

		Map<Integer, String> mapaNomes = new HashMap<Integer, String>(); 
		
	    mapaNomes.put(1, "João Delfino");
	    mapaNomes.put(2, "Maria do Carmo");
	    mapaNomes.put(3, "Claudinei Silva");
	    
	    System.out.println(mapaNomes);
	}

}
