package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    // Atributo que identifica el valor por área de un apartamento familiar
    protected static double valorArea = 2000000;
    
    /* Atributo que identifica el valor de la administración de un
    apartamento familiar */
    protected int valorAdministracion;
    
    /**
    * Constructor de la clase ApartamentoFamiliar
    * @param identificadorInmobiliario Parámetro que define el
    * identificador inmobiliario de un apartamento familiar
    * @param area Parámetro que define el área de un apartamento familiar
    * @param direccion Parámetro que define la dirección donde se
    * encuentra localizado un apartamento familiar
    * @param numeroHabitaciones Parámetro que define el número de
    * habitaciones que tiene un apartamento familiar
    * @param numeroBanos Parámetro que define el número de baños
    * que tiene un apartamento familiar
    * @param valorAdministracion Parámetro que define el valor de la
    * administración de un apartamento familiar
    */
    public ApartamentoFamiliar(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBanos, int
    valorAdministracion) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }
    /**
    * Método que muestra en pantalla los datos de un apartamento familiar
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" +
        valorAdministracion);
        System.out.println();
    }
}
