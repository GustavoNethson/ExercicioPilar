/*Crie uma classe abstrata chamada "formaGometrica* e com um metodo abstrato "calcular()". Em seguida crie duas sub classes retangulo
e circulo que herdam da classe formaGeometrica e implementam o metodo calcularArea() de meneiras diferentes.*/
package javaapplication4;
import java.util.Scanner;


public class JavaApplication4 {
    public static void main(String[] args) {
       // Scanner inserir = new Scanner(System.in);
       // System.out.println("informar o raio do circulo: ");
       // inserir.nextDouble();
        
       // System.out.println("Informar a base do retangulo: ");
      //  inserir.nextDouble();
        
       // System.out.println("Informar a altura do retangulo: ");
       // inserir.nextDouble();
        
        Circulo circulo = new Circulo();
        circulo.CalcularArea();
        
        
        Retangulo retangulo = new Retangulo();
        retangulo.CalcularArea();
    }
    
}
