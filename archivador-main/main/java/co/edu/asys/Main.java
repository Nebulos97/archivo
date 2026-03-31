package org.example;

import co.edu.asys.entidades.Genero;
import co.edu.asys.entidades.Persona;
import co.edu.asys.entidades.TipoDocumento;
import co.edu.asys.persistencia.Archivo;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Archivo archivo = new Archivo();

        while (true) {

            Scanner sc = new Scanner(System.in);


            System.out.println("\n===== MENU =====");
            System.out.println("1. Guardar persona");
            System.out.println("2. Guardar empresa");
            System.out.println("3. Buscar persona");
            System.out.println("4. Buscar empresa");
            System.out.println("5. Eliminar persona");
            System.out.println("6. Eliminar empresa");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion;

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Opcion invalida\n");
                continue;
            }

            try {

                switch (opcion) {

                    case 1:
                        // GUARDAR
                        System.out.print("Ingrese el nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Ingrese el apellido: ");
                        String apellido = sc.nextLine();

                        System.out.print("Ingrese la edad: ");
                        int edad = Integer.parseInt(sc.nextLine());

                        System.out.print("Ingrese el telefono: ");
                        String telefono = sc.nextLine();

                        System.out.print("Ingrese el tipo de documento (CC/TI/PASAPORTE): ");
                        TipoDocumento tipoDocumento = TipoDocumento.valueOf(sc.nextLine().toUpperCase());

                        System.out.print("Ingrese numero de documento: ");
                        String numeroDocumento = sc.nextLine();

                        System.out.print("Ingrese genero (MASCULINO/FEMENINO): ");
                        Genero genero = Genero.valueOf(sc.nextLine().toUpperCase());

                        Persona p = new Persona(nombre, apellido, edad, telefono, tipoDocumento, numeroDocumento, genero);

                        break;

                    case 2:
                        // GUARDAR EMPRESA
                        System.out.print("Ingrese el NIT: ");
                        String nit = sc.nextLine();

                        System.out.print("Ingrese el nombre de la empresa: ");
                        String nombreEmpresa = sc.nextLine();

                        System.out.print("Ingrese la dirección: ");
                        String direccion = sc.nextLine();

                        System.out.print("Ingrese el tipo de empresa (SAS/LTDA/SA/EIRL/S_EN_C/S_EN_C_POR_A): ");
                        co.edu.asys.entidades.TipoEmpresa tipoEmpresa = co.edu.asys.entidades.TipoEmpresa.valueOf(sc.nextLine().toUpperCase());

                        co.edu.asys.entidades.Empresa empresa = new co.edu.asys.entidades.Empresa(nit, nombreEmpresa, direccion, tipoEmpresa);

                        break;

                    case 3:
                        // BUSCAR
                        System.out.print("Ingrese nombre o documento a buscar: ");
                        String datoBuscar = sc.nextLine();

                        Persona pBuscar = new Persona(
                                datoBuscar, "", 1, "", TipoDocumento.CC, datoBuscar, Genero.MASCULINO
                        );

                        break;

                    case 4:
                        // BUSCAR EMPRESA
                        System.out.print("Ingrese NIT o nombre de la empresa: ");
                        String datoBuscarEmpresa = sc.nextLine();

                        co.edu.asys.entidades.Empresa eBuscar = new co.edu.asys.entidades.Empresa(
                                datoBuscarEmpresa, // nit (o referencia)
                                datoBuscarEmpresa, // nombre (también lo usamos para buscar)
                                "",
                                co.edu.asys.entidades.TipoEmpresa.SAS // valor temporal (no afecta la búsqueda)
                        );

                        break;

                    case 5:
                        // ELIMINAR
                        System.out.print("Ingrese numero de documento a eliminar: ");
                        String docEliminar = sc.nextLine();

                        Persona pEliminar = new Persona(
                                "", "", 1, "", TipoDocumento.CC, docEliminar, Genero.MASCULINO
                        );
                        break;

                    case 6:
                        // ELIMINAR EMPRESA
                        System.out.print("Ingrese el NIT de la empresa a eliminar: ");
                        String nitEliminar = sc.nextLine();

                        co.edu.asys.entidades.Empresa eEliminar = new co.edu.asys.entidades.Empresa(
                                nitEliminar,
                                "",
                                "",
                                co.edu.asys.entidades.TipoEmpresa.SAS // valor temporal
                        );

                        break;


                    case 7:
                        System.out.println("Programa finalizado.");
                        return;

                    default:
                        System.out.println("Opcion no valida");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: valor invalido (ENUM o numero)");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}