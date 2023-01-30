import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #2
 * Propósito: 
 * @date 30/01/2023
 */

public class PostfixCalculator<T> implements IPostfixCalculator{

    private ArrayList<String> op = new ArrayList<String>(); //Guarda todas las operaciones necesarias en posfix

    /**
     * 
     */
    @Override
    public boolean isOneItem(IStack operandos) {
        if (operandos.count() == 1){
            return true;
        } else {return false;}
    }

    /**
     * 
     */
    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    /**
     * 
     */
    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    /**
     * 
     */
    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    /**
     * 
     */
    @Override
    public int division(int a, int b) {
        return a/b;
    }

    /**
     * 
     */
    @Override
    public boolean isOperator(String item) {
        
        if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")){
            return true;
        } else {
            return false; 
        }
    }

    /**
     * Metodo que guarda en una lista cada elemento de la expresión omitiendo espacios. 
     * @param _expresion Elementos de tipo String de la expresion 
     * @return Lista convertida en un ArrayList 
     */
    @Override
    public ArrayList<String> getItems(String _expresion) {

        String[] elements = _expresion.split(" "); 
        return new ArrayList<String>(Arrays.asList(elements)); 
    }

}
