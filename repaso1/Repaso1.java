
package repaso1;
//prueba de modificacion

import java.util.*;
public class Repaso1 {
    
    
    public static void main(String[] args) {
        int a=0;
        int cincos=0;
        int contador=0;
        int acumulador=0;
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.print("Introduzca un numero: ");
            a=sc.nextInt(); 
            if (a==5){
                cincos++;
                }
            contador++;
            acumulador=acumulador + a;
        }while(cincos<2); 
        
        System.out.println("El programa ha finalizado por que has introducido 2 veces el numero 5");
       
        System.out.println("La media arizmetica de la suma de los numeros introduciods es: "+ acumulador/contador);
            
        }
        
    }
    
