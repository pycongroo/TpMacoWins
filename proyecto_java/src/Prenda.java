
public class Prenda {
	
	private Float precioBase;
	private Boolean importado;
	private static Float valorFijoDeNegocio;
	
	public Prenda(Float precioBase, Boolean importado) {
		this.precioBase = precioBase;
		this.importado = importado;
	}
	
	public static void setValorFijoDeNegocio(float valorFijoDeNegocio) {
		Prenda.valorFijoDeNegocio = valorFijoDeNegocio;
	}

	public Float getPrecioBase() {
		return precioBase;
	}

	public Float tasaImportacion(){
		//retorna porcentaje de aumento 
		if (this.importado){
			return (float) 1.3;
		}
		else {
			return (float) 1;
		}
	}
	
	public Float precioFinal(){
		return (Prenda.valorFijoDeNegocio + this.precioBase) * this.tasaImportacion();
	}
	
}
