package Aula;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno();
		a1.setNombre("Adrian");
		a1.setEdad(20);
		System.out.println(a1);
		
		Alumno a2 = new Alumno();
		a2.setNombre("Laura");
		a2.setEdad(20);
		System.out.println(a2);
		
		Alumno a3 = new Alumno();
		a3.setNombre("Victor");
		a3.setEdad(20);
		System.out.println(a3);
		
		Alumno a4 = new Alumno();
		a4.setNombre("Pepe");
		a4.setEdad(20);
		System.out.println(a4);
		
		Alumno a5 = new Alumno();
		a5.setNombre("Manoli");
		a5.setEdad(20);
		System.out.println(a5);
		
		Aula aula = new Aula(4);
		aula.add(a1);
		aula.add(a2);
		aula.add(a3);
		aula.add(a4);
		aula.add(a5);
		
	}

}
