
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {


    public static void main(String[] args) {
        
        int A;       
        
        A = 21;		//no usamos <- como en hacíamos en pseint
        System.out.println(A);
        
        int B = 5; // otra manera de declarar
        System.out.println(B);
        
        String mensaje ="Hola mundo"; //para declarar una variable de cadena
        System.out.println(mensaje);
        
        int edad = 25;

        boolean esMayorDeEdad;
        esMayorDeEdad=false;    //hay que asignarle un valor para inicializar la variable boolean
        if (edad >= 18) {
	esMayorDeEdad = true;
        }
        else {	
        }               
        System.out.println(esMayorDeEdad);
        
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
        }
        int x = 0;
        while (x < 4) {
        System.out.println("Codo a codo");
        x++;	 //representa a x = x + 1 que también es una sintaxis válida
        }
        int y = 3;
        do {
        System.out.println("Estamos en un repetir");
        y--; //y= y -1 
        } while(y >0);
        
        String dia = "martes"; 

        switch (dia) {
	case "lunes":
	System.out.println("Hoy es lunes");
	break;	//luego de cada caso a evaluar se usar la palabra break; para indicar que se terminó
	case "martes":
	System.out.println("Hoy es martes");
	break;	
        } 
        
        int numero;
        Scanner teclado = new Scanner(System.in); //Creación de un objeto Scanner
        System.out.println("Ingrese número:");
        numero= teclado.nextInt(); 
        //System.out.print("El número ingresado es: "); 
        System.out.println("El número ingresado es: "+numero); 
        
        
    }
    
}
