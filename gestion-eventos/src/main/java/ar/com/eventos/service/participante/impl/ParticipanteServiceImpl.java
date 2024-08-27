package ar.com.eventos.service.participante.impl;

import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.domain.Participante;
import ar.com.eventos.enumeration.InteresCulinarioEnum;
import ar.com.eventos.service.evento.impl.EventoServiceImpl;
import ar.com.eventos.service.participante.ParticipanteService;

import java.util.Scanner;


public class ParticipanteServiceImpl implements ParticipanteService {

    EventoGastronomico eventoGastronomico;
    Participante participantes;

    public ParticipanteServiceImpl(EventoGastronomico eventoGastronomico, Participante participantes) {
        this.eventoGastronomico = eventoGastronomico;
        this.participantes = participantes;
    }

    @Override
    public Participante registarParticipante() {
        Participante participanteNuevo = new Participante();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese DNI del participante");
        Long dni = sc.nextLong();
        participanteNuevo.setDniParticipante(dni);
        sc.nextLine();


        System.out.println("Ingrese nombre del participante: ");
        String nombreParticipante = sc.nextLine();
        sc.nextLine();
        participanteNuevo.setNombre(nombreParticipante);

        System.out.println("Ingresar apellido: ");
        String apellidoParticipante = sc.nextLine();
        sc.nextLine();
        participanteNuevo.setApellido(apellidoParticipante);

        System.out.println("Ingrese su interes culinario: ");
        System.out.println("1. Italiana");
        System.out.println("2. Mexicana");
        System.out.println("3. Vegana");
        int interes = sc.nextInt();
        sc.nextLine();

        participanteNuevo.setInteresCulinario(
                switch (interes){
                    case 1 -> InteresCulinarioEnum.ITALIANA;
                    case 2 -> InteresCulinarioEnum.MEXICANA;
                    case 3 -> InteresCulinarioEnum.VEGANA;
                    default -> null;
                }
        );
        eventoGastronomico.getParticipantes().put(dni,participanteNuevo);

        return participanteNuevo;


    }

}
