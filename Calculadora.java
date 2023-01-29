import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #2
 * Propósito: 
 * @date 30/01/2023
 */

public class Calculadora<T> {

    static PostfixCalculator calculadora = new PostfixCalculator(); 
    private static Stack<Integer> stack;
    static ArrayList<String> operaciones;

    public Calculadora() {

        stack = new Stack<Integer>();
        read();

    }

    public void read(){
        System.out.println("Ingrese la ruta del archivo ej C:\\ejemplos\\example1.txt");
        Scanner in = new Scanner(System.in);
        String fpath = in.nextLine();

        operaciones = readFile._readfile(fpath);
    }
     
    
}
