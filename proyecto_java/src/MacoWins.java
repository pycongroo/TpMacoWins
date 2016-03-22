import java.util.ArrayList;

public class MacoWins {
	//valor determinado para todas las prendas
	private Float valorFijo;
	//coleccion de ventas
	private ArrayList<Venta> ventas;
	
	public MacoWins(Float valorFijo){
		this.valorFijo =valorFijo;
	}
	
	public Float calcularPrecioFinalDePrenda(Prenda prenda){
		//metodo para calcular precio final de prenda
		return (this.valorFijo + prenda.getPrecioBase())*prenda.tasaImportacion();
	}

}
