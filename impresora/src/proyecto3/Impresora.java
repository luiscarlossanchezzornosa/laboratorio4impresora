package proyecto3;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Impresora {
  LinkedList < String > listado1  = new LinkedList < String > ( );
  LinkedList < Integer > listado2 = new LinkedList < Integer > ( ); 
public static void main ( String [ ] args ) {
   Impresora fila = new Impresora ( ) ;
   fila.listado1 = new LinkedList ( ) ;
   fila.listado2 = new LinkedList ( ) ;
   fila.menu ( ) ;
}
public void menu ( ) {
    metodos mt=new metodos();
    Scanner ingresar = new Scanner ( System.in ) ;
    int op ;
    do {
    System.out.println ( "\n1.ingresar un documentos" ) ;
    System.out.println ( "\n2.mostrar lista de documentos" ) ;
    System.out.println ( "\n3.borrar un documentos" ) ;
    System.out.println ( "\n4.finalizar\n" ) ;
    System.out.print ( "Ingrese una opcion de 1 a 4 :" ) ;
    op= ingresar.nextInt ( ) ;
    switch ( op ) {
        case 1 :
        mt.introduceunnombre ( ) ;
    break ;
    case 2 :
        mt.mostrarfila ( );
    break ;
    case 3 :
        mt.eliminacion ( ) ;    
    break ; 
    case 4 :
    }
    }while ( op != 4 ) ;
}
}