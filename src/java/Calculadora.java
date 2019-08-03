
public class Calculadora {
    
    public String nombreDeClase;
    private int resultadoSuma;
    
    //METODO PUBLICO SUMAR
    public int sumar(int primerNumero, int segundoNumero){
        this.resultadoSuma = primerNumero + segundoNumero;
        return this.resultadoSuma;
    }
    
    //METODO privado SUMAR
    private int restar (int primerNumero, int segundoNumero){
        return 0;
    }
    
}
