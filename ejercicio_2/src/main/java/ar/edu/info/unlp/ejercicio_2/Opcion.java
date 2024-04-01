package ar.edu.info.unlp.ejercicio_2;

public abstract class Opcion {
	
	public abstract int compareTo(Piedra piedra);
	public abstract int compareTo(Papel papel);
	public abstract int compareTo(Tijera tijera);
	public abstract int compareTo(Lagarto lagarto);
	public abstract int compareTo(Spock spock);

}
