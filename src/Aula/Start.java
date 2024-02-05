package Aula;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno("Adrian");
		System.out.println(a1);
		
		Alumno a2 = new Alumno("Pepe");
		System.out.println(a2);
		
		Alumno a3 = new Alumno("Marcos");
		System.out.println(a3);
		
		Alumno a4 = new Alumno("Laura");
		System.out.println(a4);
		
		Alumno a5 = new Alumno("Maria");
		System.out.println(a5);
		
		Aula aula = new Aula(4);
		aula.add(a1);
		aula.add(a2);
		aula.add(a3);
		aula.add(a4);
		aula.add(a5);
		
	}

}
