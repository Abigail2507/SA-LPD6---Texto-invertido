/* Instrucciones:

Crear un programa en Java que realice lo siguiente:
eduardo
odraude
Debe solicitar al usuario por consola una palabra o frase.
Debe mostrar por consola el texto escrito al revés.
Entrada: 
Salida: 
Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub y adjuntar el link. */

import java.util.Scanner;

public class palabrainvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String texto = scanner.nextLine();
        String textoInvertido = reverseText(texto);
        System.out.println("El texto invertido es: " + textoInvertido);
        
        scanner.close();
    }
    
    public static String reverseText(String texto) {
        StringBuilder textoInvertido = new StringBuilder();
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido.append(texto.charAt(i));
        }
        return textoInvertido.toString();
    }
}
