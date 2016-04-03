
public class TipoPantalon implements TipoPrenda {
	
	private Integer cantidadTela;
	
	public TipoPantalon(Integer cantidadTela) {
		this.cantidadTela = cantidadTela;
	}

	public Double precioBase() {
		return 250.0 + Double.valueOf(this.cantidadTela);
	}

}
