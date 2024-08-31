package ar.com.eventos.service.evento;

import ar.com.eventos.domain.Chef;
import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.domain.Reseña;

import java.time.LocalDateTime;
import java.util.UUID;

public interface EventoService {



    EventoGastronomico crearEvento();

    void listarEventos();

    void inscribirParticipanteAlEvento(UUID idEvento, Long dniParticipante);

    void asignarCheftAEvento(UUID idEvento, String nombre);

    void listarEventoPorFecha(LocalDateTime fecha);









}
