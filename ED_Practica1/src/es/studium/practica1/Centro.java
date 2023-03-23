package es.studium.practica1;

public class Centro
{
	private String nombre;
	private String direccion;
	private int identificador;
	
	public Centro() 
	{
		nombre = "";
		direccion = "";
		identificador = 0;
	}

	public Centro(String nombre, String direccion, int identificador)
	{
		this.nombre = nombre;
		this.direccion = direccion;
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

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
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
