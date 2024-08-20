package Inmuebles;

public class ApartaEstudio extends Apartamento {
    
    // Atributo que identifica el valor por área de un apartaestudio
    protected static double valorArea = 1500000;
    
    /**
    * Constructor de la clase Apartaestudio
    * @param identificadorInmobiliario Parámetro que define el
    * identificador inmobiliario de un apartaestudio
    * @param area Parámetro que define el área de un apartaestudio
    * @param direccion Parámetro que define la dirección donde se
    * encuentra localizado un apartaestudio
    * @param numeroHabitaciones Parámetro que define el número de
    * habitaciones que tiene un apartaestudio
    * @param numeroBanos Parámetro que define el número de baños
    * que tiene un apartaestudio
    */
    
    public ApartaEstudio(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    
    /**
    * Método que muestra en pantalla los datos de un apartaestudio
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
