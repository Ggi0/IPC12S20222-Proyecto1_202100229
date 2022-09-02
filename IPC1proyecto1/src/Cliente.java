/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Cliente {
    //ATRIBUTO
    private int cui;
    private String nombre;
    private String apellido;
    //espacios para la cuentas  por cliente
    private Cuenta[] cuentasAsociadas; 

    
    public Cliente(int cui, String apellido, String nombre){
        //no se pide cuentas asociadas
        //porque al registrar el ciente no debe de tener ninguna
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentasAsociadas = new Cuenta[5]; //5 cuentas por cliente --- 5 espacios reservados
        
    }
        
    
    public void imprimir(){
        System.out.println("CUI: " + this.cui +" Nombre: " + this.nombre + " Apellido: " + this.apellido);
    }

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta[] getCuentasAsociadas() {
        return cuentasAsociadas;
    }

    public void setCuentasAsociadas(Cuenta[] cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }
    
    
    
}
