package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    
    /** Número de cuenta bancaria */
    private String cuenta;
    
    /** Saldo disponible en la cuenta */
    private double saldo;
    
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     * 
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el nombre del titular.
     * 
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular.
     * 
     * @param nombre Nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta Nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual.
     * 
     * @return Saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés.
     * 
     * @return Tipo de interés aplicado
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés.
     * 
     * @param tipoInterés Nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el estado actual de la cuenta.
     * 
     * @return Saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar (debe ser positiva)
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar (debe ser positiva y menor o igual al saldo)
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}