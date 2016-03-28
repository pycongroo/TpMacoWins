
public class PrendaImportada extends Prenda{

	public PrendaImportada(String tipoPrenda) {
		super(tipoPrenda);
	}

	public Double tasaImportacion() {
		return 1.3;
	}

	public Boolean esImportado() {
		return true;
	}

}
