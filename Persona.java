package Personas;

public class Persona {
    String nombre; // Atributo que identifica el nombre de una persona
    
    String apellidos; /* Atributo que identifica los apellidos de una
    persona */
    
    String telefono; // Atributo que identifica el teléfono de una persona
    
    String direccion; /* Atributo que identifica la dirección de una
    persona */
    
    /**
    * Constructor de la clase Persona
    * @param nombre Parámetro que define el nombre de una persona
    * @param apellidos Parámetro que define los apellidos de una
    * persona
    * * @param telefono Parámetro que define el teléfono de una persona
    * @param direccion Parámetro que define la dirección de una
    * persona
    */
    public Persona(String nombre, String apellidos, String telefono,
    String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
