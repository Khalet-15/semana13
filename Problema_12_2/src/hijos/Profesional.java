package hijos;

import padre.Licencia;

public class Profesional extends Licencia{
	private String ruc;

	public Profesional(String clase, String categoria, String fechaEmicion, String fechaRenovacion, String ruc) {
		super(clase, categoria, fechaEmicion, fechaRenovacion);
		this.ruc = ruc;
	}
	public String datosCompletos(){
		return  super.datosCompletos()+"\n"+
				"Categoria : "+categoria+"\n"+
				"Segundo Codigo : "+segundoCodigo();
	}
	private String segundoCodigo(){
		return categoria+"-"+ruc;
	}

}
