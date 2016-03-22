import java.util.ArrayList;

public class MacoWins {

	private Float valorFijo;
	private ArrayList<Venta> ventas;
	
	public MacoWins(Float valorFijo){
		this.valorFijo =valorFijo;
	}
	
	public Float calcularPrecioFinalDePrenda(Prenda prenda){
		return (this.valorFijo + prenda.getPrecioBase())*prenda.tasaImportacion();
	}

}
