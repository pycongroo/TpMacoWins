
public class PrendaImportada extends Prenda{

	public PrendaImportada(Double precioBase) {
		super(precioBase);
	}
	
	public PrendaImportada(Integer precioBase) {
		super(precioBase);
	}

	public Double tasaImportacion() {
		return 1.3;
	}

	public Boolean esImportado() {
		return true;
	}

}
