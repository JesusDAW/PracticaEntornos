
package ajedrezentornos;

import java.util.Scanner;
public class AjedrezEntornos {
    
    public static void main(String[] args) {
    
        int [][] tablero= new int [8][8];
        int i,k,s=0;//Estas variables tiene la funcion de contadores en el caso de la "i" para los 15 numero aleatorios y en los casos de "k" y "s" para facilitarnos salir de los bucles que permiten comprobar que los datos se introducidos son los adecuados.
        int a, b;//Son las variables que vamos usando para dar valor a los numeros aletaorios
        int x=0,y=0;//Son las variables que introducimos para crear el tablero y paga guardar los valores asignados por el usuario
        int ficha;//Esta variable guardara el nuemero de la ficha seleccionada por el usuario
        Movimientos posi= new Movimientos();
        Scanner ps= new Scanner(System.in);
        //Este for lo utilizaremos para dar valores 0 a todas las posiciones del tablero
            for(x=0;x<=7;x++){
                for (y=0;y<=7;y++){
                 tablero[x][y]=0;
                }
            }
        //En este for vamos a dar valor 1 a 15 posiciones aleatorias dentro del tablero, para ello usamos las variables "a" y "b", la variable y hara de contador para que solo se ocupen 15 posiciones            
            for (i =0;i<15;){
                a = (int) Math.floor (Math.random() * 8);
                b = (int) Math.floor (Math.random() * 8);
                if (tablero[a][b]!=1){
                    tablero[a][b]=1;
                    i++;
                }
            }
            /*Este tercer for sera donde se introduciran los datos de la posicion(pedidios por pantalla al usuario) y tambien se llevaran a cabo comprobaciones
            para ver si los datos introducidos se ajustan a los requisitos del programa.Dentro el for lo primero que encontramos es un "do while", en el cual se
            le pide al usuario que introduzca la posicion de la ficha, despues de esto nos encontramos un if y un else si los datos introducidos son correctos
            entrara en el if y posteriormente saldra del "do while", si no pasara al else y volvera a repetir el proceso hasta que los datos introducios sean correctos.
            Despues de esto nos encontramos un for que se encargara ir imprimiendo por pantalla y de analizar si la posicion introducida esta ocupada o no. Si no lo
            esta se imprimira este simbolo "@" en la posicion indicada y se sumara 1 a la variable k para que el programa nos muestre un mensaje y posteriorment salga del bucle
            for principal. En caso de que la posicion este ocupada nos imprimira el tablero mostrando que la posicion introducida esta ocupada y despues nos mostrara un mensaje
            y tendremos que volver a iniciar todo el proceso aqui comentado. La variable k tiene como unica funcion permitir en caso de que se cumplan todos los requisitos salir
            del bucle for principal.*/
            for(k=0;k<1;){
                do{
                    System.out.println("Introduzca la fila en la que se encuentra su ficha: ");
                    x=ps.nextInt();
                    System.out.println("Introduzca la columna en la que se encuentra su ficha: ");
                    y=ps.nextInt();

                    if(x>=0 && y>=0 && x<=7 && y<=7){
                        System.out.println("La posicion que a introducido es: "+"("+x+","+y+")");   
                    }

                    else{
                        System.out.println("Lo siento, los valores introducidos son ilegales, cambielos por favor");
                    }
                }while(x<0 || x>7 || y<0 || y>7);
                
                for (int xa=0;xa<=7;xa++){
                    for (int ya=0;ya<=7;ya++){   
                        if (xa==x && ya==y && tablero[xa][ya]==0 ){
                            System.out.print("@" + " ");
                            k++;
                            continue;
                        }      
                    System.out.print(tablero[xa][ya] + " ");  
                    }
                        System.out.println();
                    }
            
                if(k==1){
                    System.out.println("La posicion estaba vacia y su ficha a sido introducida correctamente");
                }
                else{
                    System.out.println("La posicion esta ocupada, tendra que introducir una nueva posicion"); 
                }
            }
            /*Ahora realizamos un menu simple para que el usuario vea los movimientos que puede llevar acabo su ficha*/
            Scanner ms= new Scanner(System.in);
            System.out.println("Seleccione el tipo de ficha que tiene: ");
            System.out.println("1. Peon.");
            System.out.println("2. Torre.");
            System.out.println("3. Alfil.");
            System.out.println("4. Caballo.");
            System.out.println("5. Reina.");
            System.out.println("6. Rey.");
            /*Una vez mostrado el menu entramos en este bucle "do while" donde le pediremos al usuario que introduzca el numero del movimiento que desea realizar.
            Si el numero introducido se encuenta entre el 1 y el 6 estos incluidos, entraremos en un if que contendra un switch que se encargara de llamar al metodo adecuado
            dependeiendo del movimiento introducido y imprimir los resultados, ademas se le sumara 1 a la variable ese que como en el caso de la variable k anterior su unica 
            funcion es la de permitir salir del bucle principal en este caso el "do while". Si no entramos en el if pasaremos al else lo que quiere decir que el numero introducido 
            no cumple los requisitos y se nos obligara a introducir el numero del movimiento.*/
            do{
                System.out.println("Introduzca el numero de la ficha seleccionada: ");
                ficha=ms.nextInt();
                if(ficha>0 && ficha<7){
                    switch(ficha){
                        case 1: System.out.println("Los movimientos que puedes realizar con el peon son: ");
                                posi.MoviPeon(tablero, x, y);s++;break;
                        case 2: System.out.println("Los movimientos que puedes realizar con el torre son: ");
                                posi.MoviTorre(tablero, x, y);s++;break;
                        case 3: System.out.println("Los movimientos que puedes realizar con el alfil son: ");
                                posi.MoviAlfil(tablero, x, y);s++;break;
                        case 4: System.out.println("Los movimientos que puedes realizar con el caballo son: ");
                                posi.MoviCaballo(tablero, x, y);s++;break;
                        case 5: System.out.println("Los movimientos que puedes realizar con el reina son: ");
                                posi.MoviReina(tablero, x, y);s++;break;
                        case 6: System.out.println("Los movimientos que puedes realizar con el rey son: ");
                                posi.MoviRey(tablero, x, y);s++;break;
                    }
                }
                else{
                    System.out.println("El numero introducido no corresponde a ninguna ficha, por favor seleccione uno de los numeros indicados en el menu");
                }
            }while(s!=1);
            /*for (int xa=0;xa<=7;xa++){
                for (int ya=0;ya<=7;ya++){
                    if (xa==x && ya==y && tablero[xa][ya]==0 ){
                        System.out.print("*" + " ");
                        continue;
                    }
                    
                    
                      System.out.print(tablero[xa][ya] + " ");  
                    
                    
                }
                System.out.println();
            }
            
            System.out.print("tablero en la posicion x - y es "+tablero[x][y]);*/
            
            
    }
    
}
