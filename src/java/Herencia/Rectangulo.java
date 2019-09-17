
package Herencia;


public class Rectangulo extends FiguraGeometrica implements FiguraGeometricaPlanaInterfaz{
    
    private double area;
    
     public double calcularArea(double base, double altura){
        this.area = base * altura;
        return this.area;
    }
       
    
    public double calcularPerimetro(double base, double altura){
        double perimetro = (2 * base) + (2 * altura);
        return perimetro;
    }
    
}
