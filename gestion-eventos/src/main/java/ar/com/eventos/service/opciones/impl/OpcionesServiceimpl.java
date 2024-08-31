package ar.com.eventos.service.opciones.impl;

import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.service.archivos.ArchivoEventosService;
import ar.com.eventos.service.chef.ChefService;
import ar.com.eventos.service.comedor.ComedorService;
import ar.com.eventos.service.evento.EventoService;
import ar.com.eventos.service.opciones.OpcionesService;
import ar.com.eventos.service.participante.ParticipanteService;
import ar.com.eventos.service.reseña.ResenaService;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

public class OpcionesServiceimpl implements OpcionesService {

    private EventoService eventoService;
    private ComedorService comedorService;
    private ParticipanteService participanteService;
    private ChefService chefService;
    private ResenaService resenaService;
    private ArchivoEventosService archivoEventosService;

    public OpcionesServiceimpl(EventoService eventoService, ComedorService comedorService, ParticipanteService participanteService, ChefService chefService, ResenaService resenaService, ArchivoEventosService archivoEventosService) {
        this.eventoService = eventoService;
        this.comedorService = comedorService;
        this.participanteService = participanteService;
        this.chefService = chefService;
        this.resenaService = resenaService;
        this.archivoEventosService = archivoEventosService;
    }


    @Override
    public void mostrarOpciones(Scanner sc) {
        int opcion = 0;

        do {
            System.out.println("Ingrese opcion: \n");
            System.out.println("1. Crear evento");
            System.out.println("2. Registar participante");
            System.out.println("3. Registrar Chef");
            System.out.println("4. Inscribir participante al evento");
            System.out.println("5. Asignar Cheft a evento");
            System.out.println("6. Dejar reseña de un evento");
            System.out.println("7. Listar eventos");
            System.out.println("8. Listar eventos por fecha");
            System.out.println("9. Lista eventos completos");
            System.out.println("10. salir");


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
                    System.out.println("Ingresar ID del Evento");
                    String idEvento = sc.nextLine();
                    System.out.println("Ingresar dni del participante");
                    Long dniParticipante = sc.nextLong();
                    sc.nextLine();
                    try {
                        eventoService.inscribirParticipanteAlEvento(UUID.fromString(idEvento),dniParticipante);
                    }catch (NoSuchElementException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Ingresar ID del Evento");
                    idEvento = sc.nextLine();
                    System.out.println("Ingresar nombre del Cheft");
                    String nombre = sc.nextLine();
                    eventoService.asignarCheftAEvento(UUID.fromString(idEvento),nombre);
                    break;
                case 6:
                    System.out.println("Ingresar ID del Evento");
                    idEvento = sc.nextLine();
                    System.out.println("Ingresar dni del participante");
                    dniParticipante = sc.nextLong();
                    sc.nextLine();

                    resenaService.agregarResena(UUID.fromString(idEvento),dniParticipante);
                    break;
                case 7:
                    eventoService.listarEventos();
                    break;
                case 8:
                    //solicito fecha
                    System.out.println("Ingresar fecha a partir de cuando ver los eventos\n");
                    System.out.println("Ingresar año: xxxx");
                    int ano = sc.nextInt();
                    System.out.println("Ingresar mes: xx");
                    int mes = sc.nextInt();
                    System.out.println("Ingresar dia: xx");
                    int dia = sc.nextInt();
                    //solicito horario
                    System.out.println("Ingresar hora (0-23): ");
                    int hora = sc.nextInt();
                    System.out.println("Ingresar minutos: ");
                    int minutos = sc.nextInt();

                    LocalDate fecha1 = LocalDate.of(ano, mes, dia);
                    LocalTime horario = LocalTime.of(hora, minutos);

                    LocalDateTime fechaYHorario = LocalDateTime.of(fecha1, horario);

                    eventoService.listarEventoPorFecha(fechaYHorario);

                    break;
                case 9:
                    archivoEventosService.exportarEventosCsv();
                    break;

                case 10:
                    break;
                default:
                    break;
            }


        }while (opcion != 10);

        System.out.println("\n Finalizo aplicacion");

        sc.close();



    }
}

