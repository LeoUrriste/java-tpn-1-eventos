package ar.com.eventos.domain;

import java.util.ArrayList;
import java.util.List;

public class Comedor {
    private List<EventoGastronomico> eventos = new ArrayList();




    public List<EventoGastronomico> getEventos() {
        return eventos;
    }


    public void setEventos(List<EventoGastronomico> eventos) {

        this.eventos = eventos;
    }


}
