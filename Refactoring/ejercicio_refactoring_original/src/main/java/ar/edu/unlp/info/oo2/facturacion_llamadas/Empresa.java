package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes;
	private GestorNumerosDisponibles guia;

	public Empresa(GestorNumerosDisponibles guia) {
		this.clientes = new ArrayList<Cliente>();
		this.guia = guia;
	}
	
	public Cliente registrarUsuarioFisico(String dni, String nombre) {
		Cliente cliente = new PersonaFisica(nombre, this.guia.obtenerNumeroLibre(), dni);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Cliente registrarUsuarioJuridico(String cuit, String nombre) {
		Cliente cliente = new PersonaJuridica(nombre, this.guia.obtenerNumeroLibre(), cuit);
		this.clientes.add(cliente);
		return cliente;
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
