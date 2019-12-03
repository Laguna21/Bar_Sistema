package clases.principales;

public class ClienteNoEncontrado extends Exception {

	public ClienteNoEncontrado() {
		super("El cliente no existe en la lista!");
	}

}
