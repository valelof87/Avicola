import java.util.Date;

public class Producto {
	protected int nroLote;
	protected Date fechaVencimiento;
	
	public Producto (int nroLote, Date fechaVencimiento) {
		this.nroLote = nroLote;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public int getNroLote() {
		return nroLote;
	}
	
	public void setNroLote(int nroLote) {
		this.nroLote= nroLote;
	}
	
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	public void setfechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public String toString() {
		return "nro de lote: " + nroLote + " " + "fecha de vencimiento: " + fechaVencimiento;
	}
}
