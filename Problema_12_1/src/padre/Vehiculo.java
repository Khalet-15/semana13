package padre;

public class Vehiculo {
	protected String marca, modelo, placa;

	public Vehiculo(String marca, String modelo, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public String datosCompletos(){
		return  "Marca  : "+ marca + "\n" +
				"Modelo  : "+ modelo + "\n" +
				"Placa  : "+ placa + "\n" +
				"Promedio  : "+ codigoGenerado();
	}
	private String codigoGenerado(){
		return marca+"-"+modelo+"-"+placa;
	}
	
}
