import java.util.Date;

public class ProductoRefrigerado extends ProductoFresco {
	protected int codigoSA;
	protected float temperatura;
	
	public ProductoRefrigerado(int nroLote, Date fechaVencimiento,Date fechaEnvasado, String granjaOrigen, int codigoSA, float temperatura) {
		super(nroLote, fechaVencimiento,fechaEnvasado, granjaOrigen);
		this.codigoSA = codigoSA;
		this.temperatura = temperatura;
		
	}
	
	public int getCodigoSA() {
		return codigoSA;
	}
	
	public void setCodigoSA(int codigoSA) {
		this.codigoSA = codigoSA;
	}
	
	public float getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(float temperatura) {
		this.temperatura= temperatura;
	}
	
	@Override
	public String toString() {
		return super.toString() + "codigo SA: " + codigoSA + " " + " temperatura recomendada: " + temperatura;
	}

}
