public class Materia {
    private String nombre="";
    private int nrc=0;
    private String numHoras="";
    private Profesor profesor1;
    private Profesor profesor2;
    private Profesor profesor3;


    public Materia(){

    }

    public Materia(String nombre, int nrc, String numHoras, Profesor profesor1, Profesor profesor2, Profesor profesor3, Profesor profesor) {
        this.nombre = nombre;
        this.nrc = nrc;
        this.numHoras = numHoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
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
