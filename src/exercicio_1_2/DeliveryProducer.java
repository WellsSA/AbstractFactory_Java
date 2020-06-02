package exercicio_1_2;

public class DeliveryProducer {
	public static final int PIZZARIA = 1;
	public static final int CALZONERIA = 2;
	
	private DeliveryProducer() {
		throw new AssertionError();
	}
	
	public static Fabrica getFabrica(int tipo) {
		switch(tipo) {
			case PIZZARIA : return new PizzariaDelivery();
			case CALZONERIA : return new CalzoneriaDelivery();
		}
		return null;
	}
}
