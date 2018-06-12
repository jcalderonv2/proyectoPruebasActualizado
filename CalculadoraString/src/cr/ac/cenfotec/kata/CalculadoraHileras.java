package cr.ac.cenfotec.kata;

public class CalculadoraHileras {

	public int add(String string) {

		if (string.isEmpty())
			return 0;
		String[] numeros = string.split("[||:||,]");

		return sumarTodosLosValores(numeros);

	}

	private int sumarTodosLosValores(String[] numeros) {
		int acumulador = 0;

		for (String numero : numeros) {

			acumulador += Integer.parseInt(numero);

		}
		return acumulador;
	}

}
