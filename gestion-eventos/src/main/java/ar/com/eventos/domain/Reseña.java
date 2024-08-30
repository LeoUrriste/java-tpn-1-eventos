package ar.com.eventos.domain;

import java.util.*;

public class Reseña {
    private UUID idResena;
    private String resena;
    private Integer calificacion;
    private List<Participante> participantes = new ArrayList<>();
    private List<EventoGastronomico> eventos = new ArrayList<>();
    private Map<Long, Reseña> resenas = new HashMap<>();

        public Reseña(UUID idEvento, Long dniParticipante) {
    }


    public UUID getIdResena() {
        return idResena;
    }

    public void setIdResena(UUID idResena) {
        this.idResena = idResena;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public List<EventoGastronomico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }
}
