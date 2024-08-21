package ar.com.eventos.service.comedor.impl;

import ar.com.eventos.domain.Comedor;
import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.service.comedor.ComedorService;

import java.util.List;

public class ComedorServiceImpl implements ComedorService {

    Comedor comedor;

    public ComedorServiceImpl() {
        this.comedor = comedor;
    }

    @Override
    public List<EventoGastronomico> getEventos() {
        return this.comedor.getEventos();
    }
}
