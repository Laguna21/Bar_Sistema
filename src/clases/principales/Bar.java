package clases.principales;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Bar {
	private String nombreBar;
	private Set<Cliente> listaClientes;

	public Bar(String nombreBar) {
		this.nombreBar = nombreBar;
		listaClientes = new TreeSet<Cliente>();
	}
	
	public Bar(String nombreBar, Comparator c) {
		this.nombreBar = nombreBar;
		this.listaClientes = new TreeSet<Cliente>(c);
	}

	public void agregarCliente(Cliente nuevoCliente) throws Exception {
		if (listaClientes.contains(nuevoCliente)) {
			throw new ErrorPorClienteExistente();
		} else {
			listaClientes.add(nuevoCliente);
		}

	}

	public void eliminarCliente(Cliente clienteBorrar) throws Exception {
		if (!listaClientes.contains(clienteBorrar)) {
			throw new ClienteNoEncontrado();
		} else {
			listaClientes.remove(clienteBorrar);
		}
	}
	public String getNombreBar() {
		return nombreBar;
	}

	public Set<Cliente> getListaClientes() {
		return listaClientes;
	}

	@Override
	public String toString() {
		return "Bar [nombreBar=" + nombreBar + ", listaClientes=" + listaClientes + "]";
	}
	
}
