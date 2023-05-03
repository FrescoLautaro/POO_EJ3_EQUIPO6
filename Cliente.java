/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author 
 */
public class Cliente extends Persona{
    private int telefono;

    
    @Override
    public String toString() {
        return "Cliente{" + "telefono=" + telefono + '}';
    }

    
    
    
    public Cliente(int telefono) {
        this.telefono = telefono;
    }

    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
 
}
