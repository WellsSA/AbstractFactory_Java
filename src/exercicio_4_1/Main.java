package exercicio_4_1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String[][] vetor = {{"1","2","3","4"}, {"A","Zezim","Zuleide", "Creide"}};
		/*
		 * expected: 
		 * [
		 *  [chave1, chave2, chave3],
		 *  [coluna1, coluna2, coluna3]
		 * ]
		 */
		
		Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
		
		
		for(int i = 0; i < vetor[0].length; i++) {
			mapaNomes.put(Integer.parseInt(vetor[0][i]), vetor[1][i]);
		}
		
		
	    
	    System.out.println(mapaNomes);
	}

}
