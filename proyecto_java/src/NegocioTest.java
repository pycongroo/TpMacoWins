import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegocioTest {
	private Negocio macowins;
	private Prenda saco, pantalon, sombrero;

	@Before
	public void init(){
		//Seteo valorFijo
		macowins = new Negocio(100.0);
		//Seteo en valorFijo a las prendas
		Prenda.setValorFijoDeNegocio(macowins.getValorFijo());
		//Seteo los tipoPrenda
		saco = new PrendaImportada(new TipoSaco(0), new MarcaNula());
		pantalon = new PrendaNacional(new TipoPantalon(0), new MarcaNula());
		sombrero = new PrendaImportada(new TipoSombrero(0.2), new MarcaNula());
		macowins.vender(saco, 2, "21/03/2016");
		macowins.vender(pantalon, 1, "21/03/2016");
		macowins.vender(sombrero, 4, "21/02/2016");
	}
	
	@Test
	public void gananciaDelDia21032016debeDar1390() {
		Assert.assertEquals(
			1390, macowins.gananciasDelDia("21/03/2016"), 0.0);
	}
	
	@Test
	public void debeDar250(){
		Assert.assertEquals(350, pantalon.precioFinal(), 0.0);
	}
	@Test
	public void debeDar1560() {
		//System.out.printf("Probando: %s\n",macowins.gananciasDelDia("21/02/2016"));
		Assert.assertTrue(
			macowins.gananciasDelDia("21/02/2016")==1456);
	}
	
}
