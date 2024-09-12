package ar.com.eventos.service.reseña.impl;

import ar.com.eventos.domain.Comedor;
import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.domain.Reseña;
import ar.com.eventos.service.reseña.ResenaService;

import java.util.Scanner;
import java.util.UUID;

public class ReseñaServiceImpl implements ResenaService {


    @Override
    public Reseña agregarResena(UUID idEvento, Long dniParticipante) {
        Comedor comedor = new Comedor();
        EventoGastronomico eventoGastronomico = new EventoGastronomico();
        Scanner sc = new Scanner(System.in);
        boolean existeEvento = Boolean.FALSE;

        Reseña nuevaResena = new Reseña(idEvento, dniParticipante);

        for (EventoGastronomico eventoGastronomico1 : comedor.getEventos()) {
            if (eventoGastronomico.getIdEvento().equals(idEvento)) {
                existeEvento = Boolean.TRUE;
            }break;

        }
        System.out.println("Ingrese la reseña:");
        String comentario = sc.nextLine();
        nuevaResena.setResena(comentario);
        System.out.println("Ingrese la calificación (un número entero entre 1 y 5):");
        Integer calificacion = sc.nextInt();
        nuevaResena.setCalificacion(calificacion);

        eventoGastronomico.getResenas().put(dniParticipante,nuevaResena);
        System.out.println("Reseña registrada");
        return nuevaResena;
    }
}
