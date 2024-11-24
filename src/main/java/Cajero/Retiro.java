/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author Rafael Reyes
 */
public class Retiro extends CuentaBancaria {
    
    public Retiro(String Titular, double Saldo, int Numero_cuenta) {
        super(Titular, Saldo, Numero_cuenta);
    }
    
    public String realizarRetiro(double monto) {
        if (monto <= 0) {
            return "El monto debe ser mayor a 0.";
        }
        if (monto > getSaldo()) {
            return "Fondos insuficientes. Saldo actual: " + getSaldo();
        }
        setSaldo(getSaldo() - monto);
        return "Retiro exitoso. Nuevo saldo: " + getSaldo();
    }
    
}
