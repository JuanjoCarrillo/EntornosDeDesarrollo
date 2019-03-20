package Practica2;

import java.util.Scanner;

public class Practica2 {
	public int MultiplicacionNum() {
        Scanner s;

        s = new Scanner(System.in);

        int numero, acumulador = 1, contador = 1;

        System.out.print("Introduce un numero: ");
        numero = s.nextInt();

        while (numero < 0) {
             System.out.print("Numero no valido: ");
             numero = s.nextInt();
        }
        for (; contador <= numero; contador++) {
             acumulador = acumulador * contador;
        }
        return acumulador;
   }
	public int suma(int suma) {
		return suma;
	}
}
