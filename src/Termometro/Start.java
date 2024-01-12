package Termometro;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		termometro termometro = new termometro(6);
		
		System.out.println("La maxima es " + termometro.getMax());
		System.out.println("La minima es " + termometro.getMin());
		System.out.println("La media es " + termometro.getMedia());
		
		
	}

}
