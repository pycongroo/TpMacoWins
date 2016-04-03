
public class TipoSombrero implements TipoPrenda{

	private Double coefMetro;
	
	public TipoSombrero(Double coefMetro){
		this.coefMetro = coefMetro;
	}
	
	public Double precioBase() {
		return 150*(1.0 + this.coefMetro);
	}
	
}
