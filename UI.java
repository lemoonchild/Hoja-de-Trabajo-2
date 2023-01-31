import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 
 * Maria José Villafuerte 
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #2
 * Propósito: Ser la interfaz del usuario, mostrará la operación a realizar y el resultado
 * @date 30/01/2023
 */

public class UI {
    static Scanner sc = new Scanner(System.in); 
    static readFile readFile = new readFile();

    public static void main(String[] args) {
    
        System.out.println("\nBienvenido a la Calculadora Postfix");
        ArrayList<String> postfix = readFile._readfile("datos.txt//");
        Calculadora calculadora = new Calculadora();

        for (String element: postfix) {
            System.out.println("\n\tOperación a realizar: " + element);

            System.out.println("\tResultado obtenido: " + Calculadora.calculate(element) + "\n");
        }

        System.out.println("\nSe han hecho los cálculos de todo el archivo");
        





    }


}
