import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void mostrarElMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 9){
            String menu = """
                    *************** Bienvenido(a) a ScreenMatch ***************
                    1) Registrar nueva película
                    2) Series
                    3) Calcular maratón de películas
                    
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula");
                    String nombrePelicula = sc.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la pelicula");
                    int fechaDeLanzamientoPelicula = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el tiempo de duración en minutos");
                    int tiempoDeDuracionPelicula = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la sinopsis de la película");
                    String sinopsisPelicula = sc.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombrePelicula);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamientoPelicula);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(tiempoDeDuracionPelicula);
                    peliculaUsuario.setSinopsis(sinopsisPelicula);

                    peliculaUsuario.mostrarFichaTecnica();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = sc.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el tiempo de duración en minutos de los capitulos");
                    int tiempoDeDuracionCapitulosSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la cantidad de capitulos por temporada");
                    int capitulosSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la cantidad de temporadas");
                    int temporadasSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la sinopsis de la serie");
                    String sinopsisSerie = sc.nextLine();
                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setEpisodiosPorTemporada(capitulosSerie);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(tiempoDeDuracionCapitulosSerie);
                    serieUsuario.setTemporada(temporadasSerie);
                    serieUsuario.setSinopsis(sinopsisSerie);

                    serieUsuario.mostrarFichaTecnica();
                    break;

                case 3:
                    System.out.println("¿Cuantas peliculas vas a ver en tú maratón?");
                    int cantTitulos = sc.nextInt();
                    sc.nextLine();
                    Pelicula[] maraton = new Pelicula[cantTitulos];
                    int duracionMaraton = 0;
                    System.out.println("*******************************");
                    for (int i = 0; i < cantTitulos; i++) {
                        maraton[i] = new Pelicula();
                        System.out.println("Ingrese nombre de la película " + (i+1));
                        String nombrePeliculaMaraton = sc.next();
                        maraton[i].setNombre(nombrePeliculaMaraton);
                        System.out.println("Ingrese duración en minutos de la película "  + (i+1));
                        int duracion = sc.nextInt();
                        sc.nextLine();
                        maraton[i].setTiempoDeDuracionEnMinutos(duracion);

                        duracionMaraton += maraton[i].getTiempoDeDuracionEnMinutos();
                        System.out.println("Pelicula: " + maraton[i].getNombre() + "\nDuración en minutos: " + maraton[i].getTiempoDeDuracionEnMinutos());
                    }
                    System.out.println("Tu maratón durará " + duracionMaraton + " minutos\n");
                    break;

                case 9:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
