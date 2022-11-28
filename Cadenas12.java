//Un anagrama es un palabra, o frase, que resulta de la transposición de otra palabra o frase. 
//Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. 
//Construir un programa que solicite al usuario dos palabras e indique si son anagramas una de otra.
import java.util.Scanner;
import java.util.Arrays;

public class Cadenas12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String palabra1, palabra2;
        System.out.println("Escriba una palabra: ");
        palabra1 = sc.nextLine();
        System.out.println("Escriba otra palabra por favor: ");
        palabra2 = sc.nextLine();
        
        if (palabra1.length() != palabra2.length()){
            System.out.println("No son anagramas");
        } else {
            char p1[] = palabra1.toCharArray();
            char p2[] = palabra2.toCharArray();
            
            Arrays.sort(p1);
            
            Arrays.sort(p2);
            
            palabra1= String.copyValueOf(p1);
            palabra2= String.copyValueOf(p2);
            
            if (palabra1.equalsIgnoreCase(palabra2)){
                System.out.println("Son anagramas");
            } else {
                System.out.println("No son anagramas.");
            }
        }
    }
    
}
