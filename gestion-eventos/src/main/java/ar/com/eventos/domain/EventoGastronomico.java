package ar.com.eventos.domain;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EventoGastronomico {
    private UUID id;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaYHora;
    private String ubicacion;
    //capacidad
    private Map<Long,Participante> participantes = new HashMap();



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Map<Long, Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Map<Long, Participante> participantes) {
        this.participantes = participantes;
    }
}
