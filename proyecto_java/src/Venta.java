
public class Venta {
	
	private Prenda prenda;
	private Integer cantidad;
	private String fecha;
	
	public Venta(Prenda prenda, Integer cantidad, String fecha) {
		this.prenda = prenda;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public String getFecha() {
		return fecha;
	}
	
	public Double gananciaEn(Negocio negocio){
		return this.prenda.precioFinalEn(negocio) * this.cantidad;
	}
	
	public String toString(){
		return "Prenda: unaprenda\n"
				+ "Cantidad: "+ this.getCantidad().toString() + 
				"\nFecha: " + this.getFecha();
	}
	
	public Boolean tienePrendasImportadas(){
		return this.prenda.esImportado();
	}
	
}
