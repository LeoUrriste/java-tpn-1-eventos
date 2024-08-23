package ar.com.eventos.domain;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EventoGastronomico {
    private UUID idEvento;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaYHora;
    private String ubicacion;
    //capacidad
    private Map<Long,Participante> participantes = new HashMap();



    public UUID getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(UUID idEvento) {
        this.idEvento = idEvento;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("Id: ")
                .append(this.getIdEvento()).append("\n")
                .append("Nombre: ")
                .append(this.getNombre()).append("\n")
                .append("Descripcion: ")
                .append(this.getDescripcion()).append("\n")
                .append("Fecha: ")
                .append(this.getFechaYHora()).append("\n")
                .append("Ubicacion: ")
                .append(this.getUbicacion()).append("\n")
                .append("------------------------------------\n")
                .toString();
    }
}
