package exercicio_2_1;

public class NomeDireto implements NameParser {

	@Override
	public Nome parse(String nome) {
		return new Nome("direto", nome);
	}

}
