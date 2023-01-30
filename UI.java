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

public class UI {
    static Scanner sc = new Scanner(System.in); 
    static readFile readFile = new readFile();

    public static void main(String[] args) {
    
        System.out.println("\nBienvenido a la Calculadora Postfix");

        String postfix = readFile._readfile("datos.txt");
        
        Calculadora calculadora = new Calculadora(); 

        System.out.println("\n\tOperación a realizar: " + postfix);

        System.out.println("\tResultado obtenido: " + Calculadora.calculate(postfix) + "\n");


    }


}
