/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author 
 */
public class Empleado extends Persona {
   
    private double sB;

    public Empleado(String n, int e,  double sB) {
        super(nombre, edad);
        this.sB = sB;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sB=" + sB + '}';
    }
    
        

}
