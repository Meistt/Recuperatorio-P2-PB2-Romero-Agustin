package recuperatorio.pb2.p2;

import java.util.HashSet;
import java.util.Set;

public class Escuadron {
	private String nombre;
	private Set <Heroe> heroes;
	private Set <Villano> villanos;
	
	public Escuadron (String nombre) {
		this.nombre = nombre;
		this.heroes = new HashSet<>();
		this.villanos = new HashSet <>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarHeroes(Heroe heroeNuevo) {
		this.heroes.add(heroeNuevo);
	}


	public Set<Heroe> getHeroes() {
		return heroes;
	}


	public void setHeroes(Set<Heroe> heroes) {
		this.heroes = heroes;
	}


	public Set<Villano> getVillanos() {
		return villanos;
	}

	public void setVillanos(Set<Villano> villanos) {
		this.villanos = villanos;
	}

	public Integer getHeroesTotal() {
		return this.heroes.size();
	}

	public void agregarVillanos(Villano nuevoVillano) {
		this.villanos.add(nuevoVillano);
	}

	public Integer getVillanosTotal() {
		return this.villanos.size();
	}


	
	
}
