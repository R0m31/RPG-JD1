package principal;

import principal.control.GestorControles;
import principal.graficos.SuperficieDibujo;
import principal.graficos.Ventana;
import principal.herramientas.DatosDebug;
import principal.maquinaestado.GestorEstados;
import principal.tiempo.Tick;

public class GestorPrincipal {
	
	private boolean enFuncionamiento = false;
	private String titulo;
	private int ancho;
	private int alto;
	
	public static SuperficieDibujo sd;
	private Ventana ventana;
	private GestorEstados ge;
	
	private Tick t;//
	
	private static int fps = 0;
	private static int aps = 0;
	
	private GestorPrincipal(final String titulo, final int ancho, final int alto) {
		this.titulo = titulo;
		this.ancho = ancho;
		this.alto = alto;
	}

	public static void main(String[] args) {
		
		System.setProperty("sun.java2d.opengl", "true");
		
		GestorPrincipal gp = new GestorPrincipal(Constantes.NOMBRE_JUEGO, 
													Constantes.ANCHO_PANTALLA_COMPLETA,	
														Constantes.ALTO_PANTALLA_COMPLETA);
		//cambiar esto para ventana pequeña
		
		gp.iniciarJuego();
		gp.iniciarBuclePrincipal();
		
	}

	private void iniciarJuego() {
		enFuncionamiento = true;
		inicializar();
	}
	
	private void inicializar() {
		sd = new SuperficieDibujo(ancho, alto);
		ventana = new Ventana(titulo, sd);
		ge = new GestorEstados(sd, ge);
		
		t = new Tick();//
	}

	private void iniciarBuclePrincipal() {
		int actualizacionesAcumuladas = 0;
		int framesAcumulados = 0;
				
		final int NS_POR_SEGUNDO = 1000000000;
		final int APS_OBJETIVO = 60; 
		double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;

		long referenciaActualizacion = System.nanoTime();
		long referenciaContador = System.nanoTime();

		double tiempoTranscurrido;
		double delta = 0;
		
		while (enFuncionamiento) {
			final long inicioBucle = System.nanoTime();

			tiempoTranscurrido = inicioBucle - referenciaActualizacion;
			referenciaActualizacion = inicioBucle;
			
			delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;

			while (delta >= 1) {
				actualizar();
				actualizacionesAcumuladas++;
				delta--;
				
				}
		
			dibujar();
			framesAcumulados++;

			if (System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {
				
				aps = actualizacionesAcumuladas;
				fps = framesAcumulados;

				actualizacionesAcumuladas = 0;
				framesAcumulados = 0;
				referenciaContador = System.nanoTime();
			}
		}
	}

	private void actualizar() {

		//CAMBIO DE ESTADOS
		if (GestorControles.teclado.inventarioActivo) {
			ge.cambiarEstadoActual(1);
		}else {
			ge.cambiarEstadoActual(0);
		}
		//FIN CAMBIAR ESTADOS
		
		ge.actualizar();
		sd.actualizar();
		
		t.actualizar();//
	}
	
	private void dibujar() {
		sd.dibujar(ge);
		
		DatosDebug.enviarDato("FPS: " + fps);
		DatosDebug.enviarDato("APS: " + aps);
	}

	public static int obtenerFPS() {
		return fps;
	}

	public static int obtenerAPS() {
		return aps;
	}
}