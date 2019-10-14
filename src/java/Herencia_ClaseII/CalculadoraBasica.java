
package Herencia_ClaseII;

public class CalculadoraBasica implements CalculadoraInterface {
    public String nombreDeCalculadora; //ATRIBUTOS DE CLASE
    
    @Override
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero + segundoNumero;
    }
    
    //METODO privado SUMAR
    @Override
    public double restar (double primerNumero, double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    @Override
    public double multiplicar (double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }

    @Override
    public double dividir(double primerNumero, double segundoNumero) {
        return primerNumero / segundoNumero;
    }
    
}


