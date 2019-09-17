
package Herencia;

public class Triangulo extends FiguraGeometricaPlana {
    
    
    
    public double calcularArea(double base, double altura){
        double area =(base * altura)/2;
        return area;
    }
    
    public double calcularPerimetro(){
         return 0.0;
     }
}
