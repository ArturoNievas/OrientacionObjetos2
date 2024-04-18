package ar.edu.info.unlp.ejercicio_11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProyectoTest {
	
	private Proyecto pContruccion;
	private Proyecto pEvaluacion;
	private Proyecto pConfirmado;
	private Proyecto pCancelado;
	
	@BeforeEach
	void setUp() throws Exception {
		LocalDateTime f1 = LocalDateTime.of(2015, Month.JULY, 15, 19, 30, 40);
		LocalDateTime f2 = LocalDateTime.of(2015, Month.JULY, 30, 23, 30, 40);
		this.pContruccion = new Proyecto("sarasa", f1, f2, "dfhbdf", 3, 0);
		this.pEvaluacion = new Proyecto("Vacaciones de invierno", f1, f2, "Salir con amigos", 3, 1000);
		this.pEvaluacion.setEtapa(new Evaluacion());
		this.pConfirmado = new Proyecto("rfh", f1, f2, "<ewsrhd", 15, 1200);
		this.pConfirmado.setEtapa(new Confirmado());
		this.pCancelado = new Proyecto(null, f1, f2, null, 10, 500);
		this.pCancelado.setEtapa(new Cancelado());
	}
	
    @Test
    public void testAprobarEtapaEnConstruccion() {
    	Exception exceptionConstruccion = assertThrows(RuntimeException.class, () -> {this.pContruccion.aprobarEtapa();});
	    assertEquals("Error: No se puede aprobar un proyecto cuyo precio es 0",exceptionConstruccion.getMessage());
	    
	    this.pContruccion.setPagoPorDia(800);
	    this.pContruccion.aprobarEtapa();
	    assertTrue(this.pContruccion.getEtapa() instanceof Evaluacion);
    }
    
    @Test
    public void testAprobarEtapaEnEvaluacion() {
	    this.pEvaluacion.aprobarEtapa();
	    assertTrue(this.pEvaluacion.getEtapa() instanceof Confirmado);
    }
    
    @Test
    public void testCostoDelProyecto() {
	    assertEquals(this.pEvaluacion.costoDelProyecto(),45000);
    }
    
    @Test
    public void testPrecioDelProyecto() {
	    assertEquals(this.pEvaluacion.precioDelProyecto(),48150);
    }
    
    @Test
    public void testModificarMargenDeGananciaConstruccion() {
    	assertEquals(this.pContruccion.getMargenDeGanancia(),7);
    	this.pContruccion.modificarMargenDeGanancia(0);
    	assertEquals(this.pContruccion.getMargenDeGanancia(),7);
    	this.pContruccion.modificarMargenDeGanancia(8);
    	assertEquals(this.pContruccion.getMargenDeGanancia(),8);
    	this.pContruccion.modificarMargenDeGanancia(9);
    	assertEquals(this.pContruccion.getMargenDeGanancia(),9);
    	this.pContruccion.modificarMargenDeGanancia(10);
    	assertEquals(this.pContruccion.getMargenDeGanancia(),10);
    	this.pContruccion.modificarMargenDeGanancia(11);
    	assertEquals(this.pContruccion.getMargenDeGanancia(),10);
    }
    
    @Test
    public void testModificarMargenDeGananciaEvaluacion() {
    	assertEquals(this.pEvaluacion.getMargenDeGanancia(),7);
    	this.pEvaluacion.modificarMargenDeGanancia(0);
    	assertEquals(this.pEvaluacion.getMargenDeGanancia(),7);
    	this.pEvaluacion.modificarMargenDeGanancia(11);
    	assertEquals(this.pEvaluacion.getMargenDeGanancia(),11);
    	this.pEvaluacion.modificarMargenDeGanancia(14);
    	assertEquals(this.pEvaluacion.getMargenDeGanancia(),14);
    	this.pEvaluacion.modificarMargenDeGanancia(15);
    	assertEquals(this.pEvaluacion.getMargenDeGanancia(),15);
    	this.pEvaluacion.modificarMargenDeGanancia(16);
    	assertEquals(this.pEvaluacion.getMargenDeGanancia(),15);
    }
    
    @Test
    public void testModificarMargenDeGananciaConfirmado() {
    	assertEquals(this.pConfirmado.getMargenDeGanancia(),7);
    	this.pConfirmado.modificarMargenDeGanancia(Math.random() * 100);
    	assertEquals(this.pConfirmado.getMargenDeGanancia(),7);
    }
    
    @Test
    public void testModificarMargenDeGananciaCancelado() {
    	assertEquals(this.pCancelado.getMargenDeGanancia(),7);
    	this.pCancelado.modificarMargenDeGanancia(Math.random() * 100);
    	assertEquals(this.pCancelado.getMargenDeGanancia(),7);
    }
    
    @Test
    public void testCancelarProyectoConstruccion() {
    	this.pContruccion.cancelarProyecto();
    	assertTrue(this.pContruccion.getEtapa() instanceof Cancelado);
    	assertEquals(this.pContruccion.getObjetivo(),"Cancelado");
    }
    
    @Test
    public void testCancelarProyectoEvaluacion() {
    	this.pEvaluacion.cancelarProyecto();
    	assertTrue(this.pEvaluacion.getEtapa() instanceof Cancelado);
    	assertEquals(this.pEvaluacion.getObjetivo(),"Cancelado");
    }
    
    @Test
    public void testCancelarProyectoConfirmado() {
    	this.pConfirmado.cancelarProyecto();
    	assertTrue(this.pConfirmado.getEtapa() instanceof Cancelado);
    	assertEquals(this.pConfirmado.getObjetivo(),"Cancelado");
    }
    
}
