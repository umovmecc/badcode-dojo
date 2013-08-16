

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

public class SomaNomesTest {

	
	@Test
	public void deveVerificarSeListaDeNomesFoiGeradaCorretamente(){
		//given
		Person pessoa1 = new Person("Nome1");
		
		Person person2 = new Person("Nome2");
		
		List listaNomes = new ArrayList<Person>();
		
		listaNomes.add(pessoa1);
		listaNomes.add(person2);
		
		//when
		String retorno = SomaNomes.print(listaNomes);
		
		//Then
		assertEquals("Nome1, Nome2", retorno);
		
	}
	
	@Test
	public void deveFuncionarComMultiplasChamadas(){
		deveVerificarSeListaDeNomesFoiGeradaCorretamente();
		deveVerificarSeListaDeNomesFoiGeradaCorretamente();
	}
	
}
