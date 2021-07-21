package recuperatorio.pb2.p2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Batalla implements Comparator <Villano> {
	
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

	public String crearBatalla(Personaje heroe, Personaje villano) {
		
		if(!heroe.getTipoPj().equals(villano.getTipoPj())) {
			
			if(heroe.getPoderInicial()>villano.getPoderInicial()) {
				batallasGanadasHeroes.add((Heroe) heroe);
				return heroe.getNombre();
			}else
				batallasGanadasVillanos.add((Villano) villano);
				return villano.getNombre();
		}
		return null;
	}

	public Set<Heroe> getBatallasGanadasHeroes() {
		return batallasGanadasHeroes;
	}

	public void setBatallasGanadasHeroes(Set<Heroe> batallasGanadasHeroes) {
		this.batallasGanadasHeroes = batallasGanadasHeroes;
	}

	public Set<Villano> getBatallasGanadasVillanos() {
		return batallasGanadasVillanos;
	}

	public void setBatallasGanadasVillanos(Set<Villano> batallasGanadasVillanos) {
		this.batallasGanadasVillanos = batallasGanadasVillanos;
	}
	
	public Integer getGanadoresHeroes() {
		
		return this.batallasGanadasHeroes.size();
	}
	
	public Integer getGanadoresVillanos() {
		return this.batallasGanadasVillanos.size();
	}

	public Boolean salvarElMundo() throws WorldDestroyedException {
		if(this.batallasGanadasHeroes.size() > this.batallasGanadasVillanos.size()) {
			return true;
		}
		throw new WorldDestroyedException();
	}

	@Override
	public int compare(Villano o1, Villano o2) {
		if(o1.getNombre().compareTo(o2.getNombre())>0) {
			return 1;
	}else if(o1.getNombre().compareTo(o2.getNombre())<0) {
		return -1;
	}else
		return 0;
	}
	}
