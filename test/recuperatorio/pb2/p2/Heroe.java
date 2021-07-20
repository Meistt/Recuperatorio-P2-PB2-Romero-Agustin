package recuperatorio.pb2.p2;

public class Heroe extends Personaje {
	
	private Integer poderInicial;
	
	public Heroe(String nombre, String gema, Integer poderInicial) {
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
