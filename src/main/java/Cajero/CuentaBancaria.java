/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author Rafael Reyes
 */
public class CuentaBancaria {
    private String Titular;
    private double Saldo;
    private int Numero_cuenta;

    public CuentaBancaria(String Titular, double Saldo, int Numero_cuenta) {
        this.Titular = Titular;
        this.Saldo = Saldo;
        this.Numero_cuenta = Numero_cuenta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getNumero_cuenta() {
        return Numero_cuenta;
    }

    public void setNumero_cuenta(int Numero_cuenta) {
        this.Numero_cuenta = Numero_cuenta;
    }
    
    @Override
public String toString() {
    return "CuentaBancaria{" +
           "Titular='" + Titular + '\'' +
           ", Saldo=" + Saldo +
           ", Numero_cuenta=" + Numero_cuenta +
           '}';
    }

}
