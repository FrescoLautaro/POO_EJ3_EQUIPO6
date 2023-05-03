/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class Empresa {
    private Empleado empleados[];
    private Cliente clientes[];

    public Empresa(Empleado[] empleados, Cliente[] clientes) {
        this.empleados = empleados;
        this.clientes = clientes;
    }
    
    public void mostrarDatos_E(){
    System.out.println("Los datos del empleado son: "+ this.empleados);
 
    }
    
    public void mostrarDatos_C(){
    System.out.println("Los datos del cliente son: "+ this.clientes);
    
    }
    
    
    
    
    
    
    

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    
    
}
