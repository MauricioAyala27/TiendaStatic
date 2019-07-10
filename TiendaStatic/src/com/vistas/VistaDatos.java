package com.vistas;

import java.util.Scanner;

import com.clases.Cliente;

public class VistaDatos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cliente c = new Cliente();
		
		try {
			
		System.out.println("::::::::::BIENVENIDO::::::::::");
		System.out.println("Digite el Nombre del Cliente: ");
		Cliente.setNombreCliente(sc.nextLine());
		System.out.println("Digite el Nombre del Producto: ");
		Cliente.setProducto(sc.nextLine());
		System.out.println("Digite el Precio del Producto: ");
		Cliente.setPrecio(Double.parseDouble(sc.nextLine()));
		System.out.println("Digite la Cantidad de Producto: ");
		Cliente.setCantidad(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite el numero del Area a la que pertenece el producto: "
							+ "\n1.Frutas"
							+ "\n2.Verduras"
							+ "\n3.Carnes"
							+ "\n4.Lacteos"
							+ "\n5.Granos basicos");
		Cliente.setArea(Integer.parseInt(sc.nextLine()));
		
		
		System.out.println("\nNombre del Cliente: " + Cliente.getNombreCliente() +
						   "\nNombre del Producto: " + Cliente.getProducto() +
						   "\nPrecio del Producto: " + Cliente.getPrecio() +
						   "\nCantidad del Producto: " + Cliente.getCantidad() +
						   "\nDescuento(Si aplicase): " + c.descuento(Cliente.getPrecio(),Cliente.getCantidad(),Cliente.getArea()) +
						   "\nTotal a Pagar: " + Cliente.totalFinal());
		sc.close();
		}
		catch(NumberFormatException e) {
			System.out.println("Solo se permiten numeros");
		}

	}

}
