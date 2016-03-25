
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
	
	public Float gananciaDeVenta(){
		return this.prenda.precioFinal() * this.cantidad;
	}
}
