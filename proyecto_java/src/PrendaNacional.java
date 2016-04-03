
public class PrendaNacional extends Prenda{

	public PrendaNacional(TipoPrenda tipoPrenda, Marca marca) {
		super(tipoPrenda, marca);
	}

	public Double tasaImportacion() {
		return 1.0;
	}
	
	public Boolean esImportado(){
		return false;
	}
	
}
