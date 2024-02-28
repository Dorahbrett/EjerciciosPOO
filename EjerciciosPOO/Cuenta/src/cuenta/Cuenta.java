/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;
import java.util.Scanner;

/**
 *
 * @author Doriannys
 */
public class Cuenta {
    int numeroCuenta;
    long DNI;
    double saldoActual;
    
    // Metodo Constructor por defecto
    public Cuenta (){
    }
    
    // Metodo Constructor por parametros
    public Cuenta (int numeroCuenta, long DNI, double saldoActual){
    this.numeroCuenta = numeroCuenta;
    this.DNI = DNI;
    this.saldoActual = saldoActual;   
    }
    
    // Metodo get/set
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    // Metodo crearcuentanueva
    public Cuenta crearCuentaNuevaXusuario (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta del cliente:");
        int nuneroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        long DNI = scanner.nextLong();
        System.out.println("Ingrese el monto del saldo del cliente:");
        double saldoActual = scanner.nextDouble();
        return new Cuenta (numeroCuenta, DNI, saldoActual);
    }
    
    // Metodo Consultar Saldo
    public double consultarSaldo(){
        return saldoActual;
    }
     // Metodo Depositar
    public void Depositar(double ingreso){
        saldoActual = saldoActual + ingreso; 
    }
    // Metodo Retirar
    public void Retirar(double retiro){
        if (saldoActual < retiro){
            saldoActual = 0;
        } else {
        saldoActual = saldoActual - retiro;
        }
            }
    
    // Metodo extraccionRapida
    void extraccionRapida(){
        saldoActual = saldoActual - (saldoActual * 0.2);
    }
    // para el Metodo Consultar Datos
    public void consultarDatos (){
        System.out.println("Los datos de la cuenta son: Numero de Cuenta:" + getNumeroCuenta() + " /Numero de DNI: " + getDNI() + " /Saldo Actual: " +getSaldoActual());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here

        // Metodo Constructor por defecto
        Cuenta a = new Cuenta();
        System.out.println("El numero de cuenta es: " + a.numeroCuenta + " /El DNI es: " + a.DNI + " /El Saldo Actual de la cuenta es: " + a.saldoActual);
        
        // Metodo Constructor por parametros
        Cuenta b = new Cuenta(123456, 98765432, 100.0);
        System.out.println("El numero de cuenta es: " + b.numeroCuenta + " /El DNI es: " + b.DNI + " /El Saldo Actual de la cuenta es: " + b.saldoActual);
        
        // Metodo crear cuenta nueva
        Cuenta c = new Cuenta();
        c = c.crearCuentaNuevaXusuario();
        System.out.println("Los datos de la nueva cuenta son: Numero de Cuenta:" + c.numeroCuenta + "/ Numero DNI:" + c.DNI + " /SaldoCliente:" + c.saldoActual);

        // Metodo Depositar
        c.consultarSaldo();
        System.out.println("El Saldo inicial de la cuenta es de: "+ c.consultarSaldo());
        c.Depositar(800);
        System.out.println("El Saldo final de la cuenta es de: "+ c.consultarSaldo());
       
        // Metodo Retirar saldo con monto menor al saldo
        c.consultarSaldo();
        System.out.println("El Saldo inicial de la cuenta es de: "+ c.consultarSaldo());
        c.Retirar(100);
        System.out.println("El Saldo final de la cuenta es de: "+ c.consultarSaldo());
        
        // Metodo Retirar saldo con monto mayor al saldo
        c.consultarSaldo();
        System.out.println("El Saldo inicial de la cuenta es de: "+ c.consultarSaldo());
        c.Retirar(7500);
        System.out.println("El Saldo final de la cuenta es de: "+ c.consultarSaldo());
        
        //Metodo Extraccion Rapida
        Cuenta d = new Cuenta(123456, 98765432, 10000.0);
        System.out.println("El Saldo inicial de la cuenta es de: "+ d.consultarSaldo());
        d.extraccionRapida();
        System.out.println("El Saldo final de la cuenta es de: "+ d.consultarSaldo());
       
        // Metodo Consultar Datos
        d.consultarDatos();
        
    }
    

}