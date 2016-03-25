import java.util.List;
import java.util.stream.Collectors;

public class MacoWins {
	
	private Float valorFijo;//valor determinado para todas las prendas
	private List<Venta> ventas;//coleccion de ventas
	
	public MacoWins(Float valorFijo){
		this.valorFijo =valorFijo;
	}
	
	public void vender(Prenda prenda, Integer cantidad, String fecha){
		Venta venta = new Venta(prenda, cantidad, fecha);
		this.ventas.add(venta);
	}
	
	public Float gananciasDelDia(String fecha){
		List<Float> listaVentasDelDia = (List<Float>)
			this.ventas.stream()
			.filter((Venta venta) -> venta.getFecha() == fecha)
			.map((Venta venta) -> venta.ganancia())
			.collect(Collectors.toList());
		return this.sumatoriaFloat(listaVentasDelDia);
	}
	
	private Float sumatoriaFloat(List<Float> lista){
		Float acum = (float) 0.0;
		for (Float num:lista){
			acum += num;
		}
		return acum;
	}

}
