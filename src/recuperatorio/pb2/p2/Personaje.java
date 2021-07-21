package recuperatorio.pb2.p2;

public abstract class Personaje {
	
	private String nombre;
	private String gema;
	private Integer poderInicial;
	private String tipoPj;
	
	public Personaje(String nombre, String gema, Integer poderInicial, String tipoPj) {
		this.nombre = nombre;
		this.gema = gema;
		this.poderInicial = poderInicial;
		this.tipoPj = tipoPj;
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
		
		if(gema.equals("Tiempo") || gema.equals("Mente") || gema.equals("Poder")) {
			
			return poderInicial*3;
		}else
			
			return poderInicial*2;
	}

	public void setPoderInicial(Integer poderInicial) {
		this.poderInicial = poderInicial;
	}

	public String getTipoPj() {
		return tipoPj;
	}

	public void setTipoPj(String tipoPj) {
		this.tipoPj = tipoPj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
