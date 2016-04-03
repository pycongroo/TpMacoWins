import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
	
	private Double valorFijo;//valor determinado para todas las prendas
	private List<Venta> ventas;//coleccion de ventas
	
	public Negocio(Double valorFijo){
		this.valorFijo =valorFijo;
		this.ventas = new ArrayList<Venta>();
	}
	
	public Double getValorFijo() {
		return this.valorFijo;
	}

	public void vender(Prenda prenda, Integer cantidad, String fecha){
		Venta venta = new Venta(prenda, cantidad, fecha);
		//salida en pantalla para verificar inicializacion
		//System.out.println(venta.toString());
		this.ventas.add(venta);
	}
	
	public Double gananciasDelDia(String fecha){
		return this.ventas.stream()
			.filter((Venta venta) -> venta.getFecha() == fecha)
			.map((Venta venta) -> venta.ganancia())
			.reduce(0.0, Double::sum);
	}
	
	public List<Venta> ventasDePrendasImportadas(){
		return (List<Venta>) this.ventas.stream()
				.filter((Venta venta) -> venta.tienePrendasImportadas())
				.collect(Collectors.toList());
	}

}
