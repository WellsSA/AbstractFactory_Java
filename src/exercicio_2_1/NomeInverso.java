package exercicio_2_1;

public class NomeInverso implements NameParser {

	@Override
	public Nome parse(String nome) {
		return new Nome("inverso", nome);
	}

}
