
public class TipoPrenda {
	private String nombrePrenda;
	private Double precioBase;
	
	public TipoPrenda(String nombrePrenda, Double precioBase) {
		super();
		this.nombrePrenda = nombrePrenda;
		this.precioBase = precioBase;
	}
	
	public TipoPrenda(String nombrePrenda, Integer precioBase) {
		this.nombrePrenda = nombrePrenda;
		this.precioBase = Double.valueOf(precioBase);
	}
	
	public String getNombrePrenda() {
		return nombrePrenda;
	}
	public Double getPrecioBase() {
		return precioBase;
	}
	
}
