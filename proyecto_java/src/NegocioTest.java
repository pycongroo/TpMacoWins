import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegocioTest {
	private Negocio macowins;

	@Before
	public void init(){
		//Seteo valorFijo
		macowins = new Negocio(100.0);
		//Seteo precioBase de prendas
		macowins.addPrenda("saco", 300);
		macowins.addPrenda("pantalon", 250);
		macowins.addPrenda("camisa", 200);
		//seteo las prendas
		Prenda saco = new PrendaImportada("saco");
		Prenda pantalon = new PrendaNacional("pantalon");
		Prenda camisa = new PrendaImportada("camisa");
		macowins.vender(saco, 2, "21/03/2016");
		macowins.vender(pantalon, 1, "21/03/2016");
		macowins.vender(camisa, 4, "21/02/2016");
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
			macowins.gananciasDelDia("21/02/2016")==1560);
	}
	
	@Test
	public void debeDar2(){
		Assert.assertTrue(macowins.ventasDePrendasImportadas().size()==2);
	}
}
