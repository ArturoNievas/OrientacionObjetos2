package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;

public interface Mamifero {

	int getIdentificador();
	void setIdentificador();
	String getEspecie(); 
	void setEspecie();
	LocalDate getFechaNacimiento();
	void setFechaNacimiento();
	Mamifero getMadre();
	void setMadre();
	Mamifero getPadre();
	void setPadre();
	Mamifero getAbueloPaterno();
	Mamifero getAbuelaPaterna();
	Mamifero getAbueloMaterno();
	Mamifero getAbuelaPMaterna();
	boolean tieneComoAncestroA(Mamifero unMamifero);
}
