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
    Scanner sc = new Scanner(System.in); 
    readFile readFile = new readFile();

    public static void main(String[] args) {
        
    }

    /**
     * Menu principal del programa 
     */
    public void mainMenu(){

        System.out.println("Bienvenido a la Calculadora Postfix");
        
    }
    /**
     * Metodo que recibe la ruta del archivo que se va a leer 
     */
    public void fileRute(){
        System.out.println("Por favor, ingrese la ruta de su archivo: ");
        System.out.println("\tEjemplo: C:\\archivo\\datos.txt");

        String file = sc.nextLine(); 

        readFile._readfile(file); 
    
    }


}
