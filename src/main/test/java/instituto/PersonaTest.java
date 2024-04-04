/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class PersonaTest {
    
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

    /*
     * Test del metodo get edad
     */
    @Test
    public void testGetEdad() {
        Persona persona = new Persona();
        persona.setNacimiento(LocalDate.of(2000, 1, 1));
        assertEquals(24, persona.getEdad());
    }

    /*
     * Test del metodo equals
     */
    @Test
    public void testEquals() {
        Persona persona1 = new Persona(12345678);
        Persona persona2 = new Persona(12345678);
        assertTrue(persona1.equals(persona2));
    }

    /*
     * Test del metodo compareTo
     */
    @Test
    public void testCompareTo() {
        Persona persona1 = new Persona(12345678);
        Persona persona2 = new Persona(87654321);
        assertTrue(persona1.compareTo(persona2) < 0);
    }
}
