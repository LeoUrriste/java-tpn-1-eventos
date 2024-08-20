package ar.com.eventos.domain;

import ar.com.eventos.enumeration.InteresCulinarioEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Participante {
    private UUID idParticipante;
    private String nombre;
    private String apellido;
    private InteresCulinarioEnum interesculinario;
    private List<EventoGastronomico> eventos = new ArrayList();


    public UUID getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(UUID idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public InteresCulinarioEnum getInteresculinario() {
        return interesculinario;
    }

    public void setInteresculinario(InteresCulinarioEnum interesculinario) {
        this.interesculinario = interesculinario;
    }

    public List<EventoGastronomico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }
}
