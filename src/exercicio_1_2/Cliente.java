package exercicio_1_2;

import java.util.Calendar;
import java.util.Date;

public class Cliente {

	public static void main(String[] args) {
		Date hoje = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(hoje);
		
		int diaSemana = c.get(Calendar.DAY_OF_WEEK);
		
		Fabrica fabrica = DeliveryProducer.getFabrica(DeliveryProducer.CALZONERIA);
		Produto pizza = null;
		
		switch(diaSemana) {
		case 2: case 4: case 6:
			pizza = fabrica.getDeliveryInstance(PizzariaDelivery.CALABRESA);
			break;
		case 3: case 5: case 7:
			pizza = fabrica.getDeliveryInstance(PizzariaDelivery.PRESUNTO);
			break;
		default: 
			System.out.println("Domingo não tem pizza");
		}
		
		if(pizza != null) {			
			String sabor = pizza.fazer();
			
			System.out.println(sabor);
		}

	}

}
