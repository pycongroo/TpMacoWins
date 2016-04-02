
public abstract class Prenda {
	
	private TipoPrenda tipoPrenda;
	private static Double valorFijoDeNegocio;
	
	public Prenda(TipoPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	
	public static void setValorFijoDeNegocio(Double valorFijoDeNegocio) {
		Prenda.valorFijoDeNegocio = valorFijoDeNegocio;
	}

	public abstract Double tasaImportacion();
	
	public Double precioFinal(){
		return (Prenda.valorFijoDeNegocio + this.tipoPrenda.getPrecioBase()) * this.tasaImportacion();
	}
	
	public abstract Boolean esImportado();
}
