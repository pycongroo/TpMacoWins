import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegocioTest {
	private Negocio macowins;

	@Before
	public void init(){
		//Seteo valorFijo
		macowins = new Negocio(100.0);
		//Seteo en valorFijo a las prendas
		Prenda.setValorFijoDeNegocio(macowins.getValorFijo());
		//Seteo los tipoPrenda
		//TipoPrenda tipoSaco = new TipoPrenda("saco", 300);
		//TipoPrenda tipoPantalon = new TipoPrenda("pantalon", 250);
		//TipoPrenda tipoCamisa = new TipoPrenda("c", 200);
		Prenda saco = new PrendaImportada(new TipoSaco(0), new MarcaNula());
		Prenda pantalon = new PrendaNacional(new TipoPantalon(0), new MarcaNula());
		Prenda sombrero = new PrendaImportada(new TipoSombrero(0.2), new MarcaNula());
		macowins.vender(saco, 2, "21/03/2016");
		macowins.vender(pantalon, 1, "21/03/2016");
		macowins.vender(sombrero, 4, "21/02/2016");
		//System.out.println("Init correcto");
	}
	
	@Test
	public void debeDar1390() {
		//System.out.printf("Probando: %s\n",macowins.gananciasDelDia("21/03/2016"));
		Assert.assertTrue(
			macowins.gananciasDelDia("21/03/2016")==1390);
	}
	
	@Test
	public void debeDar1560() {
		//System.out.printf("Probando: %s\n",macowins.gananciasDelDia("21/02/2016"));
		Assert.assertTrue(
			macowins.gananciasDelDia("21/02/2016")==1456);
	}
	
	@Test
	public void debeDar2(){
		Assert.assertTrue(macowins.ventasDePrendasImportadas().size()==2);
	}
}
