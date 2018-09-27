import java.util.Date;

public class TestAvicola {

	public static void main(String[] args) {
		
		Date fechaEnv= new Date(116, 5,3);
		Date fechaVen = new Date(118, 5,3);
		ProductoFresco huevo= new ProductoFresco(123, fechaEnv, fechaVen, "pollo loco" );
		
		
		
		ProductoCongelado arvejas = new ProductoCongelado(456, fechaEnv, fechaVen, "pollo loco", 852, 1);
		
		System.out.println(arvejas);

	}

}
