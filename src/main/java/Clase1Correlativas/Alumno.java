package Clase1Correlativas;

public class Alumno {
    String nombre;
    String apellido;
    List<Materia>matAprobada ;


    public Alumno() {

    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matAprobada = new ArrayList<> (  );
    }

    public String nombre() {
        return nombre;
    }

    public Alumno setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String apellido() {
        return apellido;
    }

    public Alumno setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }



    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matAprobada=" + matAprobada +
                '}';
    }
}







