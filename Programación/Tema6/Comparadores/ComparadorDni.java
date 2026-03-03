/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programación.Tema6.Comparadores;

import java.util.Comparator;

/**
 *
 * @author madrid
 */
public class ComparadorDni implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni().compareToIgnoreCase(o2.getDni());
    }
    
}
