/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Clase que representa una persona con un NIF, nombre, género y fecha de
 * nacimiento.
 * 
 * @author ProfDiurno
 */
public class Persona implements Comparable<Persona> {

    /**
     * NIF de la persona
     */
    private Nif nif;

    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Género de la persona
     */
    private char genero;

    /**
     * Fecha de nacimiento de la persona
     */
    private LocalDate nacimiento;

    /**
     * Constructor por defecto de la clase Persona.
     * Inicializa los atributos con valores por defecto.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que recibe un número NIF para la persona.
     * Inicializa los atributos con valores por defecto.
     * 
     * @param nif Número NIF de la persona
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor que recibe información detallada de la persona.
     * 
     * @param nif    Número NIF de la persona
     * @param nombre Nombre de la persona
     * @param genero Género de la persona
     * @param dia    Día de nacimiento
     * @param mes    Mes de nacimiento
     * @param ano    Año de nacimiento
     */
    public Persona(int nif, String nombre, char genero, int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = LocalDate.of(ano, mes, dia);
    }

    /**
     * Método getter para obtener el NIF de la persona.
     * 
     * @return NIF de la persona
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Método setter para establecer el NIF de la persona.
     * 
     * @param nif Nuevo NIF de la persona
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Método getter para obtener el nombre de la persona.
     * 
     * @return Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre de la persona.
     * 
     * @param nombre Nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el género de la persona.
     * 
     * @return Género de la persona
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Método setter para establecer el género de la persona.
     * 
     * @param genero Nuevo género de la persona
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Método getter para obtener la fecha de nacimiento de la persona.
     * 
     * @return Fecha de nacimiento de la persona
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Método setter para establecer la fecha de nacimiento de la persona.
     * 
     * @param nacimiento Nueva fecha de nacimiento de la persona
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Método para calcular la edad de la persona.
     * 
     * @return Edad de la persona en años
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Método toString que devuelve de forma tabulada la informacion de la persona.
     * 
     * @return Representación en formato de cadena de la persona
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Método equals para comparar dos objetos de tipo Persona.
     * 
     * @param a Objeto a comparar
     * @return true si los objetos son iguales, false en caso contrario
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Método equals para comparar dos objetos de tipo Persona.
     * 
     * @param obj Objeto a comparar
     * @return true si los objetos son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Método compareTo para comparar dos personas basadas en sus NIF.
     * 
     * @param o Persona con la que se va a comparar
     * @return Un valor negativo, cero o un valor positivo si este objeto es menor,
     *         igual o mayor que el objeto especificado
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }
}
