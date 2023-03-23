package es.studium.practica1;

public class Alumno
{
	private String nombre;
	private String direccion;
	private int nummatricula;
	private double nota;
	private Centro centro;
	private Asignatura asignatura;
	
	public Alumno() 
	{
		nombre = "";
		direccion = "";
		nummatricula = 0;
		nota = 0.0;
		centro = new Centro();
		asignatura = new Asignatura();
	}

	public Alumno(String nombre, String direccion, int nummatricula, double nota, Centro centro, Asignatura asignatura)
	{
		this.nombre = nombre;
		this.direccion = direccion;
		this.nummatricula = nummatricula;
		this.nota = nota;
		this.centro = centro;
		this.asignatura = asignatura;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	public int getNummatricula()
	{
		return nummatricula;
	}

	public void setNummatricula(int nummatricula)
	{
		this.nummatricula = nummatricula;
	}

	public double getNota()
	{
		return nota;
	}

	public void setNota(double nota)
	{
		this.nota = nota;
	}

	public Centro getCentro()
	{
		return centro;
	}

	public void setCentro(Centro centro)
	{
		this.centro = centro;
	}

	public Asignatura getAsignatura()
	{
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura)
	{
		this.asignatura = asignatura;
	}
	
	
}
