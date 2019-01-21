package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

//import org.junit.Before;
import org.junit.Test;


public class GreetingTest {
	
	@Test
	public void smokeTest1() {
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(null));
	}
//			// Comprobación de funcionamiento test despues de inyectar dependencias
//			@Test
//			public void smokeTest1Correcto() {
//				Greeting greeting = new Greeting();
//				assertEquals("Good afternoon", greeting.getGreeting(null));
//			}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
//			// Comprobación de funcionamiento test despues de inyectar dependencias
//			@Test
//			public void smokeTest2Correcto() {
//				Greeting greeting = new Greeting();
//				assertEquals("Good afternoon", greeting.getGreeting(Language.ENGLISH));
//			}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting();
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}
//			// Comprobación de funcionamiento test despues de inyectar dependencias
//			@Test
//			public void smokeTest3Correcto() {
//				Greeting greeting = new Greeting();
//				assertEquals("Buenas tardes", greeting.getGreeting(Language.SPANISH));
//			}


}

