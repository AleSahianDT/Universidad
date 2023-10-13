import java.util.Scanner;

public class Estudiante {
    private int idBanner=0;
    private int cedula=0;
    private String nombre="";
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;



    public Estudiante(){

    }

    public Estudiante(int idBanner, int cedula, String nombre, Materia materia1, Materia materia2, Materia materia3, Materia materia, Profesor profesor1, Profesor profesor2, Profesor profesor3) {
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
    public void imprimirTodosProfesores(){
        String nomMateria1Profesor1 = materia1.getProfesor1().getNombre();
        System.out.println("El nombre del profesor 1 de la materia: "+materia1.getNombre()+" es: "+nomMateria1Profesor1);
        String nomProfesor2Materia3 = materia3.getProfesor2().getNombre();
        System.out.println("El nombre del profesor 2 de la materia: "+materia3.getNombre()+" es: "+nomProfesor2Materia3);
    }
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: \n");
        String nombre = sc.next();
        System.out.println("Ingrese su numero de cedula: \n");
        int cedula = sc.nextInt();
        System.out.println("Ingrese su ID Banner: \n");
        int idBanner = sc.nextInt();
    }
    public void ingresarMaterias(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Materia 1: \n");
        String materia1 = sc.next();
        System.out.println("Ingrese Materia 2: \n");
        String materia2 = sc.next();
        System.out.println("Ingrese Materia 3: \n");
        String materia3 = sc.next();
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }

    public Profesor getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(Profesor profesor3) {
        this.profesor3 = profesor3;
    }
}
