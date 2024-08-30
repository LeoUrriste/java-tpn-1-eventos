package ar.com.eventos.service.evento.impl;

import ar.com.eventos.domain.Chef;
import ar.com.eventos.domain.Comedor;
import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.domain.Participante;
import ar.com.eventos.service.evento.EventoService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.UUID;

public class EventoServiceImpl implements EventoService {


    Comedor comedor;

    public EventoServiceImpl(Comedor comedor) {
        this.comedor = comedor;

    }


    @Override
    public EventoGastronomico crearEvento() {
        EventoGastronomico nuevoEvento = new EventoGastronomico();
        Scanner sc = new Scanner(System.in);

        nuevoEvento.setIdEvento(UUID.randomUUID());


        System.out.println("Ingresar nombre del evento:");
        String nombreEvento = sc.nextLine();
        sc.nextLine();
        nuevoEvento.setNombre(nombreEvento);


        System.out.println("Ingresar descripcion del evento:");
        String descripcionEvento = sc.nextLine();
        sc.nextLine();
        nuevoEvento.setDescripcion(descripcionEvento);


        //solicito fecha
        System.out.println("Ingresar fecha y hora del evento:\n");
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

        //creamos objetos fecha y horario
        LocalDate fecha = LocalDate.of(ano, mes, dia);
        LocalTime horario = LocalTime.of(hora, minutos);

        //combino fecha y horario
        LocalDateTime fechaYHorario = LocalDateTime.of(fecha, horario);
        System.out.println("Ingreso: " + fecha + " " + horario);
        sc.nextLine();
        nuevoEvento.setFechaYHora(fechaYHorario);


        System.out.println("Ingresar ubicacion: ");
        String ubicacionEvento = sc.nextLine();
        sc.nextLine();
        nuevoEvento.setUbicacion(ubicacionEvento);


        System.out.println("Evento creado");
        comedor.getEventos().add(nuevoEvento);
        return nuevoEvento;

    }

    @Override
    public void listarEventos() {
        System.out.println("Lista de eventos");
        for (EventoGastronomico eventoGastronomico : this.comedor.getEventos()) {
            System.out.println(eventoGastronomico.toString());
        }

    }


    @Override
    public void inscribirParticipanteAlEvento(UUID idEvento, Long dniParticipante) {
        Participante participante = new Participante();
        boolean existeEvento = Boolean.FALSE;

        for (EventoGastronomico evento : comedor.getEventos()) {
            if (evento.getIdEvento().equals(idEvento)) {
                participante.getEventos().add(participante);
                evento.getParticipantes().put(participante.getDniParticipante(), participante);
                existeEvento = Boolean.TRUE;
                System.out.println("Participante inscripto");
                break;
            }
        }
    }


    @Override
    public void asignarCheftAEvento(UUID idEvento, String nombre) {
        Chef chef = new Chef();
        EventoGastronomico evento = new EventoGastronomico();

        if (evento == null) {
            System.out.println("Evento no encontrado.");

            if (chef == null) {
                System.out.println("Chef no encontrado.");


                evento.getChefts().add(chef);

            }
        }System.out.println("Chef asignado");
    }
}