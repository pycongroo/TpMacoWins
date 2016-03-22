
public class Prenda {
	
	//precio base seteado al crear objeto
	private Float precioBase;
	private Boolean importado;
	
	public Prenda(Float precioBase, Boolean importado) {
		this.precioBase = precioBase;
		this.importado = importado;
	}

	public Float getPrecioBase() {
		return precioBase;
	}

	public Float tasaImportacion(){
		//retorna porcentaje de aumento 
		if (importado){
			return (float) 1.3;
		}
		else {
			return (float) 1;
		}
	}
	
}
