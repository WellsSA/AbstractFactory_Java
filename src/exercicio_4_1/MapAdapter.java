package exercicio_4_1;

import java.util.HashMap;

public class MapAdapter extends HashMap<Integer, String> {
	private static final long serialVersionUID = 1L;

	public MapAdapter(String[][] vet) {
		for (int i = 0; i < vet[0].length; i++) {
			this.put(Integer.parseInt(vet[0][i]), vet[1][i]);
		}
	}
}
