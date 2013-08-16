import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SomaNomes {

	public static String print(List<Person> listaNomes) {
		StringBuilder builder = new StringBuilder();
		for (Person p : listaNomes) {
			builder.append(", ").append(p.getName());
		}
		String output = builder.toString();
		output = output.substring(2); // remove first comma
		System.out.print(output);
		return output;
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