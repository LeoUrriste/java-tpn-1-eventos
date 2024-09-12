package ar.com.eventos.domain;

import ar.com.eventos.enumeration.EspecialidadEnum;

import java.util.ArrayList;
import java.util.List;


public class Chef {
    private Long dniChef;
    private String nombre;
    private EspecialidadEnum especialidad;
    private List<EventoGastronomico> eventos = new ArrayList();
    private List<Chef> chefts = new ArrayList<>();

    public Long getDniChef() {
        return dniChef;
    }

    public void setDniChef(Long dniChef) {
        this.dniChef = dniChef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EspecialidadEnum getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadEnum especialidad) {
        this.especialidad = especialidad;
    }

    public List<EventoGastronomico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }

    public List<Chef> getChefts() {
        return chefts;
    }

    public void setChefts(List<Chef> chefts) {
        this.chefts = chefts;
    }
}
