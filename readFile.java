import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
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
 * Metodo que lee el documento con las operaciones Postfix y guarda los datos dentro de ArrayList 
 * @param fpath Mensaje de lugar donde se encuentra el archivo datos.txt 
 * @return data String
 */
public static String _readfile(String fpath) {

  String data = ""; 

  try {

      File myObj = new File(fpath);
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {

        data = myReader.nextLine();

      }
      myReader.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
  }
  return data; 
}
}
