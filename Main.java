import java.util.Scanner;

public class Main {
 public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    CineControlador cine= new CineControlador(10);
    Boolean valor=false;
    String reporte="";

    while (true) {
        System.out.println("===========Menu Cine===========");
        System.out.println("1. Crear Sala");
        System.out.println("2. Ver salas");
        System.out.println("3. Crear Pelicula");
        System.out.println("4. Ver Cartelera");
        System.out.println("5. Salir");

        Integer opcion=leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("\nIngresa el número de filas de asientos de la nueva sala:");
                Integer filas=leer.nextInt();
                System.out.println("\nIngresa el número asientos por fila de asientos de la nueva sala:");
                Integer num=leer.nextInt();
                System.out.println("Ingresa el tipo de sala:");
                String tipo=leer.next();
                System.out.println("Ingresa el número de sala:");
                Integer numero=leer.nextInt();
                valor=cine.crearSala(filas,num,tipo,numero);
                if(valor){

                    System.out.println("Sala "+numero+" creada!");
                }else{
                    System.out.println("Ya no hay espacio para más salas.");
                }
                break;
            case 2:
                reporte=cine.verSalas();
                System.out.println(reporte);
                break;
            case 3:
                System.out.println("\nIngresa el nombre de la pelicula:");
                String nombre=leer.nextLine();
                System.out.println("Ingresa los actores de la pelicula: ");
                String actores=leer.nextLine();
                System.out.println("Ingresa la clasificacion de la pelicula: ");
                String clasificacion=leer.nextLine();
                System.out.println("Ingresa el director: ");
                String director=leer.nextLine();
                System.out.println("Ingresa la duracion en minutos: ");
                Integer duracion=leer.nextInt();
                valor=cine.crearPelicula(nombre,actores,clasificacion,director,duracion);
                if(valor){

                    System.out.println("Pelicula "+nombre+" creada!");
                }else{
                    System.out.println("Ya no hay espacio para más películas en la cartelera.");
                }
                break;
            case 4:
                reporte=cine.verPeliculas();
                System.out.println(reporte);
                break;
            case 5:
                break;

            default:
                System.out.println("\nIngresa una opción válida");
                break;
        }
        System.out.println("================================");
        if(opcion==5){
            System.out.println("Hasta pronto!");
            break;
        }

    }
 }
}