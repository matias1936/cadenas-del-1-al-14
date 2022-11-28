//Introducir por teclado dos palabras e indicar cuál de ellas es la más corta, es decir, la que contiene menos caracteres.
package cadenas1al14;
import java.util.Scanner;


public class Cadenas1al14 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longPal1, longPal2;
        
        System.out.println("Primera palabra: ");
        String palabra1 = sc.nextLine();
        System.out.println("Segunda palabra: ");
        String palabra2 = sc.nextLine();
        
        longPal1 = palabra1.length();
        longPal2 = palabra2.length();
        
        if (longPal1 == longPal2){
            System.out.println("Son de idéntica longitud.");
        } else if (longPal1 < longPal2){
            System.out.println(palabra1 + " es más corta que " + palabra2);
        } else { 
            System.out.println(palabra2 + " es más corta que " + palabra1);
            
        }
    }
    
}
