
package Herencia;


public class Circulo {
    public double calcularAreaCirculo(double radio){
        double areaCirculo = Math.PI * (Math.pow(radio, 2));
        return areaCirculo;
    }
    
    public double calcularPerimetroCirculo(double radio){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
