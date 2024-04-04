/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 * Clase que representa un curso de un instituto, con un nombre y una lista de
 * alumnos.
 * Se utiliza un TreeSet para almacenar los alumnos de forma ordenada.
 * 
 * @author ProfDiurno
 */
public class Curso {

    /**
     *  Nombre del curso
     */
    private String nombre;

    /** 
     * Lista de alumnos del curso
     */
    private TreeSet<Persona> listaAlumnos;

    /**
     * Método usado para obtener el nombre del curso.
     * 
     * @return Nombre del curso
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor de la clase Curso que recibe el nombre del curso.
     * Inicializa la lista de alumnos.
     * 
     * @param nombre Nombre del curso
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Método toString que devuelve una representación en formato de cadena del
     * curso junto con la lista de alumnos.
     * 
     * @return Cadena con formato donde aparece el nombre del curso y los alumnos que lo componen.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Método para añadir un alumno al curso.
     * 
     * @param p Alumno a añadir
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
