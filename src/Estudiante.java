import java.util.Scanner;

public class Estudiante {
    private int idBanner;
    private int cedula;
    private String nombre;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public Estudiante() {
        // Constructor vacío
    }

    public Estudiante(int idBanner, int cedula, String nombre, Materia materia1, Materia materia2, Materia materia3) {
        this.idBanner = idBanner;
        this.cedula = cedula;
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public void imprimirMaterias() {
        System.out.println("La materia 1 es: " + materia1.getNombre() + "y el NRC es: " + materia1.getNrc());
        System.out.println("La materia 2 es: " + materia2.getNombre() + "y el NRC es: " + materia2.getNrc());
        System.out.println("La materia 3 es: " + materia3.getNombre() + "y el NRC es: " + materia3.getNrc());
    }

    public void ingresarMaterias() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese datos para la Materia 1:");
        Materia materia1 = ingresarMateria(sc, 1);
        System.out.println("Ingrese datos para la Materia 2:");
        Materia materia2 = ingresarMateria(sc, 2);
        System.out.println("Ingrese datos para la Materia 3:");
        Materia materia3 = ingresarMateria(sc, 3);

        setMateria1(materia1);
        setMateria2(materia2);
        setMateria3(materia3);
    }


    private Materia ingresarMateria(Scanner sc, int i) {
        System.out.println("Ingrese nombre de la materia " +i);
        String nombreMateria = sc.next();
        System.out.println("Ingrese el NRC de la materia " +i);
        int nrc = sc.nextInt();
        System.out.println("Ingrese el número de horas de la materia " +i);
        String numHoras = sc.next();

        Profesor profesor1 = ingresarProfesor(sc, 1);
        Profesor profesor2 = ingresarProfesor(sc, 2);
        Profesor profesor3 = ingresarProfesor(sc, 3);

        Materia materia = new Materia(nombreMateria, nrc, numHoras, profesor1, profesor2, profesor3);
        return materia;
    }

    private Profesor ingresarProfesor(Scanner sc, int i) {
        System.out.println("Ingrese nombre del Profesor " + i + ":");
        String nombreProfesor = sc.next();
        System.out.println("Ingrese la cédula del Profesor " + i + ":");
        int cedula = sc.nextInt();
        System.out.println("Ingrese el ID del Profesor " + i + ":");
        int idProfesor = sc.nextInt();

        Profesor profesor = new Profesor(nombreProfesor, cedula, idProfesor);
        return profesor;
    }

    public void imprimirTodosProfesores() {
        String nomMateria1Profesor1 = materia1.getProfesor1().getNombre();
        System.out.println("El nombre del profesor 1 de la materia " + materia1.getNombre() + " es: " + nomMateria1Profesor1);
        String nomMateria2Profesor2 = materia2.getProfesor2().getNombre();
        System.out.println("El nombre del profesor 2 de la materia " + materia2.getNombre() + " es: " + nomMateria2Profesor2);
        String nomMateria3Profesor3 = materia3.getProfesor3().getNombre();
        System.out.println("El nombre del profesor 3 de la materia " + materia3.getNombre() + " es: " + nomMateria3Profesor3);
    }

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        this.nombre = sc.next();
        System.out.println("Ingrese su numero de cedula:");
        this.cedula = sc.nextInt();
        System.out.println("Ingrese su ID Banner:");
        this.idBanner = sc.nextInt();
    }

    public int getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(int idBanner) {
        this.idBanner = idBanner;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }
}
