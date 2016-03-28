import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
	
	private Double valorFijo;//valor determinado para todas las prendas
	private List<Venta> ventas;//coleccion de ventas
	private HashMap<String, Double> tipoPrendas;
	
	public Negocio(Double valorFijo){
		this.valorFijo =valorFijo;
		this.ventas = new ArrayList<Venta>();
		this.tipoPrendas = new HashMap<String, Double>();
	}
	
	public Double getValorFijo() {
		return this.valorFijo;
	}
	
	public void addPrenda(String nombre, Double precioBase){
		this.tipoPrendas.put(nombre, precioBase);
	}
	
	public void addPrenda(String nombre, Integer precioBase){
		this.tipoPrendas.put(nombre, Double.valueOf(precioBase));
	}
	
	public Double getPrecioBase(String tipoPrenda){
		return this.tipoPrendas.get(tipoPrenda);
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
			.map((Venta venta) -> venta.gananciaEn(this))
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
