package Termometro;

public class termometro {

	private int mes;
	private float temperaturas[];

	public termometro(int mes) {
		this.mes = mes;
		generarEspacioTemperaturas(mes);
		generarTemperaturas(mes);

	}

	private void generarEspacioTemperaturas(int mes) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			temperaturas = new float[31];
			break;

		case 4, 6, 9, 11:
			temperaturas = new float[30];
			break;

		case 2:
			temperaturas = new float[28];
			break;

		default:
			temperaturas = new float[31];
			this.mes = 1;
			break;
		}
	}

	private void generarTemperaturas(int mes) {
		for (int i = 0; i < temperaturas.length; i++) {
			switch (mes) {
			case 1, 2, 12:
				temperaturas[i] = (float) ((Math.random() * 18) - 5);
				break;

			case 3, 4, 5:
				temperaturas[i] = (float) ((Math.random() * 16) + 2);
				break;

			case 6, 7, 8:
				temperaturas[i] = (float) ((Math.random() * 14) + 15);
				break;

			case 9, 10, 11:
				temperaturas[i] = (float) ((Math.random() * 15) + 8);
				break;
			}
		}
	}

	public float getMax() {
		float maxima = -1000;

		for (int i = 1; i < temperaturas.length; i+=2) {
			if (temperaturas[i] > maxima) {
				maxima = temperaturas[i];
			}
		}
		return maxima;
	}

	public float getMin() {
		float minima = 1000;

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < minima) {
				minima = temperaturas[i];
			}
		}
		return minima;
	}

	public float getMedia() {
		float suma = 0;

		for (int i = 0; i < temperaturas.length; i+=2) {
			suma += temperaturas[i];
		}
		return suma / temperaturas.length;
	}

}
