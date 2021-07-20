package recuperatorio.pb2.p2;

public abstract class Personaje {
	private String nombre;
	private String gema;
	private Integer poderInicial;
	
	public Personaje(String nombre, String gema, Integer poderInicial) {
		this.nombre = nombre;
		this.gema = gema;
		this.poderInicial = poderInicial;
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

	public Integer getPoderInicial() {
		return poderInicial;
	}

	public void setPoderInicial(Integer poderInicial) {
		this.poderInicial = poderInicial;
	}
	
	
}
