package Personas;

import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ListaPersonas {
    DefaultListModel modelo = new DefaultListModel();
    
    Vector listaPersonas; // Atributo que identifica un vector de personas
    
    /**
    * Constructor de la clase ListaPersonas
    */
    public ListaPersonas() {
        listaPersonas = new Vector(); // Crea el vector de personas
    }
    /**
    * Método que permite agregar una persona al vector de personas
    * @param p Parámetro que define la persona a agregar al vector de
    * personas
    */
    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }
    
    /**
    * Método que permite eliminar una persona del vector de personas
    * @param i Parámetro que define la posición a eliminar en el vector
    * de personas
    */
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }
    
    /**
    * Método que permite eliminar todos los elementos del vector de
    * personas
    */
    public void borrarLista() {
        listaPersonas.removeAllElements();
    } 
}
