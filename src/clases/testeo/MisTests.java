package clases.testeo;
import clases.principales.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class MisTests {

	@Test
	public void probar_bar() throws Exception {
		
			Bar b = new Bar("Bar Sin Nombre");
			Cliente c1 = new Cliente("laguna", "lang", 241);
			Cliente c2 = new Cliente("Aue", "ling", 131);
			Cliente c3 = new Cliente("vix", "nox", 11);
			b.agregarCliente(c1);
			b.agregarCliente(c2);
			b.agregarCliente(c3);
			System.out.println(b.toString());
			assertEquals(3, b.getListaClientes().size());
	
	}
	
	@Test(expected = ErrorPorClienteExistente.class)
	public void probar_error()throws Exception{

			Bar b = new Bar("Bar Sin Nombre");
			Cliente c1 = new Cliente("laguna", "lang", 21);
			Cliente c2 = new Cliente("lau", "ling", 31);
			Cliente c3 = new Cliente("nix", "nox", 111);
			b.agregarCliente(c1);
			b.agregarCliente(c1);
			b.agregarCliente(c2);
			b.agregarCliente(c3);
			
	}
	
	@Test
	public void probar_orden_de_lista() throws Exception {
		
		Bar b = new Bar("Bar Sin Nombre" , new ComparadorClientesPorEdad());
		Cliente c1 = new Cliente("laguna", "lang", 21);
		Cliente c2 = new Cliente("lau", "ling", 31);
		Cliente c3 = new Cliente("nix", "nox", 111);
		b.agregarCliente(c1);
		b.agregarCliente(c2);
		b.agregarCliente(c3);
		System.out.println(b.toString());
		
		assertEquals(3, b.getListaClientes().size());
	}
	
	@Test
	public void probar_eliminar_cliente() throws Exception {
		
		Bar b = new Bar("Bar Sin Nombre" , new ComparadorClientesPorEdad());
		Cliente c1 = new Cliente("laguna", "lang", 21);
		Cliente c2 = new Cliente("lau", "ling", 31);
		Cliente c3 = new Cliente("nix", "nox", 111);
		b.agregarCliente(c1);
		b.agregarCliente(c2);
		b.agregarCliente(c3);
		
		
		b.eliminarCliente(c1);
		
		System.out.println(b.toString());
		
		assertEquals(2, b.getListaClientes().size());
	}
	
	
	@Test(expected = ClienteNoEncontrado.class)
	public void probar_error_eliminar_cliente() throws Exception {
		
		Bar b = new Bar("Bar Sin Nombre" , new ComparadorClientesPorEdad());
		Cliente c1 = new Cliente("laguna", "lang", 21);
		Cliente c2 = new Cliente("lau", "ling", 31);
		Cliente c3 = new Cliente("nix", "nox", 111);
		b.agregarCliente(c1);
		b.agregarCliente(c2);
		
		
		b.eliminarCliente(c3);
		
	}


}
