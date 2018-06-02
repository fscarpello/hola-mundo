package loom.hola_mundo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HolaMundoTests {
    
	HolaMundo holaMundo;
	
	// Antes de ejecutar cada test instancio un nuevo objeto HolaMundo.
	@Before
	public void setup() {
		holaMundo = new HolaMundo();		
	}
	
	// Saludo básico
	@Test
    public void queSaludaCorrectamente() {
        Assert.assertEquals("¡Hola, Kent Beck!", holaMundo.saludar("Kent Beck"));
    }
	
    // Saludos con persona no indicada.
    @Test
    public void queSaludaGenerico() {
        Assert.assertEquals("¡Hola!", holaMundo.saludar(""));
    }
	
}
