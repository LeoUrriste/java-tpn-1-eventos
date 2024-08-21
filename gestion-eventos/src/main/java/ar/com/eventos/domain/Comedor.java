package ar.com.eventos.domain;

import java.util.ArrayList;
import java.util.List;

public class Comedor {
    private List<EventoGastronomico> eventos = new ArrayList();




    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }

    public List<EventoGastronomico> getEventos() {
        return eventos;
    }
}
