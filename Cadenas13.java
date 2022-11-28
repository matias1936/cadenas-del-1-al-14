//6.13. Diseñar un algoritmo que lea del teclado una frase e indique, para la letras que aparecen en la frase, cuántas veces se repite cada una.
//Se consideran iguales las letras mayúsculas y las minúsculas para realizar la cuenta. Un ejemplo sería:
//Frase: En un lugar de la Mancha. Resultado:
//a: 4 veces
//d: 1 vez
//e: 2 veces
    
import java.util.Scanner;

public class Cadenas13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        int[] numVeces;
        
        System.out.print("Introduzca una frase: ");
        frase = sc.nextLine();
        
        frase = frase.toLowerCase();
        numVeces = new int ['z' - 'a' + 1];
        
        for (int i = 0; i < frase.length(); i++){
            if (Character.isLetter(frase.charAt(i))){
                numVeces[frase.charAt(i) - 'a']++;
            }
        }
    for (int i=0;i < frase.length(); i++){
        if (Character.isLetter(frase.charAt(i))){
            numVeces[frase.charAt(i) - 'a']++;
        }
    }
    for (int i=0; i < 'z' - 'a'; i++){
        if (numVeces[i] != 0){
            System.out.println("La letra" + (char) (i+'a')
                    + "se repite" + numVeces[i] + " veces");
            }
        }
    }
}
