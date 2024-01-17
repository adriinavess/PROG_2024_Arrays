package Aula;

public class Alumno {

	private String nombre;
	private int edad;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "Alumno " + nombre + " tiene " + edad + " años";
	}

}
