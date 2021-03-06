package exercicio_1_2;

public class PizzariaDelivery implements Fabrica {

	public static final int CALABRESA = 1;
	public static final int PRESUNTO = 2;

	@Override
	public Produto getDeliveryInstance(int tipo) {
		switch (tipo) {
		case CALABRESA:
			return new PizzaCalabresa();
		case PRESUNTO:
			return new PizzaPresunto();
		}
		return null;
	}

}
