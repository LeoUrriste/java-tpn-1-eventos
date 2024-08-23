package ar.com.eventos.service.participante.impl;

import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.domain.Participante;
import ar.com.eventos.enumeration.InteresCulinarioEnum;
import ar.com.eventos.service.participante.ParticipanteService;

import java.util.Scanner;
import java.util.UUID;

public class ParticipanteServiceImpl implements ParticipanteService {

    @Override
    public Participante registarParticipante() {
        Participante participanteNuevo = new Participante();
        Scanner sc = new Scanner(System.in);

        participanteNuevo.setIdParticipante( UUID.randomUUID() );


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

        return participanteNuevo;

    }
}
