import java.util.ArrayList;

/**
 * @author 
 * Maria José Villafuerte 
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #1 
 * Propósito: 
 * @date 30/01/2023
 */

public class Calculadora implements IPostfixCalculator, IStack{

    @Override
    public boolean isOneItem(IStack operandos) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int suma(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int resta(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int multiplicacion(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int division(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isOperator(String item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<String> getItems(String _expresion) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void push(Object value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Object pull() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object peek() {
        // TODO Auto-generated method stub
        return null;
    }


    
}
