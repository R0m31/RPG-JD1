package principal.tiempo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import principal.herramientas.CargadorRecursos;

public class Tick {
	
	private int tick = 0;//tiempo en milisegundos
	private static int segundo = 0;//tiempo en segundos
	private static int minuto = 0;
	private static int hora = 0;
	private static int dia = 0;
	private static int mes = 0;
	private static int a�o = 0;
	
	private static boolean amanecer = false; // < 6 am
	private static boolean ma�ana = false;   // < 12 pm
	private static boolean tarde = false;	 // < 6 pm
	private static boolean anochecer = false;// < 8 pm
	private static boolean noche = false;	 // < 8pm - 6am
	
	BufferedImage sombraNoche;
	
	public Tick() {
		
		sombraNoche = CargadorRecursos.cargarImagenCompatibleTranslucida("/graficos/iconos/sombraNoche.png");
	}

	public void tiempoTranscurrido() {
		tick++;
		
		if (tick > 5) {
			segundo++;
			tick = 0;
			if (segundo > 5) {
				minuto++;
				segundo = 0;
				if (minuto > 5) {
					hora++;
					minuto = 0;
					if(hora > 10) {
						dia++;
						hora = 0;
					}
				}
			}
		}
	}

	public void interruptoresCicloDiaNoche() {
	
		if(hora < 2) {
			anochecer = false;
			noche = true;
		}
		if(hora >= 2) {
			noche = false;	
			amanecer = true;
		}
		if (hora >= 3) {
			amanecer = false;
			ma�ana = true;	
		}
		if (hora >= 5) {
			ma�ana = false;
			tarde = true;
		}
		if (hora >= 7) {
			tarde = false;
			anochecer = true;
		}
		if (hora >= 8) {
			anochecer = false;
			noche = true;
		}		
	}

	public void dibujar(final Graphics g) {

		if(hora < 2) {
			/*DibujoDebug.dibujarRectanguloRelleno(g, 
					0,
					0,
					ElementosPrincipales.mapa.obtenerAnchoMapa(),
					ElementosPrincipales.mapa.obtenerAltoMapa(),
					Configuracion.COLOR_AZUL_OSCURO);
			
			DibujoDebug.dibujarImagen(g, sombraNoche, 0, 0);
			*/
		}
	}
	
	public void actualizar() {
		tiempoTranscurrido();
		interruptoresCicloDiaNoche();
	}
	
	public static boolean obtenerInterruptorNoche() {
		return noche;
	}
	public static boolean obtenerInterruptorAmanecer() {
		return amanecer;
	}
	public static boolean obtenerInterruptorMa�ana() {
		return ma�ana;
	}
	public static boolean obtenerInterruptorTarde() {
		return tarde;
	}
	public static boolean obtenerInterruptorAnochecer() {
		return anochecer;
	}
	public static int obtenerSegundo() {
		return segundo;
	}
	public static int obtenerMinuto() {
		return minuto;
	}
	public static int obtenerHora() {
		return hora;
	}
}
