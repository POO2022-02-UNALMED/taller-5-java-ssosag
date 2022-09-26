package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private  ArrayList<Zona> zonas;
	
	public Zoologico (String nombre, String ubicacion) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
		zonas = new ArrayList<Zona>();

	}
	
	public Zoologico () {
		zonas = new ArrayList<Zona>();
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

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

}

