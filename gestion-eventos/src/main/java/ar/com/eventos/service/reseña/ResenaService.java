package ar.com.eventos.service.reseña;

import ar.com.eventos.domain.Reseña;

import java.util.UUID;

public interface ResenaService {

    Reseña agregarResena(UUID idEvento, Long dniParticipante);

}
