
public abstract class Prenda {
	
	private Marca marca;
	private TipoPrenda tipoPrenda;
	private static Double valorFijoDeNegocio;
	
	public Prenda(TipoPrenda tipoPrenda, Marca marca) {
		this.tipoPrenda = tipoPrenda;
		this.marca = marca;
	}
	
	public static void setValorFijoDeNegocio(Double valorFijoDeNegocio) {
		Prenda.valorFijoDeNegocio = valorFijoDeNegocio;
	}

	public abstract Double tasaImportacion();
	
	public Double precioFinal(){
		Double precioOriginal = (Prenda.valorFijoDeNegocio + this.tipoPrenda.precioBase()) * this.tasaImportacion();
		return precioOriginal * this.marca.coeficienteDeMarca(precioOriginal);
	}
	
	public abstract Boolean esImportado();
}
