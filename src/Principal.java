import clases.Contenedores;
import clases.Estudiante;
import clases.Libro;
import clases.Profesor;
import clases.ReservacionEstudiantes;
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
        
        int opcion;
        Scanner teclado = new Scanner(System.in);
        Contenedores contenedores = new Contenedores();
        boolean res = false;
        Profesor elProfe = new Profesor();
        Libro elLibro = new Libro();
        ReservacionEstudiantes reserv = new ReservacionEstudiantes();
        Estudiante elEstu = new Estudiante();
        Integer cod = 0;
        Integer ced = 0;
        Integer numEstu = 0;
        Integer numProfe = 0;
        Integer numLibro =0;
        
        
        do{
            System.out.println("Qué desea hacer?");
            System.out.println("1) Agregar Estudiante");
            System.out.println("2) Agregar Profesor");
            System.out.println("3) Agregar Libro");
            System.out.println("4) Reservar Libros Estudiante");
            System.out.println("5) Reservar Libros Profesor");
            System.out.println("6) Lista Libros Estudiante");
            System.out.println("7) Lista de Estudiantes");
            System.out.println("8) Lista de Profesores");
            System.out.println("9) Lista de Libros");         
            System.out.println("10) Salir");
            opcion = teclado.nextInt();
            teclado.skip("\n");
            
            switch(opcion){
                case 1: 
                    
                    elEstu.capturaDatos();
                    res = contenedores.agregaEstudiante(elEstu);
                    if(res){
                        System.out.println("Registro agregado");
                        numEstu++;
                    }else{
                        System.out.println("No se pudo agregar el registro.");
                    }                  
                    
                    break;
                    
                case 2:                                   
                    elProfe.capturaDatos();
                    res = contenedores.agregaProfesor(elProfe);
                    if(res){
                        System.out.println("Registro agregado");
                        numProfe++;
                    }else{
                        System.out.println("No se pudo agregar el registro.");
                    }
                    break;
                    
                case 3:                  
                    elLibro.capturaDatos();
                    res = contenedores.agregaLibro(elLibro);
                    if(res){
                        System.out.println("Registro agregado");
                        numLibro++;
                    }else{
                        System.out.println("No se pudo agregar el registro.");
                    }                                      
                    break;
                    
                case 4:
                    
                    cod = elLibro.capturaCodigo();
                    ced = elEstu.capturaCedula();
                    
                    elEstu = contenedores.buscarEstudiante(ced);                  
                    elLibro = contenedores.buscarLibro(cod);
                                                           
                    if(elEstu != null && elLibro != null){
                        res = contenedores.reservarEstudiante(elEstu, elLibro);            
                    }else{
                        if(elEstu == null){
                           System.out.println("Cedula no encontrado, debe de agregar el Estudiante Primero"); 
                           res = false;
                        }
                        else{
                            // libro es nulo
                            System.out.println("Codigo no encontrado, debe de agregar el libro Primero");
                            res = false;
                        }                       
                    }
                                 
                    if(res){
                        System.out.println("Registro agregado");
                    }else{
                        System.out.println("No se pudo agregar el registro.");
                    }             
                                     
                    break;
                    
                case 5:
                                      
                    /*System.out.println("Digite el codigo del Libro:");
                    cod = teclado.nextInt();
                    teclado.skip("\n");
                    */
                    
                    cod = elLibro.capturaCodigo();
                    
                    System.out.println("Digite la cedula del Profesor:");
                    ced = teclado.nextInt();
                    teclado.skip("\n");
                    
                    elProfe = contenedores.buscarProfesor(ced);
                    elLibro = contenedores.buscarLibro(cod);            
                                                           
                    if(elProfe != null && elLibro != null){
                        res = contenedores.reservarEstudiante(elEstu, elLibro);            
                    }else{
                        if(elProfe == null){
                           System.out.println("Cedula no encontrado, debe de agregar el Profesor Primero"); 
                        }
                        else{
                            // libro es nulo
                            System.out.println("Codigo no encontrado, debe de agregar el libro Primero");                           
                        }                       
                    }
                                 
                    if(res){
                        System.out.println("Registro agregado");
                    }else{
                        System.out.println("No se pudo agregar el registro.");
                    }             
                    
                    break;
                
                case 6:
                    
                    ReservacionEstudiantes[] listaReserEstu = contenedores.getListaReservaEstu();
                    
                    for (int i = 0; i < numEstu; i++) {
                                 
                        System.out.println("Estudiante " + listaReserEstu[i].getEstudiante().getNombre());
                        System.out.println("Libro " + listaReserEstu[i].getLibro().getNombre()); 
                        System.out.println("*******************************************");
                    }
                    
                     break;
                    
                case 7:
                    
                    Estudiante[] listaEstu = contenedores.getListaEstudiante();
                    
                    for (int i = 0; i < numEstu; i++) {
                              
                        System.out.println("Lista de Estudiantes Agregados " + listaEstu[i].getNombre());                     
                    }
                   
                     break;                       
                default:
                    System.out.println("OPCION INVALIDA!!!");
                    break;
            }
        }while(opcion != 10);           
    }
    
}
