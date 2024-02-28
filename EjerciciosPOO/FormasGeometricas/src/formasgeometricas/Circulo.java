/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formasgeometricas;

/**
 *
 * @author Doriannys
 */
public class Circulo implements CalculosFormas {
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
@Override    
    public double calcularArea (){
        
        return PI * radio * radio;
        
}
    
 @Override
    public double calcularPerimetro(){
        
        return 2 * PI * radio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(5);
        double areaCirculo = circulo1.calcularArea();
        System.out.println("El Area del Circulo es de:" + areaCirculo);
        circulo1.calcularPerimetro();
        double perimetroCirculo  = circulo1.calcularPerimetro();
        System.out.println("El Perimetro del Circulo es de:" + perimetroCirculo);
                
        
        
        // TODO code application logic here
    }
    
}
