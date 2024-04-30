import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inmersion en Java\n");
        //System.out.println("Pelicula Matrix");

        int releaseDate = 1999;
        double evaluation = 4.5;
        boolean includedBasePlan = true;

        String name = "Matrix";
        String synopsis = """
                Película de ciencia ficción 
                """;

        double medUserEvaluations = 0;

        System.out.println("Película: " + name);
        System.out.println("Sinopsis: " + synopsis);
        System.out.println("Fecha de lanzamiento: " + releaseDate);
        System.out.println("Evaluación de la critica: " + evaluation);
        System.out.println("Incluido en el plan basico: " + includedBasePlan);

        double medEvaluation = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de " + name + ": " + medEvaluation);

        if (releaseDate > 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la evaluación que le darías a " + name);
            double movieEvaluation = sc.nextDouble();
            medUserEvaluations += movieEvaluation;
        }

        System.out.println("La media de la película calculada por los usuarios es: " + medUserEvaluations / 3);
    }
}