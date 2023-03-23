package es.studium.practica1;

public class TestAcademiaDeIdiomas
{

	public static void main(String[] args)
	{
		Centro centro1 = new Centro("Escuela de ingl�s", "Reyes Cat�licos, 14", 1);
		Centro centro2 = new Centro("Escuela de franc�s", "Crist�bal Col�n, 92", 2);
		
		Asignatura asignatura1 = new Asignatura("Ingl�s B1", 20, 1);
		Asignatura asignatura2 = new Asignatura("Ingl�s B2", 32, 2);
		Asignatura asignatura3 = new Asignatura("Franc�s B1", 23, 3);
		Asignatura asignatura4 = new Asignatura("Franc�s A2", 16, 4);
		
		Alumno alumno1 = new Alumno("Ana Abel", "Paseo de Am�rica, 15", 230, 7, centro1, asignatura1);
		Alumno alumno2 = new Alumno("Benito Bueno", "Reyes Cat�licos, 16", 145, 6, centro1, asignatura2);
		Alumno alumno3 = new Alumno("Carmen Cano", "Reyes Cat�licos, 12", 65, 5, centro1, asignatura1);
		Alumno alumno4 = new Alumno("Esteban Escalera", "Isabel la Cat�lica, 28", 91, 9, centro2, asignatura3);
		Alumno alumno5 = new Alumno("Francisco Farf�n", "Crist�bal Col�n, s/n", 121, 8.5, centro2, asignatura4);
		Alumno alumno6 = new Alumno("Claudia Palaz�n", "Venecia, 19",  187, 10, centro1, asignatura2);
		
		System.out.println("Las direcciones son: " + centro1.getDireccion() + " y " + centro2.getDireccion() + ".");
		System.out.println("La alumna " + alumno3.getNombre() + " est� matriculada en el centro " + alumno3.getCentro().getNombre() + ".");
		System.out.println("La nota que ha sacado " + alumno2.getNombre() + " en " + alumno2.getAsignatura().getNombre() + " es un " + alumno2.getNota() + ".");

	}

}
