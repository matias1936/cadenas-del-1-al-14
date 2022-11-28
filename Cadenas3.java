//Introducir por teclado una frase palabra a palabra, y mostrar la frase completa se­ parando las palabras introducidas con espacios en blanco.
//Terminar de leer la frase cuando alguna de las palabras introducidas sea la cadena «fin» escrita con cualquier combinación de mayúsculas/minúsculas.
//La cadena «fin» no aparecerá en la frase final.


package cadenas1al14;
import java.util.Scanner;


public class Cadenas1al14 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String frase= "", palabra;

System.out.print("Escriba una palabra:");

palabra = sc.nextLine();
while (!palabra.toLowerCase().equals("fin")){
    
    frase = frase + "" + palabra;
    
    System.out.print ("Escriba una palabra: ");
    palabra = sc.nextLine();
}
System.out.println(frase);
    }
}
