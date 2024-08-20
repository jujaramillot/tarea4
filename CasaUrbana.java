package Inmuebles;

public class CasaUrbana extends Casa {
    /**
    * Constructor de la clase CasaUrbana
    * @param identificadorInmobiliario Parámetro que define el
    * identificador inmobiliario de una casa urbana
    * @param area Parámetro que define el área de una casa urbana
    * @param direccion Parámetro que define la dirección donde se
    * encuentra localizada una casa urbana
    * @param numeroHabitaciones Parámetro que define el número de
    * habitaciones que tiene una casa urbana
    * @param numeroBanos Parámetro que define el número de baños
    * que tiene una casa urbana
    * @param numeroPisos Parámetro que define el número de pisos
    * que tiene una casa urbana
    */
    public CasaUrbana(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos, int
    numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBanos, numeroPisos);
    }
    /**
    * Método que muestra en pantalla los datos de una casa urbana
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
