
public class MarcaSarkany implements Marca {

	public Double coeficienteDeMarca(Double precioOriginal) {
		if (precioOriginal > 500){
			return 1.35;
		} else {
			return 1.10;
		}
	}

}
