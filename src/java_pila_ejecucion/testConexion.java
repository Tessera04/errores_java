package java_pila_ejecucion;

public class testConexion {
	public static void main(String[] args) {
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		}catch (IllegalStateException ex){
			ex.printStackTrace();
		} finally {
			con.cerrar();
		}
		
	}
}
