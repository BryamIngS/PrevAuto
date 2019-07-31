package domain;

import java.util.Date;

public class Documento {
	
	
	private String tipoDocumento;
	private int numero;
	private String fechaExpedicion;
	private String fechaVencimiento;
	//atributos agregados para el servicio de verCronograma
	private String nombreVehiculo;
	
	
	
	public Documento(String tipoDocumento, int numero, String fechaExpedicion,
			String fechaVencimiento) {
		this.tipoDocumento = tipoDocumento;
		this.numero = numero;
		this.fechaExpedicion = fechaExpedicion;
		this.fechaVencimiento = fechaVencimiento;
		
	}
	
	public Documento(String fechaVencimiento, String nombreVehiculo, String tipoDocumento) {
		this.fechaVencimiento = fechaVencimiento;
		this.nombreVehiculo = nombreVehiculo;
		this.tipoDocumento = tipoDocumento;
		
	}
	
	
}
