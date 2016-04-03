
public class PrendaImportada extends Prenda{

	public PrendaImportada(TipoPrenda tipoPrenda, Marca marca) {
		super(tipoPrenda, marca);
	}

	public Double tasaImportacion() {
		return 1.3;
	}

	public Boolean esImportado() {
		return true;
	}

}
