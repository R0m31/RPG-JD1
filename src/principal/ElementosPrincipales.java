package principal;

import principal.entes.Jugador;
import principal.inventario.Inventario;
import principal.mapas.MapaTiled;

public class ElementosPrincipales {

	public static MapaTiled mapa = new MapaTiled("/mapas/mapabosque2.json");
	
	// asi se puede dibujar dos mapas, uno debajo y uno encima
	//public static MapaTiled mapa2 = new MapaTiled("/mapas/mapabosque2.json");
	
	public static Jugador jugador = new Jugador();
	
	public static Inventario inventario = new Inventario();
}
