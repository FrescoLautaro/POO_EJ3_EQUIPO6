/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author 
 */
public class Directivo extends Empleado {
    private String categoria;
    private String empleadoarray[];

    public Directivo(String categoria, String[] empleadoarray) {
        this.categoria = categoria;
        this.empleadoarray = empleadoarray;
    }

    @Override
    public String toString() {
        return "Directivo{" + "categoria=" + categoria + ", empleadoarray=" + empleadoarray + '}';
    }

    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String[] getEmpleadoarray() {
        return empleadoarray;
    }

    public void setEmpleadoarray(String[] empleadoarray) {
        this.empleadoarray = empleadoarray;
    }

}
