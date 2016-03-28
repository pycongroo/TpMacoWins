import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MacoWins {
	
	private Double valorFijo;//valor determinado para todas las prendas
	private List<Venta> ventas;//coleccion de ventas
	private static HashMap<String, Double> tipoPrendas;
	
	public MacoWins(Double valorFijo){
		this.valorFijo =valorFijo;
		this.ventas = new ArrayList<Venta>();
		MacoWins.tipoPrendas = new HashMap<String, Double>();
	}
	
	public Double getValorFijo() {
		return this.valorFijo;
	}
	
	public static void addPrenda(String nombre, Double precioBase){
		MacoWins.tipoPrendas.put(nombre, precioBase);
	}
	
	public static void addPrenda(String nombre, Integer precioBase){
		MacoWins.tipoPrendas.put(nombre, Double.valueOf(precioBase));
	}
	
	public static Double getPrecioBase(String tipoPrenda){
		return MacoWins.tipoPrendas.get(tipoPrenda);
	}

	public void vender(Prenda prenda, Integer cantidad, String fecha){
		Venta venta = new Venta(prenda, cantidad, fecha);
		//salida en pantalla para verificar inicializacion
		//System.out.println(venta.toString());
		this.ventas.add(venta);
	}
	
	public Double gananciasDelDia(String fecha){
		List<Double> listaVentasDelDia = (List<Double>)
			this.ventas.stream()
			.filter((Venta venta) -> venta.getFecha() == fecha)
			.map((Venta venta) -> venta.ganancia())
			.collect(Collectors.toList());
		return this.sumatoriaDouble(listaVentasDelDia);
	}
	
	public List<Venta> ventasDePrendasImportadas(){
		return (List<Venta>) this.ventas.stream()
				.filter((Venta venta) -> venta.tienePrendasImportadas())
				.collect(Collectors.toList());
	}
	
	private Double sumatoriaDouble(List<Double> lista){
		Double acum = 0.0;
		for (Double num:lista){
			acum += num;
		}
		return acum;
	}

}
