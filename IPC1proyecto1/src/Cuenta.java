/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Cuenta {
    //ATRIBUTOS
    private int id;
    private int dpiCliente;
    double saldo;
    
    
    
    //CONSTRUCTOR
    public Cuenta(int id, int dpiCliente, double saldo){
        this.id = id;
        this.dpiCliente = dpiCliente;
        this.saldo = saldo;  
    }
    
    public void imprimirCuenta(){
        System.out.println("ID: " + this.id + ", DPI cliente: " +this.dpiCliente + ", Saldo: " + this.saldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDpiCliente() {
        return dpiCliente;
    }

    public void setDpiCliente(int dpiCliente) {
        this.dpiCliente = dpiCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
