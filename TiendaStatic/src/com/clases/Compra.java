package com.clases;

public class Compra implements Area {
	
	private static String nombreCliente;
	private static String producto;
	private static double precio;
	private static int cantidad;
	private static double descuento;
	private static double totalPagar;
	private static int area;
	
	public static String getNombreCliente() {
		return nombreCliente;
	}
	public static void setNombreCliente(String nombreCliente) {
		Compra.nombreCliente = nombreCliente;
	}
	public static String getProducto() {
		return producto;
	}
	public static void setProducto(String producto) {
		Compra.producto = producto;
	}
	public static double getPrecio() {
		return precio;
	}
	public static void setPrecio(double precio) {
		Compra.precio = precio;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public static void setCantidad(int cantidad) {
		Compra.cantidad = cantidad;
	}
	public static double getDescuento() {
		return descuento;
	}
	public static void setDescuento(double descuento) {
		Compra.descuento = descuento;
	}
	public static double getTotalPagar() {
		return totalPagar;
	}
	public static void setTotalPagar(double totalPagar) {
		Compra.totalPagar = totalPagar;
	}
	
	public static int getArea() {
		return area;
	}
	public static void setArea(int area) {
		Compra.area = area;
	}
	
	public double descuento(double p, double c,int ar)
	{
		setTotalPagar(p * c);
		
		
		if(getTotalPagar()>20  && ar==1 || ar==2 || ar==3 || ar==4 || ar==5)
		{
			setDescuento(getTotalPagar()*0.05);
		}

		
		if(getTotalPagar()>50 && ar==1 || ar==2 || ar==3)
		{
			setDescuento(0.07 *getTotalPagar());
		}



			
		return getDescuento();
	}
	
	public static double totalFinal()
	{
		double totalFinal;
		
		totalFinal = getTotalPagar()-getDescuento();
		
		return totalFinal;
	}
	
	

}
