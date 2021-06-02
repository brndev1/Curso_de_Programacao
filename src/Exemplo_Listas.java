import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo_Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		list.add(2, "Marco");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("___________________________________________________");

		list.removeIf((x -> x.charAt(0) == 'M'));

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("___________________________________________________");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("___________________________________________________");
		for (String x : result) {
			System.out.println(x);

		}

		System.out.println("___________________________________________________");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);

	}

}
