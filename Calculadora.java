import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * @author 
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #1 
 * Propósito: 
 * @date 30/01/2023
 */

public class Calculadora<T> implements IPostfixCalculator, IStack<T>{
    private ArrayList<String> op = new ArrayList<String>(); //Guarda todas las operaciones necesarias en posfix
    private ArrayList<T> ourStack = new ArrayList<T>();

    private void ReadDoc (String doc) { //Lee el documento con operaciones y guarda los datos
        try {
            File data = new File(doc);
            Scanner myReader = new Scanner(data);
            while (myReader.hasNextLine()) {
                String info = myReader.nextLine();
                op.add(info);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

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
        return a/b;
    }

    @Override
    public boolean isOperator(String item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<String> getItems(String _expresion) {
        String[] elements = _expresion.split(" "); //Guarda en una lista cada elemento de la expresión omitiendo los espacios en blanco
        return new ArrayList<String>(Arrays.asList(elements)); //Retorna la lista convertida en un ArrayList
    }


    @Override
    public int count() {
        return ourStack.size();
    }

    @Override
    public boolean isEmpty() {
        return ourStack.isEmpty();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return null;
    }


    
}
