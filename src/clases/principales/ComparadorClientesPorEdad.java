package clases.principales;
import java.util.Comparator;

public class ComparadorClientesPorEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return (o1.getEdad() - o2.getEdad()) * -1;
	}



	
}
