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
    Scanner ingresar = new Scanner ( System.in ) ;
    int op ;
    do {
    System.out.println ( "1.ingresar un documentos" ) ;
    System.out.println ( "2.mostrar lista de documentos" ) ;
    System.out.println ( "3.borrar un documentos" ) ;
    System.out.println ( "4.finalizar\n" ) ;
    System.out.print ( "Ingrese una opcion de 1 a 4 :" ) ;
    op= ingresar.nextInt ( ) ;
    switch ( op ) {
        case 1 :
        introduceunnombre ( ) ;
    break ;
    case 2 :
        mostrarfila ( );
    break ;
    case 3 :
        eliminacion ( ) ;    
    break ; 
    case 4 :
    }
    }while ( op != 4 ) ;
}
public void introduceunnombre ( ) {
    Scanner sc = new Scanner ( System.in ) ;
    archivos I = new archivos();
    System.out.print ( "\nnombre del archivo: " ) ;
    I.nombre = sc.nextLine ( );
    System.out.print ( "\nnumero de paginas: " ) ;
    I.pagina = sc.nextInt ( );    
    listado1.add ( I.nombre ) ;
    listado2.add ( I.pagina ) ;
    Timer t =new Timer ();  
    TimerTask tk = new TimerTask(){
    @Override 
    public void run() { 
    if (listado2!=null){
    int i=0;
    i++;
    System.out.println("\n\nse ha imprimio el documento");
    System.out.print ( "\nDocumento 1 impreso:  " ) ;
    System.out.println ( I.nombre ) ;
    System.out.print ( "\nPaginas impresas: " ) ;
    System.out.println ( I.pagina ) ;                
    t.cancel();
    }
    else{
    t.cancel();
    }
    }
    };
    t.schedule(tk, 15000,I.pagina*2000); 
    listado1.peek();
    listado1.remove();
    listado2.peek();
    listado2.remove();
    }
    public void mostrarfila ( ) {
    archivos m = new archivos();
    Scanner sc = new Scanner ( System.in );
    int indice ;
    System.out.print ( "\nDocumento a mostrar: " ) ;
    m.nombre = sc.nextLine ( );
    System.out.print ( "\n¿numero de paginas del documento? " ) ;
    m.pagina = sc.nextInt ( );
    indice = listado1.indexOf ( m.nombre ) ;
    indice = listado2.indexOf ( m.pagina ) ;
    if ( indice != -1){
    System.out.print ( "\nDocumento a impreso: " ) ;
    System.out.println ( m.nombre ) ;
    System.out.print ( "\nPaginas a impresas: " ) ;
    System.out.println ( m.pagina ) ;
    } else {
    System.out.print ( "\nDocumento no se encuentra " ) ;
    }
    }
    public void eliminacion ( ) {
    archivos e = new archivos();
    Scanner sc = new Scanner ( System.in ) ;
    int indice ;
    System.out.print ( "\nDocumento a eliminar: " ) ;
    e.nombre = sc.nextLine ( );
   indice = listado1.indexOf ( e.nombre ) ;
    if ( indice != -1){
       listado1.remove ( indice );
        System.out.print ( "\nDocumento eliminado" ) ;
    } else {
        System.out.print ( "\nDocumento no se encuentra " ) ;
    }
    }
}