package es.studium.practica1;

public class Asignatura
{	
	private String nombre;
	private int numhoras;
	private int identificador;
	
	public Asignatura() 
	{
		nombre = "";
		numhoras = 0;
		identificador = 0;
	}
	
	public Asignatura(String nombre, int numhoras, int identificador)
	{
		this.nombre = nombre;
		this.numhoras = numhoras;
		this.identificador = identificador;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getNumhoras()
	{
		return numhoras;
	}

	public void setNumhoras(int numhoras)
	{
		this.numhoras = numhoras;
	}

	public int getIdentificador()
	{
		return identificador;
	}

	public void setIdentificador(int identificador)
	{
		this.identificador = identificador;
	}
		
}
