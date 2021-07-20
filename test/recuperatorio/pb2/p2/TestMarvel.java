package recuperatorio.pb2.p2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestMarvel {


	@Test
	public void queSePuedaCrearUnEscuadronDeHeroes() {
		Escuadron nuevo = new Escuadron("Heroes");
		Heroe capitanAmerica = new Heroe("Capitan America", "Poder", 75);
		Heroe hulk = new Heroe("Hulk", "Alma", 150);
		Heroe ironMan = new Heroe("Iron Man", "Espacio", 200);
		
		nuevo.agregarHeroes(capitanAmerica);
		nuevo.agregarHeroes(hulk);
		nuevo.agregarHeroes(ironMan);
		
		Integer ce = 3;
		Integer co = nuevo.getHeroesTotal();
		
		assertEquals(ce,co);
		
	}
	
	@Test
	public void queSePuedaCrearUnEscuadronDeVillanos() {
		Escuadron nuevo = new Escuadron("Villanos");
		Villano loki = new Villano("Loki", "Realidad", 175);
		Villano redSkull = new Villano("Red Skull", "Mente", 60);
		Villano winterSoldier = new Villano("Winter Soldier", "Tiempo", 180);
		
		nuevo.agregarVillanos(loki);
		nuevo.agregarVillanos(redSkull);
		nuevo.agregarVillanos(winterSoldier);
		
		Integer ce = 3;
		Integer co = nuevo.getVillanosTotal();
		
		assertEquals(ce,co);
	}
	
	@Test
	public void queSePuedaTriplicarElPoderInicial() {
		Heroe capitanAmerica = new Heroe("Capitan America", "Poder", 75);
		Heroe ironMan = new Heroe("Iron Man", "Espacio", 200);
	}
}
