
public class TipoZapato implements TipoPrenda{
	private Integer talle;

	public TipoZapato(Integer talle) {
		this.talle = talle;
	}
	
	public Double precioBase(){
		return 400 + 5*Double.valueOf(this.talle);
	}
}
