package ar.com.eventos.service.evento;

import ar.com.eventos.domain.EventoGastronomico;

import java.time.LocalDateTime;
import java.util.UUID;

public interface EventoService {



    EventoGastronomico crearEvento();

    void listarEventos();

    void inscribirParticipanteAlEvento(UUID idEvento, Long dniParticipante);

    void asignarCheftAEvento(UUID idEvento, Long dniChef);

    void listarEventoPorFecha(LocalDateTime fecha);









}
