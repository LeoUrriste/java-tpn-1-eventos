package ar.com.eventos.service.opciones.impl;

import ar.com.eventos.service.chef.ChefService;
import ar.com.eventos.service.comedor.ComedorService;
import ar.com.eventos.service.evento.EventoService;
import ar.com.eventos.service.opciones.OpcionesService;
import ar.com.eventos.service.participante.ParticipanteService;

import java.util.Scanner;

public class OpcionesServiceimpl implements OpcionesService {

    private EventoService eventoService;
    //private ComedorService comedorService;
    private ParticipanteService participanteService;
    private ChefService chefService;


    public OpcionesServiceimpl(EventoService eventoService, ComedorService comedorService, ParticipanteService participanteService, ChefService chefService) {
        this.eventoService = eventoService;
        //this.comedorService = comedorService;
        this.participanteService = participanteService;
        this.chefService = chefService;
    }


    @Override
    public void mostrarOpciones(Scanner sc) {
        int opcion = 0;

        do {
            System.out.println("Ingrese opcion: \n");
            System.out.println("1. Crear evento");
            System.out.println("2. Registar participante");
            System.out.println("3. Registrar Chef");
            System.out.println("4. Reseñas de eventos");
            System.out.println("5. Dejar reseña de un evento");
            System.out.println("6. Listar eventos");
            System.out.println("7. salir");


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    eventoService.crearEvento();
                    break;
                case 2:
                    participanteService.registarParticipante();
                    break;
                case 3:
                    chefService.registrarChef();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    eventoService.listarEventos();
                    break;
                case 7:

                    break;
                default:
                    break;
            }


        }while (opcion != 7);

        System.out.println("\n Finalizo aplicacion");

        sc.close();

        //creacion de eventos

        //incripcion de participantes

        //gestion de chef

        //reseñas de eventos

        //listar eventos en base a una fecha

        //

    }
}

