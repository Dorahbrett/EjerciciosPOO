/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formasgeometricas;

/**
 *
 * @author Doriannys
 */
public class Rectangulo implements CalculosFormas{
    
    private double Base;
    private double Altura;

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    @Override
    public  double calcularArea (){
        return Base * Altura;
    }
            
    @Override
    public  double calcularPerimetro (){
        return (Base * Altura)* 2;
    }
public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setBase(5);
        rectangulo1.setAltura(8);
        double areaRectangulo = rectangulo1.calcularArea();
        System.out.println("El Area del Rectagulo es de:" + areaRectangulo);
        rectangulo1.calcularPerimetro();
        double perimetroRectangulo  = rectangulo1.calcularPerimetro();
        System.out.println("El Perimetro del Rectangulo es de:" + perimetroRectangulo);
                
        
        
        // TODO code application logic here
    }
}

