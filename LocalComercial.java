package Inmuebles;

public class LocalComercial extends Local {
    
    // Atributo que identifica el valor por área de un local comercial
    protected static double valorArea = 3000000;
    
    /* Atributo que identifica el centro comercial donde está ubicado el
    local comercial */
    protected String centroComercial;
    
    /**
    * Constructor de la clase LocalComercial
    * @param identificadorInmobiliario Parámetro que define el
    * identificador inmobiliario de un local comercial
    * @param area Parámetro que define el área de un local comercial
    * @param direccion Parámetro que define la dirección donde se
    * encuentra localizado un local comercial
    * @param tipoLocal Parámetro que define el tipo de local comercial
    * (interno o que da a la calle)
    * @param centroComercial Parámetro que define el nombre del
    * centro comercial donde está ubicado el local comercial
    */
    public LocalComercial(int identificadorInmobiliario, int area, String
    direccion, tipo tipoLocal, String centroComercial) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }
    /**
    * Método que muestra en pantalla los datos de un local comercial
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
