public class EmpleadoPlanta extends Empleado {
private int Salario;

    public EmpleadoPlanta(String nombre, int edad, int horas, double pago) {
    }

    public EmpleadoPlanta(int salario) {
        Salario = salario;
    }

    public EmpleadoPlanta(String nombre, int edad) {
        super(nombre, edad);
    }

    public EmpleadoPlanta(String nombre, int edad, int salario) {
        super(nombre, edad);
        Salario = salario;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "EmpleadoPlanta{" +
                "Salario=" + Salario +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }

    @Override
    public void mostrarInfo(){
        setSalario(2100000);
        System.out.println("El Nombre del empleado es: " + Nombre);
        System.out.println("La edad del empleado es: " + Edad);
        System.out.println("El Salario del empleado es: " + Salario);
    }

}