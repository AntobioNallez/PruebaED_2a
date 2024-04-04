/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    /*
     * Test que comprueba el metodo aniadirAlumno
     */
    @Test
    public void testAniadirAlumno() {
        Curso curso = new Curso("Física");
        Persona alumno1 = new Persona(12345678, "John Doe", 'M', 1, 1, 2000);
        Persona alumno2 = new Persona(87654321, "Jane Smith", 'F', 2, 2, 2001);

        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);

        assertEquals(2, curso.getListaAlumnos().size());
        assertTrue(curso.getListaAlumnos().contains(alumno1));
        assertTrue(curso.getListaAlumnos().contains(alumno2));
    }

    /*
     * Test que comprueba el correcto almacenamiento del nombre
     */
    @Test
    public void testNombre(){
        String nombre = "Química";
        Curso curso = new Curso(nombre);
        assertEquals(nombre, curso.getNombre());
    }
}
