import java.util.Date;

public class ProductoFresco extends Producto {
	protected Date fechaEnvasado;
	protected String granjaOrigen;
	
	public ProductoFresco(int nroLote, Date fechaVencimiento, Date fechaEnvasado, String granjaOrigen) {
		super(nroLote, fechaVencimiento);
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
		
	}
	
	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}
	
	public void setfechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	
	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	
	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	@Override
	public String toString() {
		return super.toString() + " fecha de envasado: " + fechaEnvasado + " " + " granja de origen: " + granjaOrigen + " ";
	}
}
