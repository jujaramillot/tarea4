package PruebaCuenta;

public class CuentaCorriente extends Cuenta {
    
    /* Atributo que define un sobregiro de la cuenta que surge cuando el
    saldo de la cuenta es negativo */
    float sobregiro;
    
    /**
    * Constructor de la clase CuentaCorrienta
    * @param saldo Parámetro que define el saldo de la cuenta corriente
    * @param tasa Parámetro que define la tasa anual de interés de la
    * cuenta corriente
    */
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa); // Invoca al constructor de la clase padre
        sobregiro = 0; // Inicialmente no hay sobregiro
    }
    
    /**
    * Método que recibe una cantidad de dinero a retirar y actualiza el
    * saldo de la cuenta
    * @param cantidad Parámetro que define la cantidad de dinero a
    * retirar de la cuenta corriente
    */
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad; // Se calcula un saldo temporal
        /* Si el valor a retirar supera el saldo de la cuenta, el valor
        excedente se convierte en sobregiro y el saldo es cero */
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad); /* Si no hay sobregiro, se realiza un
            retiro normal */
        }
    }
    
    /**
    * Método que recibe una cantidad de dinero a consignar y actualiza
    * el saldo de la cuenta
    * @param cantidad Parámetro que define la cantidad de dinero a
    * consignar en la cuenta corriente
    */
    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        // Si existe sobregiro la cantidad consignada se resta al sobregiro
        if (sobregiro > 0) {
        if ( residuo > 0) { /* Si el residuo es mayor que cero, se libera
            el sobregiro */
            sobregiro = 0;
            saldo = residuo;
        } else { /* Si el residuo es menor que cero, el saldo es cero y
            surge un sobregiro */
            sobregiro = -residuo;
            saldo = 0;
        }
        } else {
            super.consignar(cantidad); /* Si no hay sobregiro, se realiza
            una consignación normal */
        }
    }
    /**
    * Método que genera el extracto mensual de la cuenta
    */
    public void extractoMensual() {
    super.extractoMensual(); // Invoca al método de la clase padre
    }
    /**
    * Método que muestra en pantalla los datos de una cuenta corriente
    */
    public void imprimir() {
    System.out.println("Saldo = $ " + saldo);
    System.out.println("Cargo mensual = $ " + comisionMensual);
    System.out.println("Número de transacciones = " +
    (numeroConsignaciones + numeroRetiros));
    System.out.println("Valor de sogregiro = $" +
    (numeroConsignaciones + numeroRetiros));
    System.out.println();
    }
}
