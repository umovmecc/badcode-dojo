import java.util.ArrayList;
import java.util.Vector;

/**
 * Soma os nomes
 * @author dwildt
 */
public class somaNomes_Original {
	/**
	 * a string para somar todos os nomes na lista 
	 */
	static String _s;
	
	/**
	 * imprime a lista de pessoas
	 * @param paramL
	 */
	public static void print(Vector paramL){
		for (int i = 0; i < paramL.size(); i++) {
			Person p = (Person) paramL.get(i);
		    _s += ", " + p.name;			
		}
		//remove first comma
		_s = _s.substring(2); 
		System.out.print(_s);
	}
	
	/**
	 * c—digo principal
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		
		Person p = new Person();
		p.name = "Daniel";
		v.add(p);
		
		p = new Person();
		p.name = "Guilherme";
		v.add(p);

		p = new Person();
		p.name = "Gabriel";
		v.add(p);

		p = new Person();
		p.name = "Frederico";
		v.add(p);

		print(v);
		
	}

}

class Pessoa{
	String name;
}