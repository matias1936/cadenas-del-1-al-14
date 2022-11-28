//Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre.
//Por ejemplo, "Álvaro Pérez" se mostrará "lvr Prz".
//Solo se eliminan las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.

package cadenas1al14;
import java.util.Scanner;


public class Cadenas5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String nombre, sinVocales = "";
char c;
System.out.print("Por favor escriba su nombre. ");
nombre = sc.nextLine();
for ( int i= 0; i < nombre.length(); i++){
    c = nombre.charAt(i);
    
    if (!esVocal(c)){
        sinVocales = sinVocales + c;
   
    }
}
System.out.println(sinVocales);
        }
    static boolean esVocal (char c) {
        boolean result;
        String vocales = "aeiouáéúíóäëïöü";
        
        c = Character.toLowerCase(c);
        if (vocales.indexOf(c) == -1) {
            result = false;
        } else {
            result = true;
        }
        return result;
        
        }
    }