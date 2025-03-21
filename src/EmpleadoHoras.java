public class EmpleadoHoras extends Empleado {
    private int Horas;
    private double Pago;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(int horas, double pago) {
        Horas = horas;
        Pago = pago;
    }

    public EmpleadoHoras(String nombre, int edad) {
        super(nombre, edad);
    }

    public EmpleadoHoras(String nombre, int edad, int horas, double pago) {
        super(nombre, edad);
        Horas = horas;
        Pago = pago;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int horas) {
        Horas = horas;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(double pago) {
        Pago = pago;
    }

    @Override
    public String toString() {
        return "EmpleadoHoras{" +
                "Horas=" + Horas +
                ", Pago=" + Pago +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }

    @Override
    public void mostrarInfo(){
        setPago(98000);
        System.out.println("El Nombre del empleado es: " + Nombre);
        System.out.println("La edad del empleado es: " + Edad);
        System.out.println("Las horas de trabajo son: " + Horas);
        System.out.println("El pago del empleado es: " + Horas*Pago);
    }
}