package ar.com.eventos.service.opciones.impl;

import ar.com.eventos.service.comedor.ComedorService;
import ar.com.eventos.service.evento.EventoService;
import ar.com.eventos.service.opciones.OpcionesService;

import java.util.Scanner;

public class OpcionesServiceimpl implements OpcionesService {

    private EventoService eventoService;
    private ComedorService comedorService;


    public OpcionesServiceimpl(EventoService eventoService, ComedorService comedorService) {
        this.eventoService = eventoService;
        this.comedorService = comedorService;
    }


    @Override
    public void mostrarOpciones(Scanner sc) {
        int opcion = 0;

        do {
            System.out.println("Ingrese opcion: \n");
            System.out.println("1. Crear evento");
            System.out.println("2. Inscripcion de participante");
            System.out.println("3. Gestion de Chef");
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

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

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

