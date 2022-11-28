//Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con "Javalín, javalón",
//para después hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje.
//Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio,
//más o menos prolongado y la coletilla "javalén, len, len". Se pide diseñar un traductor que, en primer lugar,
//nos diga si la frase introducida está escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
import java.util.Scanner;
public class Cadenas9 {
    public static void main(String[] args){
        final String prefijo = "javalín, javalón";
        final String sufijo = "javalén, len, len";
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String entrada = sc.nextLine();
        boolean idiomaJavalandia = false;
        
        if (entrada.startsWith(prefijo)){
            idiomaJavalandia = true;
            entrada = entrada.substring(prefijo.length());
        
        } else if (entrada.endsWith(sufijo)){
            idiomaJavalandia = true;
            entrada = entrada.substring(0, entrada.length() - sufijo.length());
        }
        if(idiomaJavalandia){
            entrada = entrada.trim();
            System.out.println(entrada);
        } else {
            System.out.println("No está escrito en el idioma de Javalandia.");
            
        }
    }
    
}
