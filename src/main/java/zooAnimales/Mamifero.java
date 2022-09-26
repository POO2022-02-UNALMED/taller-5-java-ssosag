package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int nMamiferos;
	
	public Mamifero (String nombre, int edad, String habitat, String genero, 
			boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		nMamiferos++;
	}
	
	public Mamifero () {
		nMamiferos++;
	}
	
	public static int cantidadMamiferos () { 
		return nMamiferos;
	}
	
	public static Mamifero crearCaballo (String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos ++;
		return caballo;
	}
	
	public static Mamifero crearLeon (String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones ++;
		return leon;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
}