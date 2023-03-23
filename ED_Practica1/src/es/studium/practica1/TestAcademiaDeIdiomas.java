package es.studium.practica1;

public class TestAcademiaDeIdiomas
{

	public static void main(String[] args)
	{
		Centro centro1 = new Centro("Escuela de inglés", "Reyes Católicos, 14", 1);
		Centro centro2 = new Centro("Escuela de francés", "Cristóbal Colón, 92", 2);
		
		Asignatura asignatura1 = new Asignatura("Inglés B1", 20, 1);
		Asignatura asignatura2 = new Asignatura("Inglés B2", 32, 2);
		Asignatura asignatura3 = new Asignatura("Francés B1", 23, 3);
		Asignatura asignatura4 = new Asignatura("Francés A2", 16, 4);
		
		Alumno alumno1 = new Alumno("Ana Abel", "Paseo de América, 15", 230, 7, centro1, asignatura1);
		Alumno alumno2 = new Alumno("Benito Bueno", "Reyes Católicos, 16", 145, 6, centro1, asignatura2);
		Alumno alumno3 = new Alumno("Carmen Cano", "Reyes Católicos, 12", 65, 5, centro1, asignatura1);
		Alumno alumno4 = new Alumno("Esteban Escalera", "Isabel la Católica, 28", 91, 9, centro2, asignatura3);
		Alumno alumno5 = new Alumno("Francisco Farfán", "Cristóbal Colón, s/n", 121, 8.5, centro2, asignatura4);
		Alumno alumno6 = new Alumno("Claudia Palazón", "Venecia, 19",  187, 10, centro1, asignatura2);
		
		System.out.println("Las direcciones son: " + centro1.getDireccion() + " y " + centro2.getDireccion() + ".");
		System.out.println("La alumna " + alumno3.getNombre() + " está matriculada en el centro " + alumno3.getCentro().getNombre() + ".");
		System.out.println("La nota que ha sacado " + alumno2.getNombre() + " en " + alumno2.getAsignatura().getNombre() + " es un " + alumno2.getNota() + ".");

	}

}
