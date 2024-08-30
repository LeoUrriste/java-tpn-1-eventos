package ar.com.eventos.service.reseña.impl;

import ar.com.eventos.domain.Reseña;
import ar.com.eventos.service.reseña.ResenaService;

import java.util.Scanner;
import java.util.UUID;

public class ReseñaServiceImpl implements ResenaService {


    @Override
    public Reseña agregarResena(UUID idEvento, Long dniParticipante) {

        Scanner sc = new Scanner(System.in);
        String resena = null;
        Reseña nuevaResena = new Reseña(idEvento,dniParticipante);

        System.out.println("Ingrese la reseña:");
        String comentario = sc.nextLine();
        nuevaResena.setResena(comentario);

        System.out.println("Ingrese la calificación (un número entero entre 1 y 5):");
        Integer calificacion = sc.nextInt();
        nuevaResena.setCalificacion(calificacion);

        System.out.println("Reseña registrada");

        return nuevaResena;
    }
}
