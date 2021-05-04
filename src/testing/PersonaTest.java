package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PersonaTest {

	@Tag("Produccion")
	@Test
	void testPersonas() {
		assertEquals("Jose", "Jose");
	}

}
