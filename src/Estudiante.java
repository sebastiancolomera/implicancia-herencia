public class Estudiante extends Persona{
    protected final String nivelAcademico;
    protected final String direccionEscuela;

    public Estudiante(String nombre, String rut, int edad, String nivelAcademico, String direccionEscuela) {
        super(nombre, rut, edad);
        this.nivelAcademico = nivelAcademico;
        this.direccionEscuela = direccionEscuela;
    }

    @Override
    public String toString() {
        return super.toString() + ", nivelAcademico = " + nivelAcademico + ", direccionEscuela = " + direccionEscuela;
    }

    @Override
    public String metodo() {
        return this.getClass().getSimpleName();
    }
}