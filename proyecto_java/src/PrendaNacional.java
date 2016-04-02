
public class PrendaNacional extends Prenda{

	public PrendaNacional(TipoPrenda tipoPrenda) {
		super(tipoPrenda);
	}

	public Double tasaImportacion() {
		return 1.0;
	}
	
	public Boolean esImportado(){
		return false;
	}
	
}
