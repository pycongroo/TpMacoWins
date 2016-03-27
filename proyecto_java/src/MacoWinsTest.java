import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MacoWinsTest {
	private MacoWins macowins;

	@Before
	public void init(){
		macowins = new MacoWins(100.0);
		Prenda.setValorFijoDeNegocio(macowins.getValorFijo());
		Prenda saco = new PrendaImportada(300);
		Prenda pantalon = new PrendaNacional(250);
		Prenda camisa = new PrendaImportada(200);
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
