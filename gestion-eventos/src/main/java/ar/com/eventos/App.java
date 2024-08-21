package ar.com.eventos;

import ar.com.eventos.service.opciones.OpcionesService;
import ar.com.eventos.service.opciones.impl.OpcionesServiceimpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        OpcionesService opcionesService = new OpcionesServiceimpl();

        opcionesService.mostrarOpciones();


    }
}
