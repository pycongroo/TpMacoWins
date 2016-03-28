
public abstract class Prenda {
	
	private String tipoPrenda;
	
	public Prenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	
	private Double getPrecioBaseEn(Negocio negocio) {
		return negocio.getPrecioBase(this.tipoPrenda);
	}

	public abstract Double tasaImportacion();
	
	public Double precioFinalEn(Negocio negocio){
		return (negocio.getValorFijo() + this.getPrecioBaseEn(negocio)) * this.tasaImportacion();
	}
	
	public abstract Boolean esImportado();
}
