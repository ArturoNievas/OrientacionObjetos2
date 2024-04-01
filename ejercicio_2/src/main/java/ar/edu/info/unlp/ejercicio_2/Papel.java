package ar.edu.info.unlp.ejercicio_2;

public class Papel extends Opcion {

	@Override
	public int compareTo(Piedra piedra) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int compareTo(Papel papel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Tijera tijera) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int compareTo(Lagarto lagarto) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int compareTo(Spock spock) {
		// TODO Auto-generated method stub
		return 1;
	}

}
