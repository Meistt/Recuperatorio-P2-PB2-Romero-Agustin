package recuperatorio.pb2.p2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


public class TestMarvel {


	@Test
	public void queSePuedaCrearUnEscuadronDeHeroes() {
		Escuadron nuevo = new Escuadron("Heroes");
		Heroe capitanAmerica = new Heroe("Capitan America", "Poder", 160, "Heroe");
		Heroe hulk = new Heroe("Hulk", "Alma", 150, "Heroe");
		Heroe ironMan = new Heroe("Iron Man", "Espacio", 200, "Heroe");
		
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
		Villano loki = new Villano("Loki", "Realidad", 175,"Villano");
		Villano redSkull = new Villano("Red Skull", "Mente", 60,"Villano");
		Villano winterSoldier = new Villano("Winter Soldier", "Tiempo", 180, "Villano");
		
		nuevo.agregarVillanos(loki);
		nuevo.agregarVillanos(redSkull);
		nuevo.agregarVillanos(winterSoldier);
		
		Integer ce = 3;
		Integer co = nuevo.getVillanosTotal();
		
		assertEquals(ce,co);
	}
	
	@Test
	public void queSePuedaTriplicarElPoderInicial() {
		
		Batalla nueva = new Batalla("Infinito");
		
		Personaje capitanAmerica = new Heroe ("Capitan America", "Poder", 75, "Heroe");
		
		Personaje ironMan = new Heroe("Iron Man", "Espacio", 200, "Heroe");
		
		Personaje loki = new Villano("Loki", "Realidad", 175, "Villano");
		
		Personaje winterSoldier = new Villano("Winter Soldier", "Tiempo", 180, "Villano");
		
		Integer poder1 = capitanAmerica.getPoderInicial();
		Integer poder2 = ironMan.getPoderInicial();
		Integer poder3 = loki.getPoderInicial();
		Integer poder4 = winterSoldier.getPoderInicial();
		
		
		assertEquals((Integer)225, poder1);
		assertEquals((Integer)400, poder2);
		assertEquals((Integer)350, poder3);
		assertEquals((Integer)540, poder4);
		
		
	}
	
	@Test
	public void queSePuedaPelearUnaBatallaYObtenerElGanador() {
		Batalla nueva = new Batalla ("End Game");
		
		Personaje capitanAmerica = new Heroe ("Capitan America", "Poder", 75, "Heroe");
		Personaje winterSoldier = new Villano("Winter Soldier", "Tiempo", 180, "Villano");
		
		String vo=nueva.crearBatalla(capitanAmerica, winterSoldier);
		
		assertEquals("Winter Soldier", vo);
		
	}
	
	@Test
	public void queSePuedanOrdenarLasBatallasVillanos() {
		
		Batalla nueva1 = new Batalla("End Game");
		Batalla nueva2 = new Batalla("ABC");
		Batalla nueva3 = new Batalla("BCD");
		
		Personaje capitanAmerica = new Heroe ("Capitan America", "Poder", 75, "Heroe");
		Personaje winterSoldier = new Villano("Winter Soldier", "Tiempo", 180, "Villano");
		Heroe hulk = new Heroe("Hulk", "Alma", 30, "Heroe");
		Heroe ironMan = new Heroe("Iron Man", "Espacio", 200, "Heroe");
		Villano loki = new Villano("Loki", "Realidad", 175, "Villano");
		Personaje redSkull = new Villano("Red Skull", "Mente", 320,"Villano");
		
		nueva1.crearBatalla(capitanAmerica, winterSoldier);
		nueva1.crearBatalla(hulk, loki);
		nueva1.crearBatalla(ironMan, redSkull);
		
		List<Villano> villanos = new ArrayList<>(nueva1.getBatallasGanadasVillanos());	
		
	}
	
	
	@Test
	public void queSePuedaSalvarElMundo() throws WorldDestroyedException {
		
		Batalla nueva1 = new Batalla("End Game");
		Batalla nueva2 = new Batalla("ABC");
		Batalla nueva3 = new Batalla("BCD");
		
		Personaje capitanAmerica = new Heroe ("Capitan America", "Poder", 200, "Heroe");
		Personaje winterSoldier = new Villano("Winter Soldier", "Tiempo", 180, "Villano");
		Heroe hulk = new Heroe("Hulk", "Alma", 300, "Heroe");
		Heroe ironMan = new Heroe("Iron Man", "Espacio", 200, "Heroe");
		Villano loki = new Villano("Loki", "Realidad", 105, "Villano");
		Personaje redSkull = new Villano("Red Skull", "Mente", 36,"Villano");
		
		nueva1.crearBatalla(capitanAmerica, winterSoldier);
		nueva1.crearBatalla(hulk, loki);
		nueva1.crearBatalla(ironMan, redSkull);
		Boolean resultado;
		resultado = nueva1.salvarElMundo();
		
	}
	
}
