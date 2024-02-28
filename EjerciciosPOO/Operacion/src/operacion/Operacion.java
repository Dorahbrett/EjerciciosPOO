/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacion;
import java.util.Scanner;   

/**
 *
 * @author Doriannys
 */
public class Operacion {
    
    private int numero1;
    private int numero2;
    
    // metodo constructor sin todos los atributos psados por parametro
    public Operacion (){   
    }
    
    // metodo constructor con todos los atributos psados por parametro
    public Operacion(int numero1, int numero2){
    this.numero1 = numero1;
    this.numero2 = numero2;
}
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //metodo crear operacion
    public void crearOperacion(){
    
        Scanner pedirDatos = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        numero1 = pedirDatos.nextInt();
        setNumero1(numero1);
        System.out.println("Ingrese el numero 2:");
        numero2 = pedirDatos.nextInt();
        setNumero2(numero2);    
    }

    //metodo sumar
    public int sumar(){
    
        int suma = getNumero1() + getNumero2();
        return suma;
        
    }
    //metodo restar
    public int restar(){
    
        int resta = getNumero1() - getNumero2();
        return resta;
    
    }
    
    //metodo multiplicar
    public int multiplicar(){
        if (getNumero1() !=0 && getNumero2() != 0){
        int multiplica = getNumero1() * getNumero2();
        return multiplica;
    } else{
            return 0;
        }
    }
    
    //metodo dividir
     public double dividir(){
        if(getNumero2() != 0){
        double divide = getNumero1() / getNumero2();
        return divide;
    } else{
            System.out.println("Error no se puede dividir entre 0");
            return 0;
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Método constructor sin los atributos pasados por parámetro
        Operacion a = new Operacion();
        System.out.println("El numero1 es: " + a.numero1  + " El numero2 es: "+ a.numero2);
        
        
        // Método constructor con los atributos pasados por parámetro
        Operacion b = new Operacion(5,6);
        System.out.println("El numero1 es: " + b.numero1  + " El numero2 es: "+ b.numero2);

         //metodo crear operacion
        Operacion c = new Operacion();
        c.crearOperacion();
        System.out.println("Se establecio el numero1 en: " + c.getNumero1());
        System.out.println("Se establecio el numero2 en: " + c.getNumero2());
        
        //metodosumar
        c.sumar();
        System.out.println("NUMERO1 + NUMERO2: " + c.sumar());
        
        //metodo restar
        c.restar();
        System.out.println("NUMERO1 - NUMERO2: " + c.restar());
        
        //metodo multiplicar
        c.multiplicar();
        System.out.println("NUMERO1 * NUMERO2: " + c.multiplicar());
        
        //metodo dividir
        c.dividir();
        System.out.println("NUMERO1 / NUMERO2: " + c.dividir());
        
        
        // TODO code application logic here
    }

   

    
}
