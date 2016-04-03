
public class TipoSaco implements TipoPrenda{
	private Integer cantidadBotones;
	
	public TipoSaco(Integer cantidadBotones){
		this.cantidadBotones = cantidadBotones;
	}
	
	public Double precioBase(){
		return 300.0 + 10*Double.valueOf(this.cantidadBotones);
	}
}
