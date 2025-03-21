public class Empleado {
protected String Nombre;
protected int Edad;

    public Empleado() {
    }

    public Empleado(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }

    public void mostrarInfo(){
        System.out.println("El Nombre del empleado es: " + Nombre);
        System.out.println("La edad del empleado es: " + Edad);
    }
}