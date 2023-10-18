public class Main {
    public static void main(String[] args) {

        // Creamos un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante();
        Materia materia = new Materia();

        estudiante.ingresarDatos();

        materia.ingresarDatos(1);
        materia.ingresarDatos(2);
        materia.ingresarDatos(3);

        materia.ingresarProfesor(1);
        materia.ingresarProfesor(2);
        materia.ingresarProfesor(3);

        estudiante.imprimirMaterias();
        estudiante.imprimirTodosProfesores();
    }
}