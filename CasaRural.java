package Inmuebles;

public class CasaRural extends Casa{
    
    // Atributo que identifica el valor por área para una casa rural
    protected static double valorArea = 1500000;
    
    /* Atributo que identifica la distancia a la que se encuentra la casa
    rural de la cabecera municipal */
    protected int distanciaCabera;
    
    // Atributo que identifica la altitud a la que se encuentra una casa rural
    protected int altitud;
    
    /**
    * Constructor de la clase CasaRural
    * @param identificadorInmobiliario Parámetro que define el
    * identificador inmobiliario de una casa rural
    * @param area Parámetro que define el área de una casa rural
    * @param direccion Parámetro que define la dirección donde se
    * encuentra localizada una casa rural
    * @param numeroHabitaciones Parámetro que define el número de
    * habitaciones que tiene una casa rural
    * @param numeroBanos Parámetro que define el número de baños
    * que tiene una casa rural
    * @param numeroPisos Parámetro que define el número de pisos
    * que tiene una casa rural
    * @param distanciaCabera Parámetro que define la distancia de la
    * casa rural a la cabecera municipal
    * @param altitud Parámetro que define la altitud sobre el nivel del
    * mar en que se encuentra una casa rural
    */
    public CasaRural(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos, int
    numeroPisos, int distanciaCabera, int altitud) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBanos, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    
    /**
    * Método que muestra en pantalla los datos de una casa rural
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Distancia la cabecera municipal = " +
        numeroHabitaciones + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud +
        " metros.");
        System.out.println();
    }
}
