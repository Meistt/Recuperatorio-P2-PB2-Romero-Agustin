package recuperatorio.pb2.p2;

public class Villano extends Personaje{
	
	private Integer poderInicial;
	
	public Villano(String nombre, String gema, Integer poderInicial) {
		super(nombre, gema);
		this.poderInicial = poderInicial;
	}

	public Integer getPoderInicial() {
		return poderInicial;
	}

	public void setPoderInicial(Integer poderInicial) {
		this.poderInicial = poderInicial;
	}

	
}
