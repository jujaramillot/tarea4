package Inmuebles;

public class Casa extends InmuebleVivienda{
    
    protected int numeroPisos; /* Atributo que identica el número de
    pisos que tiene una casa */
    /**
    
    * Constructor de la clase Casa
    * @param identificadorInmobiliario Parámetro que define el
    * identificador inmobiliario de una casa
    * @param area Parámetro que define el área de una casa
    * @param direccion Parámetro que define la dirección donde se
    * encuentra localizada una casa
    * @param numeroHabitaciones Parámetro que define el número de
    * habitaciones que tiene una casa
    * @param numeroBanos Parámetro que define el número de baños
    * que tiene una casa
    * @param numeroPisos Parámetro que define el número de pisos
    * que tiene una casa
    */
    public Casa(int identificadorInmobiliario, int area, String direccion,
    int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }
    
    /**
    * Método que muestra en pantalla los datos de una casa
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + numeroPisos);
    }
}
