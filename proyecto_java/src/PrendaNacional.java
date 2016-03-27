
public class PrendaNacional extends Prenda{

	public PrendaNacional(Double precioBase) {
		super(precioBase);
	}
	
	public PrendaNacional(Integer precioBase) {
		super(precioBase);
	}

	public Double tasaImportacion() {
		return 1.0;
	}
	
	public Boolean esImportado(){
		return false;
	}
	
}
