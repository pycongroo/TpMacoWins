
public class Prenda {
	
	private Double precioBase;
	private Boolean importado;
	private static Double valorFijoDeNegocio;
	
	public Prenda(Double precioBase, Boolean importado) {
		this.precioBase = precioBase;
		this.importado = importado;
	}
	
	public Prenda(Integer precioBase, Boolean importado) {
		this.precioBase = precioBase.doubleValue();
		this.importado = importado;
	}
	
	public static void setValorFijoDeNegocio(Double valorFijoDeNegocio) {
		Prenda.valorFijoDeNegocio = valorFijoDeNegocio;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	public Double tasaImportacion(){
		//retorna porcentaje de aumento 
		if (this.importado){
			return 1.3;
		}
		else {
			return 1.0;
		}
	}
	
	public Double precioFinal(){
		return (Prenda.valorFijoDeNegocio + this.precioBase) * this.tasaImportacion();
	}
	
	public Boolean esImportado(){
		return this.importado;
	}
	
}
