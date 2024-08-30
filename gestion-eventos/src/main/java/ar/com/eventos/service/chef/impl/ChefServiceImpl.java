package ar.com.eventos.service.chef.impl;

import ar.com.eventos.domain.Chef;
import ar.com.eventos.enumeration.EspecialidadEnum;
import ar.com.eventos.enumeration.InteresCulinarioEnum;
import ar.com.eventos.service.chef.ChefService;

import java.util.Scanner;
import java.util.UUID;

public class ChefServiceImpl implements ChefService {

    Chef chefs;

    public ChefServiceImpl(Chef chefs) {
        this.chefs = chefs;
    }

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
        System.out.println("Ingrese su interes culinario: ");
        System.out.println("1. Internacional");
        System.out.println("2. Pasteleria");

        int especialidad = sc.nextInt();
        sc.nextLine();

        nuevoChef.setEspecialidad(
                switch (especialidad){
                    case 1 -> EspecialidadEnum.INTERNACIONAL;
                    case 2 -> EspecialidadEnum.PASTELERIA;
                    default -> null;
                }
        );

        chefs.getChefts().add(nuevoChef);
        return nuevoChef;
    }
}
