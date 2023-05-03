
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author 
 */
 public class Vendedor extends Empleado{
    private double cantVendida;
    private double comision;

    
    public Vendedor(String Nombre, String edad, Sueldo sueldo, double cantVendida, EmpleadoArray[]list) {
        super(Nombre, edad, sueldo, EmpleadoArray[]);
        this.cantVendida = cantVendida;
        this.comision = comision;
    }
    
    public double Comision(){
    int cantventas;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Ingrese la cantidad de ventas");
    cantventas=entrada.nextInt();
    comision=(cantventas*2)/100;
    return comision;
    
    
    }

    public double getCantVendida() {
        return cantVendida;
    }

    public void setCantVendida(double cantVendida) {
        this.cantVendida = cantVendida;
    }

    public double getComision() {
        return comision;
    }

    public String toString() {
        return "Vendedor{" + "comision=" + comision + '}';
    }
}
