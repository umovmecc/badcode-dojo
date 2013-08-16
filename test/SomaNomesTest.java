

import static org.junit.Assert.assertEquals;

import java.util.Vector;

import org.junit.Test;

public class SomaNomesTest {

	
	@Test
	public void deveVerificarSeListaDeNomesFoiGeradaCorretamente(){
		//given
		Person pessoa1 = new Person();
		pessoa1.name = "Nome1";
		
		Person person2 = new Person();
		person2.name = "Nome2";
		
		Vector vector = new Vector();
		vector.add(pessoa1);
		vector.add(person2);
		
		//when
		somaNomes.print(vector);
		
		//Then
		assertEquals("Nome1, Nome2", somaNomes._s);
		
	}
}
