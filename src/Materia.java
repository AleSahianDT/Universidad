public class Materia {
    private String nombre="";
    private int nrc=0;
    private String numHoras="";
    private String Profesor1="";
    private String Profesor2="";
    private String Profesor3="";

    private Profesor profesor;

    public Materia(){

    }
    public Materia(String nombre, int nrc, String numHoras, String profesor1, String profesor2, String profesor3) {
        this.nombre = nombre;
        this.nrc = nrc;
        this.numHoras = numHoras;
        Profesor1 = profesor1;
        Profesor2 = profesor2;
        Profesor3 = profesor3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public String getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(String numHoras) {
        this.numHoras = numHoras;
    }

    public String getProfesor1() {
        return Profesor1;
    }

    public void setProfesor1(String profesor1) {
        Profesor1 = profesor1;
    }

    public String getProfesor2() {
        return Profesor2;
    }

    public void setProfesor2(String profesor2) {
        Profesor2 = profesor2;
    }

    public String getProfesor3() {
        return Profesor3;
    }

    public void setProfesor3(String profesor3) {
        Profesor3 = profesor3;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
