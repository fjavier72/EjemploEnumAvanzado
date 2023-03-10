package com.cursoceat.controller;

import java.util.Locale;
import java.util.Scanner;

import com.cursoceat.model.Iva;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		int opcion;
		double precio = 0;
		
		do {
			System.out.println("** INDIQUE EL ARTÍCULO A PAGAR **");
			System.out.println("\t1. Aceite de oliva");  // 5%
			System.out.println("\t2. Leche");  // 10%
			System.out.println("\t3. Cerveza");
			System.out.println("\t4. Mascarillas Quirúrgicas");
			System.out.println("\t5. Queso");
			System.out.println("\t6. Salir");
			System.out.print("INDIQUE SU OPCIÓN: ");
			opcion = input.nextInt();
			if (opcion != 6) {
				System.out.print("INDIQUE EL PRECIO: ");  // Leemos con código de barras
				precio = input.nextDouble();
			}
			switch (opcion) {
			case 1 -> {
				Iva impuesto = Iva.OTROS;
				calcularTotal(precio, impuesto.getPorcentaje());
			}
			case 2 -> {
				Iva impuesto = Iva.ALIMENTACION;
				calcularTotal(precio, impuesto.getPorcentaje());
			}
			case 3 -> {
				Iva impuesto = Iva.NORMAL;
				calcularTotal(precio, impuesto.getPorcentaje());
			}
			case 4 -> {
				Iva impuesto = Iva.MEDICINAS;
				calcularTotal(precio, impuesto.getPorcentaje());
			}
			case 5 -> {
				Iva impuesto = Iva.EXENTO;
				calcularTotal(precio, impuesto.getPorcentaje());
			}
			case 6 -> System.out.println("Chao...chao...");
			default -> System.out.println("Error de entrada");
			}
		} while (opcion != 6);
		
		input.close();
	}
	
	static void calcularTotal(double precio, double porcentaje) {
		double iva = (porcentaje + 100) / 100;
		System.out.printf("El importe a pagar es %.2f\n", precio * iva);
		System.out.println();
	}

}
