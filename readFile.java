import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * @author 
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #2
 * Propósito: 
 * @date 30/01/2023
 */

public class readFile {

/**
* Metodo que lee el documento con las operaciones Postfix y guarda los datos 
* @param fpath Lugar donde se encuentra el doc en formato txt con las operaciones 
*/
public void _readfile(String fpath) {

  ArrayList<String> op = new ArrayList<String>(); //Guarda todas las operaciones necesarias en posfix
  String info = ""; 

    try {
      
        File data = new File(fpath);
        Scanner myReader = new Scanner(data);

        while (myReader.hasNextLine()) {
          info = myReader.nextLine();
          System.out.println(data);
          op.add(info); 

        }
        myReader.close();

      } catch (FileNotFoundException e) {

        System.out.println("An error occurred.");
        e.printStackTrace();

    }
  

  }
}