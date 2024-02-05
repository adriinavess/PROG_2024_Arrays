package Aula;

public class Alumno {

	private String nombre;
	private Asignatura asignaturas[];
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		asignaturas = new Asignatura[4];
		asignaturas[0] = new Asignatura("PROG");
		asignaturas[1] = new Asignatura("BBDD");
		asignaturas[2] = new Asignatura("FOL");
		asignaturas[3] = new Asignatura("ENTORNOS");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Alumno " + nombre;
	}

}
