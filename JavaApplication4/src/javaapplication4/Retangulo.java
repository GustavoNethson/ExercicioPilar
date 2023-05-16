package javaapplication4;

class Retangulo extends FormaGeometrica {
    public double baseRetangulo = 8;
    public double alturaRetangulo = 4;
    
    public void CalcularArea(){
       System.out.println("O valor da area do retangulo e: ");
       System.out.println(baseRetangulo * alturaRetangulo);
    }
   
}
