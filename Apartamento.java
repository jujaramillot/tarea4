package Inmuebles;

public class Apartamento extends InmuebleVivienda {
    
    /**
    * Constructor de la clase Apartamento
    * @param identificadorInmobiliario Parámetro que define el
    * identificador inmobiliario de un apartamento
    * @param area Parámetro que define el área de un apartamento
    * @param direccion Parámetro que define la dirección donde se
    * encuentra localizado un apartamento
    * @param numeroHabitaciones Parámetro que define el número de
    * habitaciones que tiene un apartamento
    * @param numeroBanos Parámetro que define el número de baños
    * que tiene un apartamento
    */
    public Apartamento(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion,
    numeroHabitaciones, numeroBanos);
    }
    
    /**
    * Método que muestra en pantalla los datos de un apartamento
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
