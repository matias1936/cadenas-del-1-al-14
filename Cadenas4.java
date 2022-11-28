//Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.

package cadenas1al14;
import java.util.Scanner;


public class Cadenas1al14 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int numEspaciosBlanco = 0;
        char c;
        System.out.println("Escriba una frase: ");
        frase = sc.nextLine();
        
for (int i = 0; i < frase.length(); i++){
    c = frase.charAt(i);
    if (Character.isSpaceChar(c)) {
        numEspaciosBlanco++; 
  
    }
}
System.out.println(" tiene:" + numEspaciosBlanco + " espacios en blanco");
    }
}
