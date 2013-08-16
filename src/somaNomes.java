import java.util.ArrayList;
import java.util.List;

public class SomaNomes {
	
	// TODO separar responsabilidades
	// TODO deixar de ser static
	public static String concatenaNomes(List<Person> listaNomes) {
		StringBuilder builder = new StringBuilder();
		for (Person p : listaNomes) {
			if (builder.length() > 0) {
				builder.append(", ");
			}
			builder.append(p.getName());
		}
		return builder.toString();
	}

	public static void print(List<Person> listaNomes) {
		System.out.print(concatenaNomes(listaNomes));
	}

	public static void main(String[] args) {
		List<Person> v = new ArrayList<Person>();

		v.add(new Person("Daniel"));
		v.add(new Person("Guilherme"));
		v.add(new Person("Gabriel"));
		v.add(new Person("Frederico"));
		print(v);

	}

}