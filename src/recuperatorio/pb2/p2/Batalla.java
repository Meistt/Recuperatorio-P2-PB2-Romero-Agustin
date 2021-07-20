package recuperatorio.pb2.p2;

import java.util.HashSet;
import java.util.Set;

public class Batalla {
	
	private String nombreBatalla;
	private Set <Heroe> batallasGanadasHeroes;
	private Set <Villano> batallasGanadasVillanos;
	
	public Batalla(String nombreBatalla) {
		this.nombreBatalla = nombreBatalla;
		this.batallasGanadasHeroes = new HashSet <>();
		this.batallasGanadasVillanos = new HashSet <>();
	}

	public String getNombreBatalla() {
		return nombreBatalla;
	}

	public void setNombreBatalla(String nombreBatalla) {
		this.nombreBatalla = nombreBatalla;
	}

	public Integer triplicarPoderPersonaje(Personaje pj) {
		String poder= pj.getGema();
		Integer cantidadPoder;
		Integer resultadoPoder = 0;
		
		switch(poder) {
		case "Tiempo":
			cantidadPoder = pj.getPoderInicial();
			resultadoPoder= cantidadPoder *3;
			break;
		case "Mente":
			cantidadPoder = pj.getPoderInicial();
			resultadoPoder= cantidadPoder *3;
			break;
		case "Poder":
			cantidadPoder = pj.getPoderInicial();
			resultadoPoder= cantidadPoder *3;
			break;
		}
		cantidadPoder= pj.getPoderInicial();
		resultadoPoder= cantidadPoder*2;
		
		return resultadoPoder;
		
	}

	
	
}
