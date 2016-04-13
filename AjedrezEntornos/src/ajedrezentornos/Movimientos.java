
package ajedrezentornos;

public class Movimientos {
    
    int fila;
    int columna;
/*Para realizar todos ls metodos utilizaremos las variables fila y columna. Estos seis metodos tendran todos una estructura muy sencilla basada en fors, salvo 
    la del peon que constara de un if ya que solo puede relizar un movimiento, y siempre es el mismo.En cuanto a los otros 5 movimientos como hemos mencionado antes
    usaremos bucles for, se hace un for por cada una de las opciones que nos presenta el movimieto, por ejemplo la torre solo tiene cuatro opciones ir hacia arriba, hacia
    abajo, o izquierda o derecha. En estos for se les indicaria el valor de las variables fila columna, que son iguales a las variables que les pasamos al metodo, al cual tambien le pasamos
    el tablero con los varoles de cada posicion. Ademas en el for tambien nos encargaremos de limitar cada uno de las opciones para que el movimiento no se salga del tablero
    tambien comprobamos si la posicio a la que el movimiento nos permite ir esta ocupada o no, para asi no mostrarla, y vamos incrementando los valores de fila, columna o
    ambas en caso de que sea necesario.*/
    
    public void MoviPeon(int[][] tablero, int x, int y){
        fila=x;
        columna=y;
        if(fila!=7 && tablero[fila+1][columna]==0){
            System.out.println(fila+1+"," +columna);
        }
    }
    
    public void MoviTorre(int[][] tablero, int x, int y){
      
        for(fila=x, columna=y; fila<=6 && tablero[fila+1][columna]==0;fila++){
               System.out.println(fila+1+","+ (columna)); 
       }
        for(fila=x, columna=y;fila>=1 && fila<=6 && tablero[fila-1][columna]==0;fila--){
               System.out.println(fila-1+","+ columna); 
       }
        for(fila=x, columna=y;columna<=6 && tablero[fila][columna+1]==0;columna++){
               System.out.println(fila+","+ (columna+1)); 
       }
        for(fila=x, columna=y;columna>=1 && columna<=6 && tablero[fila][columna-1]==0;columna--){
               System.out.println(fila+","+(columna-1)); 
       }
    }
    
    public void MoviAlfil(int[][] tablero, int x, int y){
        for(fila=x, columna=y; columna<=6 && fila<=6 && tablero[fila+1][columna+1]==0; fila++,columna++){
           System.out.println((fila+1)+","+ (columna+1));
        }
        for(fila=x, columna=y; columna>=1 && columna<=6 && fila<=6 && tablero[fila+1][columna-1]==0; fila++,columna--){
           System.out.println((fila+1)+","+ (columna-1));
        }
        for(fila=x, columna=y; columna>=1 && fila>=1 && columna<=6 && fila<=6 && tablero[fila-1][columna-1]==0; fila--,columna--){
           System.out.println((fila-1)+","+ (columna-1));
        }
        for(fila=x, columna=y; fila>=1 && columna<=6 && fila<=6 && tablero[fila-1][columna+1]==0; fila--,columna++){
           System.out.println((fila-1)+","+ (columna+1));
        }
    }
    
    public void MoviReina(int[][] tablero, int x, int y){
        for(fila=x, columna=y; fila<=6 && tablero[fila+1][columna]==0;fila++){
               System.out.println((fila+1)+","+ columna); 
        }
        for(fila=x, columna=y;fila>=1 && fila<=6 && tablero[fila-1][columna]==0;fila--){
               System.out.println((fila-1)+","+ columna); 
        }
        for(fila=x, columna=y;columna<=6 && tablero[fila][columna+1]==0;columna++){
               System.out.println(fila+","+ (columna+1)); 
        }
        for(fila=x, columna=y;columna>=1 && columna<=6 && tablero[fila][columna-1]==0;columna--){
               System.out.println(fila+","+(columna-1)); 
        }
        for(fila=x, columna=y; columna<=6 && fila<=6 && tablero[fila+1][columna+1]==0; fila++,columna++){
           System.out.println((fila+1)+","+ (columna+1));
        }
        for(fila=x, columna=y; columna>=1 && columna<=6 && fila<=6 && tablero[fila+1][columna-1]==0; fila++,columna--){
           System.out.println((fila+1)+","+ (columna-1));
        }
        for(fila=x, columna=y; columna>=1 && fila>=1 && columna<=6 && fila<=6 && tablero[fila-1][columna-1]==0; fila--,columna--){
           System.out.println((fila-1)+","+ (columna-1));
        }
        for(fila=x, columna=y; fila>=1 && columna<=6 && fila<=6 && tablero[fila-1][columna+1]==0; fila--,columna++){
           System.out.println((fila-1)+","+ (columna+1));
        }
    }
    
    public void MoviRey(int[][] tablero, int x, int y){
        fila=x;
        columna=y;
        if(fila<=6 && tablero[fila+1][columna]==0){
           System.out.println((fila+1)+","+columna);
        }
        if(fila>=1 && fila<=6 && tablero[fila-1][columna]==0){
           System.out.println((fila-1)+","+ columna);
        }
        if(columna<=6 && tablero[fila][columna+1]==0){
            System.out.println(fila+","+ (columna+1));
        }
        if(columna>=1 && columna<=6 && tablero[fila][columna-1]==0){
            System.out.println(fila+","+(columna-1)); 
        }
        if(columna<=6 && fila<=6 && tablero[fila+1][columna+1]==0){
            System.out.println((fila+1)+","+ (columna+1));
        }
        if(columna>=1 && columna<=6 && fila<=6 && tablero[fila+1][columna-1]==0){
            System.out.println((fila+1)+","+ (columna-1));
        }
        if(columna>=1 && fila>=1 && columna<=6 && fila<=6 && tablero[fila-1][columna-1]==0){
             System.out.println((fila-1)+","+ (columna-1));
        }
        if(fila>=1 && columna<=6 && fila<=6 && tablero[fila-1][columna+1]==0){
            System.out.println((fila-1)+","+ (columna+1));
        }
            
    }
    public void MoviCaballo(int[][] tablero, int x, int y){
        fila=x;
        columna=y;
        if(columna>=1 && fila>=1 && columna<=6 && fila<=6 && tablero[fila-2][columna-1]==0){
           System.out.println((fila-2)+","+(columna-1));
        }
        if( columna>=1 && fila<=6 && tablero[fila+2][columna-1]==0){
           System.out.println((fila+2)+","+ (columna-1));
        }
        if(columna<=6 && fila>=1 && tablero[fila-2][columna+1]==0){
            System.out.println((fila-2)+","+ (columna+1));
        }
        if(fila<=6 && columna<=6 && tablero[fila+2][columna+1]==0){
            System.out.println((fila+2)+","+(columna+1)); 
        }
        if(columna>=1 && fila>=1 && tablero[fila-1][columna-2]==0){
            System.out.println((fila-1)+","+ (columna-2));
        }
        if(columna>=1 && fila<=6 && tablero[fila+1][columna-2]==0){
            System.out.println((fila+1)+","+ (columna-2));
        }
        if(columna<=6 && fila<=6 && tablero[fila+1][columna+2]==0){
             System.out.println((fila+1)+","+ (columna+2));
        }
        if(fila>=1 && columna<=6 && tablero[fila-1][columna+2]==0){
            System.out.println((fila-1)+","+ (columna+2));
        }
    }

}
