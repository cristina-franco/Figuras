package com.test;

public class Test {

	public static void main(String[] args) {

        Circle circle = new Circle (3, "miCirculo");

        System.out.println(circle.toString());

        System.out.println("Mi circunferencia es: "+ circle.calculatePerimeter()+ " y el area es: " + circle.calculateArea());
        
        System.out.println("Fin del progama");
        
	}

}
