package ar.com.eventos.service.evento;

import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.domain.Reseña;

import java.util.UUID;

public interface EventoService {



    EventoGastronomico crearEvento();

    void listarEventos();

    void inscribirParticipanteAlEvento(UUID idEvento, Long dniParticipante);


   // Reseña agregarResena(UUID idEvento, Long dniParticipante);






}
