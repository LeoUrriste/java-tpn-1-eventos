package ar.com.eventos;

import ar.com.eventos.domain.Comedor;
import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.domain.Participante;
import ar.com.eventos.service.chef.ChefService;
import ar.com.eventos.service.chef.impl.ChefServiceImpl;
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

        Comedor comedor = new Comedor();
        Participante participante = new Participante();
        EventoGastronomico eventoGastronomico = new EventoGastronomico();
        ComedorService comedorService = new ComedorServiceImpl();
        EventoService eventoService = new EventoServiceImpl(comedor) ;
        ParticipanteService participanteService = new ParticipanteServiceImpl(eventoGastronomico,participante);
        ChefService chefService = new ChefServiceImpl();


        OpcionesService opcionesService = new OpcionesServiceimpl(eventoService, comedorService, participanteService, chefService);
        Scanner sc = new Scanner(System.in);

        opcionesService.mostrarOpciones(sc);


        sc.close();

    }
}
