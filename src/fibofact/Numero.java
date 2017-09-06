package fibofact;

import java.util.ArrayList;
  /**
 * Clase en donde recibirá todos los parametros como los numeros ingresados y el resultado final
 * @author Medina Villalpando Josue de Jesus 
  * @version 1.0
 * @since 22/08/17
 */
public class Numero {
  
    private int num;
    private int resultado;
    ArrayList<Integer> fibo = new ArrayList<Integer>();
   
    /**Obtiene el numero ingresado
     * 
     */  
    public int getNum() {
    
        return this.num;
    }
    /**Guarda el numero ingresado
     * 
     */
    public void setNum(int num) {
    
        this.num = num;
    }
    /**Metodo para obtener el factorial de un numero ingresadol
     * 
     */
    public int Factorial(int num) {
    
        this.resultado = 0;

        for (int i = num; i > 1; i--) {

            if (this.resultado == 0) {
                this.resultado = this.resultado + (i * (i - 1));
            } else {
                this.resultado = (this.resultado * (i - 1));
            }
        }
        return this.resultado;
    }
   /**Metodo que regresa un arraylist con los numeros de la serie de fibonnacci.
     * @param n El parametro n recibe la longitud de la serie de fibonacci proporcioando por el usuario
     */
    public ArrayList fibonacci(int n) {
    
        this.fibo.removeAll(this.fibo);
        int fibo1 = 0;
        int fibo2 = 1;
        int aux;
        this.fibo.add(0);

       while (fibo2 + fibo1 <= n) {
      
            aux = fibo1;
            fibo1 = fibo2;
            fibo2 = aux + fibo1;
                 
            this.fibo.add(fibo2);
       }

        return this.fibo;
    }

}
