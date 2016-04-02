
public class PrendaImportada extends Prenda{

	public PrendaImportada(TipoPrenda tipoPrenda) {
		super(tipoPrenda);
	}

	public Double tasaImportacion() {
		return 1.3;
	}

	public Boolean esImportado() {
		return true;
	}

}
