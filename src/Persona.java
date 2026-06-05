public abstract class Persona {
    private final String nombre;
    private final String rut;
    private int edad;


    protected Persona(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut  + ", edad=" + edad + '}';
    }

    protected abstract String metodo();
}