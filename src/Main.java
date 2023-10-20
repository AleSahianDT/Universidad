import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        estudiante.ingresarDatos();
        estudiante.ingresarMaterias();

        System.out.println("El nombre del estudiante es: " + estudiante.getNombre());
        System.out.println("La cédula del estudiante es: " + estudiante.getCedula());
        System.out.println("El ID Banner del estudiante es: " + estudiante.getIdBanner());

        estudiante.imprimirMaterias();
        estudiante.imprimirTodosProfesores();

    }
}

