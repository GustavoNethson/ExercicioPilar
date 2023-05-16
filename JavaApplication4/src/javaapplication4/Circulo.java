package javaapplication4;
//3,14 * r²
class Circulo extends FormaGeometrica {
    public double raioCirculo = 5;
    public double PI = 3.14;
    
   public void CalcularArea (){
       System.out.println("O valor da area do circulo e: ");
       System.out.println((raioCirculo*raioCirculo) * PI);
       
   }
}
