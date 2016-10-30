package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import principal.herramientas.CargadorRecursos;

public class Constantes {

	public static final int LADO_SPRITE = 32;
	public static final int LADO_SPRITE_DOBLE = 64;

	public static int LADO_CURSOR = 0; // icono de cursores cuadrados

	public static String NOMBRE_JUEGO = "SancTuariA";

	public static String NOMBRE_JUGADOR = "Ross";
	
	public static String MENSAJE_BIENVENIDA = "Haz click para comenzar...";
	
	public static String NUMERO_VERSION = "version 0.0.1";
	public static String NOMBRE_COMPAÑIA = "Sanctuaria CA";
	public static String DERECHOS_RESERVADOS = "Todos los derechos reservados";

	// RESOLUCION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static int ANCHO_JUEGO = 800; // 640 JavadevOne - 800 = 25 sprites
	public static int ALTO_JUEGO = 640; // 360 JavadevOne - 640 = 20 sprites

	public static int ANCHO_PANTALLA_COMPLETA = 800; // 1280
	public static int ALTO_PANTALLA_COMPLETA = 640; // 1024

	public static double FACTOR_ESCALADO_X = (double) ANCHO_PANTALLA_COMPLETA / (double) ANCHO_JUEGO;
	public static double FACTOR_ESCALADO_Y = (double) ALTO_PANTALLA_COMPLETA / (double) ALTO_JUEGO;

	public static int CENTRO_VENTANA_X = ANCHO_JUEGO / 2;
	public static int CENTRO_VENTANA_Y = ALTO_JUEGO / 2;

	public static int CENTRO_MARGEN_X = ANCHO_JUEGO / 2 - LADO_SPRITE / 2;
	public static int CENTRO_MARGEN_Y = ALTO_JUEGO / 2 - LADO_SPRITE / 2;
	
	public static Dimension TAMAÑO_PANTALLA = Toolkit.getDefaultToolkit().getScreenSize();
	public static int TAMAÑO_ANCHO_PANTALLA = TAMAÑO_PANTALLA.width;
	public static int TAMAÑO_ALTO_PANTALLA = TAMAÑO_PANTALLA.height;
	
	public static int CENTRO_LINEA_X1 = ANCHO_JUEGO / 4;
	public static int CENTRO_LINEA_X2 = ANCHO_JUEGO / 4 * 3;
	
	// TAMAÑOS FUENTES !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static float TAMAÑO_FUENTE_NORMAL = 10f;
	public static float TAMAÑO_FUENTE_PEQ = 9f;

	// VELOCIDAD!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static int VELOCIDAD_CAMINAR = 2;
	public static int VELOCIDAD_CORRER = 3;

	// RUTAS de MAPAS!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static String RUTA_MAPA = "/mapas/prueba"; //MAPA INICIAL

	// RUTAS de IMAGENES PRINCIPALES!!!!!!!!!!!!!
	public static String RUTA_ICONO_RATON = "/graficos/iconos/cursorPrueba4.png";
	public static String RUTA_ICONO_OVER = "/graficos/iconos/cursorPrueba4Seleccionado.png";
	public static String RUTA_ICONO_VENTANA = "/graficos/iconos/iconoVentana.png";
	public static String RUTA_LOGOTIPO = "/graficos/iconos/logoPrueba1.png";
	
	public static String RUTA_FONDO_MENU_INICIAL = "/graficos/interfaz/FondoMenuInicial800x640.png";
	public static String RUTA_FONDO_MENU_INICIAL_DOS = "/graficos/interfaz/FondoMenuInicial800x640Dos.png";
	
	public static String RUTA_SOMBRA_CUEVA = "/graficos/iconos/sombreadoCuevaPokemon.png";
	public static String RUTA_SOMBRA_NOCHE = "/graficos/iconos/sombraNoche.png";

	// RUTAS DE HOJAS DE OBJETOS!!!!!!!!!!!!!!!!!
	public static String RUTA_ICONO_CONTENEDOR = "/graficos/iconos/iconoContenedor.png";
	
	public static String RUTA_OBJETOS = "/graficos/hojasObjetos/1.png";
	public static String RUTA_OBJETOS_ARMAS = "/graficos/hojasObjetos/armas.png";

	// RUTAS DE HOJAS DE SPRITES!!!!!!!!!!!!!!!!!
	public static String RUTA_PERSONAJE = "/graficos/hojasPersonajes/playerjuan.png";
	public static String RUTA_PERSONAJE_CORRIENDO = "/graficos/hojasPersonajes/playerTu.png";

	public static String RUTA_PERSONAJE_RECTANGULAR = "/graficos/hojasPersonajes/playerTu.png";
	public static String RUTA_PERSONAJE_RECTANGULAR_CORRIENDO = "/graficos/hojasPersonajes/playerTu.png";
	
	// RUTAS DE HOJAS DE ENEMIGOS!!!!!!!!!!!!!!!!!!!!
	public static String RUTA_ENEMIGOS = "/graficos/hojasPersonajes/enemigos/";
	
	// PARTICULAS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static String RUTA_PARTICULA = "/graficos/hojasPersonajes/particulas/unPx.png";

	// FONTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static Font FUENTE_NORMAL = CargadorRecursos.cargarFuente("/fuentes/ARIAL.ttf");
	public static Font FUENTE_PIXEL_MEDIEVAL = CargadorRecursos.cargarFuente("/fuentes/alagard.ttf");
	public static Font FUENTE_PIXEL = CargadorRecursos.cargarFuente("/fuentes/zeldadxt.ttf");

	// SONIDOS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static String RUTA_SONIDO_ACEPTAR = "/audio/sonido/aceptar.wav";
	public static String RUTA_SONIDO_CANCELAR = "/audio/sonido/cancel1.wav";
	public static String RUTA_SONIDO_ATACAR = "/audio/sonido/ataque1.wav";

	// MUSICA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static String RUTA_MUSICA_MUSICAPRUEBA = "/audio/musica/alchemistmusica1.mid";

	// INTERFAZ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static String RUTA_INTERFAZ_FONDO = "/graficos/interfaz/InterfazGraficaFondo.png";
	public static String RUTA_INTERFAZ_FONDO_DOS = "/graficos/interfaz/InterfazGraficaDiseño33.png";
	
	public static String RUTA_ICONOS_CICLO = "/graficos/interfaz/cicloDiaNoche.png";
	public static String RUTA_ICONOS_CICLO_DOS = "/graficos/interfaz/cicloDiaNocheDos.png";
	
	public static String RUTA_RETRATO_PERSONAJE = "/graficos/retratos/retrato.png";
	
	public static String RUTA_PLANTILLA_GUI = "/graficos/gui/GUIplantilla1.png";

	// PARAMETROS, CLASES o Razas de Personajes!!!!!!!!!!!!!!!!!!!!!!!!
	public static String FUERZA; //cc
	public static String DESTREZA; //dist
	public static String DUREZA; //Hp
	public static String VOLUNTAD; //Mp, magia
	public static String AZAR; //suerte	

	public static String NOMBRE_RAZA_A = "Hurpe";
	public static String NOMBRE_RAZA_B = "Cidarim";
	public static String NOMBRE_RAZA_C = "Montem";
	public static String NOMBRE_RAZA_D = "Unanim";
	
	public static String NOMBRE_CLASE_1 = "Guerrero";
	public static String NOMBRE_CLASE_2 = "Mago";

	/*
	// COLORES DB16
	public static Color COLOR_BLANCO_VERDE = new Color(0xDEEED6);
	public static Color COLOR_MAGENTA_NEGRO = new Color(0x140C1C);
	public static Color COLOR_VIOLETA = new Color(0x442434);
	public static Color COLOR_AZUL_BANDERA_SATURADO = new Color(0x30346D);
	public static Color COLOR_GRIS = new Color(0x4E4A4E);
	public static Color COLOR_MARRON_SATURADO = new Color(0x854C30);
	public static Color COLOR_VERDE_OSCURO = new Color(0x346524);
	public static Color COLOR_ROJO_SATURADO = new Color(0xD04648);
	public static Color COLOR_GRIS_CLARO = new Color(0x757161);
	public static Color COLOR_AZUL_CIELO = new Color(0x597DCE);
	public static Color COLOR_NARANJA_SATURADO = new Color(0xD27D2C);
	public static Color COLOR_AZUL_GRISASEO = new Color(0x8595A1);
	public static Color COLOR_VERDE_CLARO = new Color(0x6DAA2C);
	public static Color COLOR_ROSADO = new Color(0xD2AA99);
	public static Color COLOR_CELESTE = new Color(0x6DC2CA);
	public static Color COLOR_AMARILLO_SATURADO = new Color(0xDAD45E);
	*/
	/*	
	//COLORES 32DB	
	public static Color COLOR_NEGRO = new Color(0x000000);
	public static Color COLOR_BLANCO = new Color(0xFFFFFF);
	public static Color COLOR_AZUL_OSCURO = new Color(0x222034);
	public static Color COLOR_MAGENTA_OSCURO = new Color(0x45283C);
	public static Color COLOR_MARRON_OSCURO = new Color(0x663931);
	public static Color COLOR_MARRON = new Color(0x8F563B);
	public static Color COLOR_NARANJA = new Color(0xDF7126);
	public static Color COLOR_MARRON_CLARO = new Color(0xD9A066);
	public static Color COLOR_PIEL = new Color(0xEEC39A);
	public static Color COLOR_AMARILLO = new Color(0xFBF236);
	public static Color COLOR_VERDE_MANZANA = new Color(0x99E550);
	public static Color COLOR_VERDE = new Color(0x6ABE30);
	public static Color COLOR_VERDE_TURQUESA = new Color(0x37946E);
	public static Color COLOR_VERDE_OLIVA_OSCURO = new Color(0x4B692F);
	public static Color COLOR_VERDE_MARRON = new Color(0x524B24);
	public static Color COLOR_VERDE_MARRON_CLARO = new Color(0x8A6F30);
	public static Color COLOR_VERDE_OLIVA = new Color(0x8F974A);
	public static Color COLOR_AZUL_MARINO = new Color(0x3F3F74);
	public static Color COLOR_AZUL_BANDERA = new Color(0x306082);
	public static Color COLOR_AZUL = new Color(0x5B6EE1);
	public static Color COLOR_AZUL_CLARO = new Color(0x639BFF);
	public static Color COLOR_AZUL_TURQUESA = new Color(0x5FCDE4);
	public static Color COLOR_AZUL_GRIS_CLARO = new Color(0xCBDBFC);
	public static Color COLOR_GRIS_VERDE_OSCURO = new Color(0x323C39);
	public static Color COLOR_GRIS_MEDIO_OSCURO = new Color(0x9BADB7);
	public static Color COLOR_GRIS_VIOLETA_OSCURO = new Color(0x847E87);
	public static Color COLOR_GRIS_MARRON_MEDIO_OSCURO = new Color(0x696A6A);
	public static Color COLOR_GRIS_OSCURO = new Color(0x595652);
	public static Color COLOR_MAGENTA = new Color(0x76428A);
	public static Color COLOR_ROJO = new Color(0xAC3232);
	public static Color COLOR_ROJO_CLARO = new Color(0xD95763);
	public static Color COLOR_VIOLETA_CLARO = new Color(0xD77BBA);
	*/
}