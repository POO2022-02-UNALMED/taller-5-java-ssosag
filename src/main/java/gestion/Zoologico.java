package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas;
	
	public Zoologico (String nombre, String ubicacion) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);

	}
	
	public Zoologico () {
		
	}
	
	public void agregarZonas (Zona zona) {
		zonas.add(zona);
		
	}
	
	public int cantidadTotalAnimales () {
		int totalAnimales = 0;
		for (int i = 0; i < zonas.size(); i++) {
			totalAnimales += zonas.get(i).cantidadAnimales();
		}
			
		return totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public static ArrayList<Zona> getZonas() {
		return zonas;
	}

	public static void setZonas(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
	
}

