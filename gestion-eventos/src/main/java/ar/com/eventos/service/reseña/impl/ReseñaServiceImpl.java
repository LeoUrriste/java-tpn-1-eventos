package ar.com.eventos.service.reseña.impl;

import ar.com.eventos.domain.Comedor;
import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.domain.Reseña;
import ar.com.eventos.service.comedor.ComedorService;
import ar.com.eventos.service.reseña.ResenaService;

import java.util.Scanner;
import java.util.UUID;

public class ReseñaServiceImpl implements ResenaService {

    private ComedorService comedorService;

    public ReseñaServiceImpl(ComedorService comedorService){
        this.comedorService = comedorService;
    }

    @Override
    public Reseña agregarResena(UUID idEvento, Long dniParticipante) {

        Scanner sc = new Scanner(System.in);
        EventoGastronomico eventoEncontrado;
        Reseña nuevaResena = new Reseña(idEvento, dniParticipante);

        for (EventoGastronomico eventoGastro : comedorService.getEventos()) {
            if (eventoGastro.getIdEvento().equals(idEvento)) {

                eventoEncontrado = eventoGastro;

                System.out.println("Ingrese la reseña:");
                String comentario = sc.nextLine();
                nuevaResena.setResena(comentario);

                System.out.println("Ingrese la calificación (un número entero entre 1 y 5):");
                Integer calificacion = sc.nextInt();
                nuevaResena.setCalificacion(calificacion);

                eventoEncontrado.getResenas().put(dniParticipante, nuevaResena);
                System.out.println("Reseña registrada");

                break;
            }
        }



        return nuevaResena;

    }
}
