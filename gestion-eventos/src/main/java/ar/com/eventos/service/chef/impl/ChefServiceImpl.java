package ar.com.eventos.service.chef.impl;

import ar.com.eventos.domain.Chef;
import ar.com.eventos.service.chef.ChefService;

import java.util.Scanner;
import java.util.UUID;

public class ChefServiceImpl implements ChefService {

    Chef nuevoChef = new Chef();

    @Override
    public Chef registrarChef() {
        Chef nuevoChef = new Chef();
        Scanner sc = new Scanner(System.in);

        nuevoChef.setIdChef(UUID.randomUUID());

        System.out.println("Ingresar nombre: ");
        String nombreChef = sc.nextLine();
        sc.nextLine();
        nuevoChef.setNombre(nombreChef);

        //especialidad

        return nuevoChef;
    }
}
