import java.util.ArrayList;

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
    Stack pila = new Stack<T>(); 

    /**
     * 
     */
    public Calculadora() {

        stack = new Stack<Integer>();

    }

    /**
     * Metodo que guarda en la pila los elememtos del ArrayList y realiza las operaciones cuando encuentra un operando (solo con los primeros dos elementos)
     * @param Firstpostfix Primera linea del documento txt 
     * @return resultado de la pila 
     */
    public static int calculate(String Firstpostfix){

        operaciones = calculadora.getItems(Firstpostfix); 

        for (int i = 0; i < operaciones.size(); i++) {

            String num_op = operaciones.get(i); 
            
            if (calculadora.isOperator(num_op)){
                
                int a = stack.pull(); 
                int b = stack.pull(); 

                switch(num_op){

                    case "+":
                        stack.push(calculadora.suma(a, b));
                        break; 
                    case "-" :
                        stack.push(calculadora.resta(a, b));
                        break; 
                    case "*": 
                        stack.push(calculadora.multiplicacion(a, b));
                        break; 
                    case "/": 
                        stack.push(calculadora.division(a, b));
                        break; 
                }

            } else {
                stack.push(Integer.valueOf(num_op));
            }
            
        }
        return stack.pull(); 
    }

}
