import java.util.Scanner;

public class Estudiante {
    private int idBanner=0;
    private int cedula=0;
    private String nombre="";
    private String materia1="";
    private String materia2="";
    private String materia3="";

    private Materia materia;
    private Profesor profesor;

    public Estudiante(){

    }

    public Estudiante(int idBanner, int cedula, String nombre, String materia1, String materia2, String materia3) {
        this.idBanner = idBanner;
        this.cedula = cedula;
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }
    public void imprimirMaterias(){
        System.out.println("La materia 1 es: \n"+materia1);
        System.out.println("La materia 2 es: \n"+materia2);
        System.out.println("La materia 3 es: \n"+materia3);
    }
    public void imprimirProfesores(){
        System.out.println("El Profesor 1 es: \n"+Profesor1);
        System.out.println("El Profesor 2 es: \n"+Profesor2);
        System.out.println("El Profesor 3 es: \n"+Profesor3);
    }
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: \n");
        String nombre = sc.next();
    }
}
