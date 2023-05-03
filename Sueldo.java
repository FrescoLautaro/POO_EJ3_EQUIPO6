/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */


/* 8,33% es el presentismo
*  3% por parte de la obra social
* 2% por Pami
* 11% por jubilacion 
* 1,5% por el fondo ancional de empleo
* seguro de vida 00,3%


*/
/**
 *
 * @author 
 */
public class Sueldo {

private double obraSocial;
    private double jubilacion;
    private double presentismo;
    private double SueldoBruto;
    private Vendedor vendedor;

    public Sueldo(double obraSocial, double jubilacion, double presentismo, Vendedor v) {
        this.obraSocial = obraSocial;
        this.jubilacion = jubilacion;
        this.presentismo = presentismo;
        this.vendedor = v;
    }
 
    public void emitirDetalle()
    {
        System.out.println("OBRA SOCIAL: "+ this.obraSocial + " JUBILACION: "+ this.jubilacion+" PRESENTISMO: "+this.presentismo+ " SUELDO NETO: "+ this.CalcularNeto());
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
    
    public double CalcularNeto(){
        
        double SueldoNeto = 0.0;
        SueldoNeto = SueldoBruto - 3*100/SueldoBruto - 11*100/SueldoBruto + 10*100/SueldoBruto;
        return SueldoNeto;
    }




}
