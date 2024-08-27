package ar.com.eventos.domain;

import ar.com.eventos.enumeration.InteresCulinarioEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Participante extends EventoGastronomico {
    private Long dniParticipante;
    private String nombre;
    private String apellido;
    private InteresCulinarioEnum interesCulinario;
    private List<EventoGastronomico> eventos = new ArrayList();




    public Long getDniParticipante() {
        return dniParticipante;
    }

    public void setDniParticipante(Long dniParticipante) {
        this.dniParticipante = dniParticipante;
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

    public InteresCulinarioEnum getInteresCulinario() {
        return interesCulinario;
    }

    public void setInteresCulinario(InteresCulinarioEnum interesCulinario) {
        this.interesCulinario = interesCulinario;
    }

    public List<EventoGastronomico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }
}
