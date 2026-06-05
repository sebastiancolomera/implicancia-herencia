public class EjemploHerencia {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Pedro", "98765432-1", 22, "Universitario", "Av. Siempre Viva 456");
        System.out.println(estudiante);
        System.out.println(estudiante.toString());
        System.out.println(estudiante.metodo());

        EstudianteDeportista estudianteDeportista = new EstudianteDeportista("Juan", "12345678-9", 20, "Universitario", "Av. Siempre Viva 123", "Fútbol", 10);
        System.out.println(estudianteDeportista);
        System.out.println(estudianteDeportista.toString());
        System.out.println(estudianteDeportista.metodo());
    }
}