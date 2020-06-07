package exercicio_4_2;

import java.util.ArrayList;

public class SomadorAdapter implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		ArrayList<Integer> lista = new ArrayList<>();
		SomadorExistente somador = new SomadorExistente();
		
		for(int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		
		int resultado = somador.somaLista(lista);
		return resultado;
	}

}
