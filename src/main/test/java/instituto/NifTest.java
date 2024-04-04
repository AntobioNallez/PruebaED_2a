package instituto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class NifTest {
    
    /*
     * Test que comprueba el constructor
     **/
    @Test
    public void testConstructorNif() {
        Persona persona = new Persona(12345678);
        assertEquals("", persona.getNombre());
        assertEquals(' ', persona.getGenero());
        assertEquals(LocalDate.of(1990, 1, 1), persona.getNacimiento());
    }
}
