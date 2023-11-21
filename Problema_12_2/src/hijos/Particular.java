package hijos;

import padre.Licencia;

public class Particular extends Licencia{
	private int dni;

	public Particular(String clase, String categoria, String fechaEmicion, String fechaRenovacion, int dni) {
		super(clase, categoria, fechaEmicion, fechaRenovacion);
		this.dni = dni;
	}
	public String datosCompletos(){
		return  super.datosCompletos()+"\n"+
				"Categoria : "+categoria+"\n"+
				"Segundo Codigo : "+segundoCodigo();
	}
	private String segundoCodigo(){
		return categoria+"-"+dni;
	}

}
