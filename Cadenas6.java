//Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
//Un ejemplo, la cadena "Hola mundo" quedaría "odnum aloH"

package cadenas1al14;
import java.util.Scanner;


public class Cadenas6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String antes, despues;
        System.out.println("Escriba una cadena; ");
        antes = sc.nextLine();
        
despues = alReves(antes);
System.out.println(despues);

    }
    
static String alReves(String original){
    String nueva = "";
    char t[] = original.toCharArray();
    for (int i=0; i<t.length; i++){
        nueva = t[i] + nueva;
    }
    return nueva;
}
}
  