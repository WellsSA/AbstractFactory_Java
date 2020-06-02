package exercicio_1_2;

public class PizzariaDelivery implements Pizzaria {

	public final String CALABRESA = "calabresa";
	public final String PRESUNTO = "presunto";

	@Override
	public Pizza getDeliveryInstance(String tipo) {
		switch (tipo) {
		case CALABRESA:
			return new PizzaCalabresa();
		case PRESUNTO:
			return new PizzaPresunto();
		}
		return null;
	}

}
