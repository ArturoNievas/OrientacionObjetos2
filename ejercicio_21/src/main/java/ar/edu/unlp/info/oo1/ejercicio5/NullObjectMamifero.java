package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;

public class NullObjectMamifero implements Mamifero {

	@Override
	public int getIdentificador() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setIdentificador() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEspecie() {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDate getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFechaNacimiento() {
		// TODO Auto-generated method stub

	}

	@Override
	public Mamifero getMadre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMadre() {
		// TODO Auto-generated method stub

	}

	@Override
	public Mamifero getPadre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPadre() {
		// TODO Auto-generated method stub

	}

	@Override
	public Mamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaPMaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

}
