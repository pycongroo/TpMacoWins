
public abstract class Prenda {
	
	private Double precioBase;
	private static Double valorFijoDeNegocio;
	
	public Prenda(String tipoPrenda) {
		this.precioBase = MacoWins.getPrecioBase(tipoPrenda);
	}
	
	public static void setValorFijoDeNegocio(Double valorFijoDeNegocio) {
		Prenda.valorFijoDeNegocio = valorFijoDeNegocio;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	public abstract Double tasaImportacion();
	
	public Double precioFinal(){
		return (Prenda.valorFijoDeNegocio + this.precioBase) * this.tasaImportacion();
	}
	
	public abstract Boolean esImportado();
}
