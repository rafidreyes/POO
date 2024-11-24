/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author Rafael Reyes
 */
public class Deposito extends CuentaBancaria{
    
    public Deposito(String Titular, double Saldo, int Numero_cuenta) {
        super(Titular, Saldo, Numero_cuenta);
    }

    public String realizarDeposito(double monto) {
        if (monto <= 0) {
            return "El monto a depositar debe ser mayor a 0.";
        }
        setSaldo(getSaldo() + monto);
        return "Depósito realizado con éxito. Nuevo saldo: " + getSaldo();
    }
    
}
