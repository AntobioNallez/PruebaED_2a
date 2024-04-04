/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 * Clase que representa un NIF (Número de Identificación Fiscal) compuesto por un número de ocho cifras y una letra.
 * La letra se calcula automáticamente según el número.
 * 
 * @author ProfDiurno
 * @version 1.0.0
 */
public class Nif {

    /** 
     * Número del NIF 
     */
    private int numero;
    
    /** 
     * Letra de control del NIF 
     */
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    /** 
     * Array de las letras que pueden formar un DNI
     */
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    /**
     * Método estático para calcular la letra de control según el número del NIF.
     * 
     * @param numero Número del NIF
     * @return La letra de control correspondiente al número
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor por defecto de la clase Nif.
     * Inicializa el número y la letra dandole valores por defecto.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor que recibe un número para el NIF.
     * Calcula automáticamente la letra.
     * 
     * @param numero Número del NIF
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Método toString que devuelve una cadena con el NIF y su respectiva letra.
     * 
     * @return Cadena con el DNI y la respectiva letra
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Método para establecer el número del NIF y calcular automáticamente la letra.
     * 
     * @param numero Nuevo número del NIF
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Método equals para comparar dos objetos de tipo Nif.
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
