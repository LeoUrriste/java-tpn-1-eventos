package ar.com.eventos;

import ar.com.eventos.service.comedor.ComedorService;
import ar.com.eventos.service.comedor.impl.ComedorServiceImpl;
import ar.com.eventos.service.evento.EventoService;
import ar.com.eventos.service.evento.impl.EventoServiceImpl;
import ar.com.eventos.service.opciones.OpcionesService;
import ar.com.eventos.service.opciones.impl.OpcionesServiceimpl;
import ar.com.eventos.service.participante.ParticipanteService;
import ar.com.eventos.service.participante.impl.ParticipanteServiceImpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        EventoService eventoService = new EventoServiceImpl();
        ComedorService comedorService = new ComedorServiceImpl();
        ParticipanteService participanteService = new ParticipanteServiceImpl();

        OpcionesService opcionesService = new OpcionesServiceimpl(eventoService, comedorService, participanteService);
        Scanner sc = new Scanner(System.in);

        opcionesService.mostrarOpciones(sc);


        sc.close();

    }
}
