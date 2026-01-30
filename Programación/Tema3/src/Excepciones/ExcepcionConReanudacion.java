package Excepciones;

import java.util.Scanner;

/**
 *
 * @author Rosa
 */
public class ExcepcionConReanudacion {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
      boolean procesar = true;
      while (procesar){
          try {

            System.out.println("Escriba un número");
            num = Integer.parseInt(sc.nextLine());
            System.out.println("El número es " + num);
            procesar = false;

          } catch (NumberFormatException ex){
            
              System.out.println("No escribió un número entero");
              System.out.println(ex.getMessage());

          }
      }
      sc.close();
    }

}
