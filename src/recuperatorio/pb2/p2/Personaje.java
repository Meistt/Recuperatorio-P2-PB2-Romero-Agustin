package recuperatorio.pb2.p2;

public abstract class Personaje {
	private String nombre;
	private String gema;
	
	public Personaje(String nombre, String gema) {
		this.nombre = nombre;
		this.gema = gema;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGema() {
		return gema;
	}

	public void setGema(String gema) {
		this.gema = gema;
	}
	
	
}
