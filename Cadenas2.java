 //Diseñar el juego acierta la contraseña. La mecánica del juego es la siguiente: el pri­ mer jugador introduce la contraseña; 
 //a continuación, el segundo jugador debe teclear palabras hasta que la acierte. Realizar dos versiones; 
 //en la primera las únicas pistas que se proporcionan son el número de caracteres y cuáles son el primer y el último carácter de la contraseña. 
 //En la segunda versión se facilita el juego indicando si la palabra introducida es mayor o menor, alfabéticamente, que la contraseña


package cadenas1al14;
import java.util.Scanner;


public class Cadenas1al14 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String contraseña, palabra;
            
System.out.println("Jugador 1. Introduzca la contraseña: ");
contraseña = sc.nextLine();
int 1 = contraseña.length();

char primer = contraseña.charAt(0);
char ultimo = contraseña.charAt(1 - 1);

System.out.println("Pistas\nLongitud: " + l);
System.out.println("Primer carácter: " + primer);
System.out.println("Último carácter: " + ultimo);

do {
    System.out.print("Jugador 2. Palabra: ");
    palabra = sc.nextLine();
} while (!contraseña.equals(palabra));

System.out.println("¡La contraseña es correcta!");
    }
}
