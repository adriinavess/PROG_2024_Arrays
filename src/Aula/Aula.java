package Aula;

import java.util.Arrays;

public class Aula {

	private Alumno alumnos[];
	private int cuantos;

	public Aula(int caben) {
		this.alumnos = new Alumno[caben];
		this.cuantos = 0;
	}

	public void add(Alumno alumno) {
		if(cuantos<alumnos.length) {
			alumnos[cuantos] = alumno;
			cuantos++;
		}
		System.out.println(this);
	}
	
	public String toString() {
		return "Aula [\nalumnos=" + Arrays.toString(alumnos) + "\ncuantos=" + cuantos + "]";
	}

}
