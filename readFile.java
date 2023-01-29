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
 * @param fpath
 * @return
 */
public static String _readfile(String fpath) {

    String data = ""; 

    try {
        File myObj = new File(fpath);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    return data; 
  }
}