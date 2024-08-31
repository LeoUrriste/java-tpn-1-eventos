package ar.com.eventos.service.archivos.impl;

import ar.com.eventos.domain.EventoGastronomico;
import ar.com.eventos.service.archivos.ArchivoEventosService;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArcrivoEventosServiceImpl implements ArchivoEventosService {

    private final String UBICACION_ARCHIVO = "\\src\\main\\java\\ar\\com\\eventos\\recursos\\";

    CSVWriter csvWriter;

    @Override
    public void exportarEventosCsv() {
        List<EventoGastronomico> eventoGastronomicos = new ArrayList<>();
        List<EventoGastronomico> eventosFiltrados = eventoGastronomicos.stream()
                .filter(evento -> evento.getParticipantes().size() == 20)
                .collect(Collectors.toList());

        String ruta = System.getProperty("user.dir").concat(UBICACION_ARCHIVO).concat("lista-eventos-completos.csv");

        try {
            this.csvWriter = new CSVWriter(new FileWriter(ruta));
            //encabezado
            String[] encabezado = {"ID","NOMBRE","DESCRIPCION","FECHA Y HORA","UBICACION"};
            this.csvWriter.writeNext(encabezado);

            for (EventoGastronomico eventoGastronomico : eventosFiltrados){
                String[] datos = {
                        eventoGastronomico.getIdEvento().toString(),
                        eventoGastronomico.getNombre(),
                        eventoGastronomico.getDescripcion(),
                        eventoGastronomico.getFechaYHora().toString(),
                        eventoGastronomico.getUbicacion()
                };
                this.csvWriter.writeNext(datos);
            }
            System.out.println("Exportacion exitosa");

        }catch (IOException e){
            System.out.println("Algo salio mal");
        }finally {
            try {
                if (this.csvWriter != null){
                    this.csvWriter.close();
                }
            }catch (IOException e){
                System.out.println("Error al cerrar archivo");
            }
        }
    }
}
