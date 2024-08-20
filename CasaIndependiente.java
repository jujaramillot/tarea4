package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    // Atributo que identifica el valor por área de una casa independiente
    protected static double valorArea = 3000000;
    
    /**
    * Constructor de la clase CasaIndependiente
    * @param identificadorInmobiliario Parámetro que define el
    * identificador inmobiliario de una casa independiente
    * @param area Parámetro que define el área de una casa independiente
    * @param direccion Parámetro que define la dirección donde se
    * encuentra localizada una casa independiente
    * @param numeroHabitaciones Parámetro que define el número de
    * habitaciones que tiene una casa independiente
    * @param numeroBanos Parámetro que define el número de baños
    * que tiene una casa independiente
    * @param numeroPisos Parámetro que define el número de pisos
    * que tiene una casa independiente
    */
    public CasaIndependiente(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBanos, int
    numeroPisos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion,
    numeroHabitaciones, numeroBanos, numeroPisos);
    }
    /**
    * Método que muestra en pantalla los datos de una casa independiente
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
