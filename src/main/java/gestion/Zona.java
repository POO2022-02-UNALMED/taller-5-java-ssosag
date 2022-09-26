package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static ArrayList<Animal> animales;
	
	public Zona (String nombre, Zoologico Zoo) {
		this.setNombre(nombre);
		this.setZoo(Zoo);
		
	}
	
	public Zona () {
		
	}
	
	public void agregarAnimales (Animal animal) {
		animales.add(animal);
		
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public static ArrayList<Animal> getAnimales() {
		return animales;
	}

	public static void setAnimales(ArrayList<Animal> animales) {
		Zona.animales = animales;
	}

}
