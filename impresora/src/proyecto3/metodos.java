/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author LUIS CARLOS SANCHEZ
 */
public class metodos {
    Impresora imp=new Impresora();
        public void eliminacion ( ) {
    archivos e = new archivos();
    Scanner sc = new Scanner ( System.in ) ;
    int indice ;
    System.out.print ( "\nDocumento a eliminar: " ) ;
    e.nombre = sc.nextLine ( );
   indice = imp.listado1.indexOf ( e.nombre ) ;
    if ( indice != -1){
       imp.listado1.remove ( indice );
        System.out.print ( "\nDocumento eliminado" ) ;
    } else {
        System.out.print ( "\nDocumento no se encuentra " ) ;
    }
    }
    public void mostrarfila ( ) {
    archivos m = new archivos();
    Scanner sc = new Scanner ( System.in );
    int indice ;
    System.out.print ( "\nDocumento a mostrar: " ) ;
    m.nombre = sc.nextLine ( );
    System.out.print ( "\n¿numero de paginas del documento? " ) ;
    m.pagina = sc.nextInt ( );
    indice = imp.listado1.indexOf ( m.nombre ) ;
    indice = imp.listado2.indexOf ( m.pagina ) ;
    if ( indice != -1){
    System.out.print ( "\nDocumento a impreso: " ) ;
    System.out.println ( m.nombre ) ;
    System.out.print ( "\nPaginas a impresas: " ) ;
    System.out.println ( m.pagina ) ;
    } else {
    System.out.print ( "\nDocumento no se encuentra " ) ;
    }
    }
public void introduceunnombre ( ) {
    Scanner sc = new Scanner ( System.in ) ;
    archivos I = new archivos();
    System.out.print ( "\nnombre del archivo: " ) ;
    I.nombre = sc.nextLine ( );
    System.out.print ( "\nnumero de paginas: " ) ;
    I.pagina = sc.nextInt ( );    
    imp.listado1.add ( I.nombre ) ;
    imp.listado2.add ( I.pagina ) ;
    Timer t =new Timer ();  
    TimerTask tk = new TimerTask(){
    @Override 
    public void run() { 
    if (imp.listado2!=null){
    int i=0;
    i++;
    System.out.println("\nse ha imprimio el documento");
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
    t.schedule(tk, 15000,I.pagina*5000); 
    imp.listado1.peek();
    imp.listado1.remove();
   imp. listado2.peek();
    imp.listado2.remove();
    }
}

