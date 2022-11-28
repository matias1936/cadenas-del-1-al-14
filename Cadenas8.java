//Realizar un programa que lea una frase del teclado y nos indique si es palíndroma.
//es decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios.
//Un ejemplo de frase palíndroma es: Dábale arroz a la zorra el abad.
//Las vocales con tilde hacen que un algoritmo tome una frase palíndroma como si no lo fuese.
//Por esto, supondremos que el usuario introduce la frase sin tildes.
 import java. util.Scanner;
public class Cadenas8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase, sinEspacios, invertida;
        
        System.out.println("Introduzca una frase");
        frase=sc.nextLine();
        sinEspacios = eliminaEspacios(frase);
        invertida = alReves(sinEspacios);
        
        if (sinEspacios.equals(invertida)){
            System.out.println("La frase es palíndroma");
        } else {
            System.out.println("La frase no es palíndroma");
        }
    }
    static String eliminaEspacios (String cadena){
        String sin = "";
        
        for (int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if (!Character.isWhitespace(c)) {
                sin = sin + c;
            }
            
        }
        return sin;
    }
    static String alReves(String original){
        String nueva = "";
        char t[] = original.toCharArray();
        
        for (int i = 0; i < t.length; i++){
            nueva = t[i] + nueva;
        }
        return nueva;
    }
}
          