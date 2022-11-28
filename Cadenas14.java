//Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra o frase,
//y la aplicación muestra un anagrama (transposición de los caracteres) del texto introducido generado al azar.
//A continuación otro jugador tiene que acertar cuál es el texto original.
//La aplicación no debe permitir que el texto introducido por el jugador 1 sea la cadena vacía.
//Por ejemplo, si el jugador 1 escribe "teclado", la aplicación muestra como pista un anagrama al azar: "etcloda".

import java.util.Scanner;
public class Cadenas14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String original, intento;
        char anagrama[];
        
        do{
            System.out.println("Jugador 1. Introduzca una frase.");
            original = sc.nextLine();
        } while (original.isEmpty());
        anagrama = original.toCharArray();
        int tam=original.length();
        
        for (int numCambios = 0; numCambios < tam; numCambios++){
            int i = (int) (Math.random() * tam);
            int j = (int) (Math.random() * tam);
            
            char aux = anagrama[i];
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
        }
    String anagramaFinal = String.copyValueOf(anagrama);
    System.out.println("Escriba un anagrama de: " +anagramaFinal);
    
    do{
        System.out.println("Jugador 2. ¿Cuál es el original? ");
        intento = sc.nextLine();
    } while (!original.equals(intento));
    System.out.println("Has acertado...");
        }
        }
    

