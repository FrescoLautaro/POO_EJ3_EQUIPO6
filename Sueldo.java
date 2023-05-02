/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author 
 */
public class Sueldo {

private double obraSocial;
    private double jubilacion;
    private double presentismo;
    private double sB;
    private Vendedor vendedor;

    public Sueldo(double obraSocial, double jubilacion, double presentismo, String cargo, AsignacionFamiliar af, char g, Vendedor v) {
        this.obraSocial = obraSocial;
        this.jubilacion = jubilacion;
        this.presentismo = presentismo;
        this.vendedor = v;
    }
 
    public void emitirDetalle()
    {
        System.out.println("OBRA SOCIAL: "+ this.obraSocial + " JUBILACION: "+ this.jubilacion+" PRESENTISMO: "+this.presentismo+ " SUELDO NETO: "+);
    }


    public double getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(double obraSocial) {
        this.obraSocial = obraSocial;
    }

    public double getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(double jubilacion) {
        this.jubilacion = jubilacion;
    }

    public double getPresentismo() {
        return presentismo;
    }

    public void setPresentismo(double presentismo) {
        this.presentismo = presentismo;
    }




}
