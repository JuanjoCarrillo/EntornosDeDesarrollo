

import java.util.Scanner;

public class Practica2 {
	public static void main(String[] args) {
        Scanner s;

        s = new Scanner(System.in);

        double numero, acumulador = 1, contador = 1;

        System.out.print("Introduce un numero: ");
        numero = s.nextInt();

        while (numero < 0) {
             System.out.print("Numero no valido: ");
             numero = s.nextInt();
        }
        for (; contador <= numero; contador++) {
             acumulador = acumulador * contador;
        }
        System.out.println(acumulador);
   }
}
