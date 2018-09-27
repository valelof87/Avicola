import java.util.Date;

public class ProductoCongelado extends ProductoRefrigerado {

	public ProductoCongelado(int nroLote, Date fechaVencimiento, Date fechaEnvasado, String granjaOrigen, int codigoSA,
			float temperatura) {
		super(nroLote, fechaVencimiento, fechaEnvasado, granjaOrigen, codigoSA, temperatura);
	
	}

	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
