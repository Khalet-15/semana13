package padre;

public class Licencia {
	protected String clase,categoria,fechaEmicion,fechaRenovacion;

	public Licencia(String clase, String categoria, String fechaEmicion, String fechaRenovacion) {
		super();
		this.clase = clase;
		this.categoria = categoria;
		this.fechaEmicion = fechaEmicion;
		this.fechaRenovacion = fechaRenovacion;
	}
	
	public String datosCompletos(){
		return  "Clase : "+clase+"\n"+
				"Categoria : "+categoria+"\n"+
				"Fecha de emicion : "+fechaEmicion+"\n"+
				"Fecha de Renovacion : "+fechaRenovacion+"\n"+
				"Promedio : "+codigoGenerado();
	}
	private String codigoGenerado(){
		return clase+"-"+fechaRenovacion;
	}

}
