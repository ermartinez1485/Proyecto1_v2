
import clases.Contenedores;
import clases.Estudiante;
import clases.Libro;
import clases.Profesor;
import clases.ReservacionEstudiantes;
import clases.ReservacionProfesores;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eric Martinez Solis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Contenedores contenedores = new Contenedores();
        boolean res = false;
        Profesor elProfe = new Profesor();
        Libro elLibro = new Libro();
        Estudiante elEstu = new Estudiante();
        Integer cod = 0;
        Integer ced = 0;
        Integer numEstu = 0;
        Integer numProfe = 0;
        Integer numLibro = 0;
        Integer numReserEstu = 0;
        Integer numReserProfe = 0;
        boolean bError = true;

        do {
            System.out.println("Qué desea hacer?");
            System.out.println("1) Agregar Estudiante");
            System.out.println("2) Agregar Profesor");
            System.out.println("3) Agregar Libro");
            System.out.println("4) Reservar Libros Estudiante");
            System.out.println("5) Reservar Libros Profesor");
            System.out.println("6) Lista Libros Reservados por Estudiante");
            System.out.println("7) Lista Libros Reservados por Profesor");
            System.out.println("8) Lista de Estudiantes");
            System.out.println("9) Lista de Profesores");
            System.out.println("10) Precio Total de Todos Los Libros Prestados");
            System.out.println("11) Obtener Libro mas Prestado");
            System.out.println("12) Salir");

            try {
                opcion = teclado.nextInt();
                bError = true;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para el menu ");
                teclado.next();
                bError = true;
            }
            teclado.skip("\n");

            switch (opcion) {
                case 1:
                    elEstu = new Estudiante();
                    elEstu.capturaDatos();
                    res = contenedores.agregaEstudiante(elEstu);
                    if (res) {
                        System.out.println("Registro agregado");
                        numEstu++;
                    } else {
                        System.out.println("No se pudo agregar el registro.");
                    }
                    break;
                case 2:
                    elProfe = new Profesor();
                    elProfe.capturaDatos();
                    res = contenedores.agregaProfesor(elProfe);
                    if (res) {
                        System.out.println("Registro agregado");
                        numProfe++;
                    } else {
                        System.out.println("No se pudo agregar el registro.");
                    }
                    break;
                case 3:
                    elLibro = new Libro();
                    elLibro.capturaDatos();
                    res = contenedores.agregaLibro(elLibro);
                    if (res) {
                        System.out.println("Registro agregado");
                        numLibro++;
                    } else {
                        System.out.println("No se pudo agregar el registro.");
                    }
                    break;
                case 4:
                    res = false;
                    //cod = elLibro.capturaCodigo();
                    bError = true;
                    System.out.println("Digite el codigo del Libro:");
                    do {
                        try {
                            cod = teclado.nextInt();
                            bError = false;
                        } catch (NumberFormatException ex) {
                            System.out.println("error" + ex);
                            System.out.println("Escriba un numero valido para el codigo del libro EJ: 40554 ");
                            teclado.next();
                            bError = true;
                        }
                    } while (bError);
                    teclado.skip("\n");

                    //ced = elEstu.capturaCedula();
                    ced = 0;
                    bError = true;
                    teclado = new Scanner(System.in);
                    System.out.println("Digite la cedula del Estudiante:");

                    do {
                        try {
                            ced = teclado.nextInt();
                            bError = false;
                        } catch (InputMismatchException ex) {
                            System.out.println("Escriba un numero valido para la cedula EJ: 112700030 ");
                            teclado.next();
                            bError = true;
                        }
                    } while (bError);

                    teclado.skip("\n");

                    elEstu = contenedores.buscarEstudiante(ced);
                    elLibro = contenedores.buscarLibro(cod);

                    if (elEstu != null && elLibro != null) {
                        res = contenedores.reservarEstudiante(elEstu, elLibro);
                    } else {
                        if (elEstu == null) {
                            System.out.println("Cedula no encontrado, debe de agregar el Estudiante Primero");
                            res = false;
                        } else {
                            // libro es nulo
                            System.out.println("Codigo no encontrado, debe de agregar el libro Primero");
                            res = false;
                        }
                    }
                    if (res) {
                        System.out.println("Registro agregado");
                        numReserEstu++;
                    } else {
                        System.out.println("No se pudo agregar el registro.");
                    }
                    break;
                case 5:
                    res = false;
                    //cod = elLibro.capturaCodigo();
                    cod = 0;
                    bError = true;
                    teclado = new Scanner(System.in);
                    System.out.println("Digite el codigo del Libro:");
                    do {
                        try {
                            cod = teclado.nextInt();
                            bError = false;
                        } catch (NumberFormatException ex) {
                            System.out.println("error" + ex);
                            System.out.println("Escriba un numero valido para el codigo del libro EJ: 40554 ");
                            teclado.next();
                            bError = true;
                        }
                    } while (bError);
                    teclado.skip("\n");

                    //ced = elProfe.capturaCedula
                    bError = true;
                    ced = 0;
                    teclado = new Scanner(System.in);
                    System.out.println("Digite la cedula del Profesor:");
                    do {
                        try {
                            ced = teclado.nextInt();
                            bError = false;
                        } catch (InputMismatchException ex) {
                            System.out.println("Escriba un numero valido para la cedula EJ: 112700030 ");
                            teclado.next();
                            bError = true;
                        }
                    } while (bError);
                    teclado.skip("\n");

                    
                    elProfe = contenedores.buscarProfesor(ced);
                    elLibro = contenedores.buscarLibro(cod);

                    if (elProfe != null && elLibro != null) {
                        res = contenedores.reservarProfesor(elProfe, elLibro);
                    } else {
                        if (elProfe == null) {
                            System.out.println("Cedula no encontrado, debe de agregar el Profesor Primero");
                        } else {
                            // libro es nulo
                            System.out.println("Codigo no encontrado, debe de agregar el libro Primero");
                        }
                    }
                    if (res) {
                        System.out.println("Registro agregado");
                        numReserProfe++;
                    } else {
                        System.out.println("No se pudo agregar el registro.");
                    }
                    break;
                case 6:

                    ReservacionEstudiantes[] listaReserEstu = contenedores.getListaReservaEstu();

                    for (int i = 0; i < numReserEstu; i++) {
                        System.out.println("************Reserva de Libros X Estudiante****************");
                        System.out.println("Estudiante " + listaReserEstu[i].getEstudiante().getNombre());
                        System.out.println("Libro " + listaReserEstu[i].getLibro().getNombre());
                        System.out.println("*******************************************");
                    }

                    break;
                case 7:
                    ReservacionProfesores[] listaReserEProfe = contenedores.getListaReservaProfe();
                    for (int i = 0; i < numReserProfe; i++) {

                        System.out.println("Profe " + listaReserEProfe[i].getProfesor().getNombre());
                        System.out.println("Libro " + listaReserEProfe[i].getLibro().getNombre());
                        System.out.println("*******************************************");
                    }
                    break;
                case 8: //lista de estudiantes

                    Estudiante[] listaEstu = contenedores.getListaEstudiante();
                    System.out.println("Lista de Estudiantes Agregados");
                    for (int i = 0; i < numEstu; i++) {
                        System.out.println(listaEstu[i].getNombre());
                    }
                    break;
                case 9: //lista de profesores

                    Profesor[] listaProfe = contenedores.getListaProfesor();

                    System.out.println("Lista de Profesores Agregados");
                    for (int i = 0; i < numProfe; i++) {
                        System.out.println(listaProfe[i].getNombre());
                    }
                    break;
                case 10: //lista de profesores
                    Double total = 0.0;
                    Libro[] listaLibros = contenedores.getListaLibros();

                    for (int i = 0; i < numLibro; i++) {
                        total += listaLibros[i].getPrecio();
                    }
                    System.out.println("Lista de Libros Agregados y el monto total:");
                    for (int i = 0; i < numLibro; i++) {
                        System.out.println(listaLibros[i].getNombre());
                    }
                    System.out.println("Total: " + total);
                    break;
                case 11: //libro mas prestado

                    String libroMasPrestado = "";
                    ReservacionEstudiantes[] ReservaEstu = contenedores.getListaReservaEstu();
                    libroMasPrestado = contenedores.getLibroMasPrestado(ReservaEstu);

                    System.out.println("El libro mas Prestado es " + libroMasPrestado);

                    break;
                default:
                    System.out.println("OPCION INVALIDA!!!");
                    break;
            }
        } while (opcion != 12);
    }
}
