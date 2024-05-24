package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;
	GestorNumerosDisponibles guia;

	@BeforeEach
	public void setUp() {
		this.guia = new GestorNumerosDisponibles();
		this.guia.agregarNumeroTelefono("2214444554");
		this.guia.agregarNumeroTelefono("2214444555");
		this.guia.agregarNumeroTelefono("2214444556");
		this.guia.agregarNumeroTelefono("2214444557");
		this.guia.agregarNumeroTelefono("2214444558");
		this.guia.agregarNumeroTelefono("2214444559");
		this.sistema = new Empresa(this.guia);
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		Cliente emisorPersonaFisca = sistema.registrarUsuarioFisico("11555666", "Brendan Eich");
		Cliente remitentePersonaFisica = sistema.registrarUsuarioFisico("00000001", "Doug Lea");
		Cliente emisorPersonaJuridica = sistema.registrarUsuarioJuridico("17555222", "Nvidia Corp");
		Cliente remitentePersonaJuridica = sistema.registrarUsuarioJuridico("25765432", "Sun Microsystems");

		TipoLlamada internacional = new LlamadaInternacional();
		TipoLlamada nacional = new LlamadaNacional();
				
		emisorPersonaJuridica.registrarLlamada(remitentePersonaFisica, nacional, 10);
		emisorPersonaJuridica.registrarLlamada(remitentePersonaFisica, internacional, 8);
		emisorPersonaJuridica.registrarLlamada(remitentePersonaJuridica, nacional, 5);
		emisorPersonaJuridica.registrarLlamada(remitentePersonaJuridica, internacional, 7);
		emisorPersonaFisca.registrarLlamada(remitentePersonaFisica, nacional, 15);
		emisorPersonaFisca.registrarLlamada(remitentePersonaFisica, internacional, 45);
		emisorPersonaFisca.registrarLlamada(remitentePersonaJuridica, nacional, 13);
		emisorPersonaFisca.registrarLlamada(remitentePersonaJuridica, internacional, 17);

		assertEquals(11454.64, emisorPersonaFisca.calcularMontoTotalLlamadas(), 0.01);
		assertEquals(2445.40, emisorPersonaJuridica.calcularMontoTotalLlamadas(), 0.01);
		assertEquals(0, remitentePersonaFisica.calcularMontoTotalLlamadas());
		assertEquals(0, remitentePersonaJuridica.calcularMontoTotalLlamadas());
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.guia.agregarNumeroTelefono("2214444558"); 
		Cliente nuevaPersona = this.sistema.registrarUsuarioFisico("2444555","Alan Turing");

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		// por defecto es el ultimo
		assertEquals("2214444559", this.sistema.getGestorNumeros().obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new Primero());
		assertEquals("2214444554", this.sistema.getGestorNumeros().obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new Aleatorio());
		assertNotNull(this.sistema.getGestorNumeros().obtenerNumeroLibre());
	}
}
