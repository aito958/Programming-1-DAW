import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestHashSet {
	public static void main(String[] args) {

		List<String> ciudades = new LinkedList<String>();
		ciudades.add("Madrid");
		ciudades.add("Barcelona");
		ciudades.add("Sevilla");
		ciudades.add("Madrid");

		Iterator<String> iterator = ciudades.iterator();
		while (iterator.hasNext()) {
			System.out.println("Ciudad: " + iterator.next());

		}

		for (String ciudad : ciudades) {
			

		}
	}
}
