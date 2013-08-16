import java.util.ArrayList;
import java.util.List;

public class SomaNomes {
	
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
		List v = new ArrayList<Person>();

		Person p = new Person("Daniel");
		v.add(p);

		p = new Person("Guilherme");
		v.add(p);

		p = new Person("Gabriel");
		v.add(p);

		p = new Person("Frederico");
		v.add(p);

		print(v);

	}

}