import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Empleado> lsEmpleado = new ArrayList<>();
        List<Empleado> lsEmpleado1 = new ArrayList<>();
        boolean estado = true;
        int op, op1;

        do {
            System.out.println("""
                    
                    |======================================|
                    |          MENU DE EMPLEADOS           |
                    |======================================|
                    | 📋 - [1] CREAR EMPLEADO PLANTA       |
                    | 📋 - [2] CREAR EMPLEADO HORAS        |
                    | 📜 - [3] VER EMPLEADO                |
                    | 📄 - [4] VER LISTA DE EMPLEADOS      |
                    |======================================|
                    | 🚫 - [5] SALIR DE LA APLICACIÓN      |
                    |======================================|
                    
                    """);
            op = teclado.nextInt();
        teclado.nextLine();

        switch (op){
            case 1 -> {
                System.out.println("EMPLEADO DE PLANTA");
                System.out.println("");
                System.out.print("INGRESE EL NOMBRE DEL EMPLEADO: ");
                String Nombre = teclado.nextLine();

                System.out.println("INGRESE LA EDAD DEL EMPLEADO: ");
                int Edad = teclado.nextInt();

                int Salario = 2100000;


                lsEmpleado.add(new EmpleadoPlanta(Nombre,Edad,Salario));
            }
            case 2 -> {
                System.out.println("EMPLEADO POR HORAS");
                System.out.println("");
                System.out.print("INGRESE EL NOMBRE DEL EMPLEADO: ");
                String Nombre = teclado.nextLine();

                System.out.println("INGRESE LA EDAD DEL EMPLEADO: ");
                int Edad = teclado.nextInt();

                System.out.println("INGRESE LAS HORAS DE TRABAJO: ");
                int Horas = teclado.nextInt();

                double Pago = Horas*98000;

                lsEmpleado1.add(new EmpleadoHoras(Nombre,Edad,Horas,Pago));
            }
            case 3 -> {
                System.out.println("""
                        [1] VER EMPLEADO DE PLANTA
                        [2] VER EMPLEADO POR HORAS
                        """);
                op1 = teclado.nextInt();
                teclado.nextLine();
                switch (op1) {
                    case 1 -> {
                        System.out.print("INGRESE EL NOMBRE DEL EMPLEADO: ");
                        String NombreEmpleado = teclado.nextLine();
                        boolean encontrada = false;

                        for (Empleado cu : lsEmpleado) {
                            if (cu.getNombre().equalsIgnoreCase(NombreEmpleado)) {
                                System.out.println(cu);
                                encontrada = true;

                            }
                        }

                        if (!encontrada) {
                            System.out.println("EMPLEADO NO ENCONTRADO...");
                        }
                    }
                    case 2 -> {
                        System.out.print("INGRESE EL NOMBRE DEL EMPLEADO: ");
                        String NombreEmpleado = teclado.nextLine();
                        boolean encontrada = false;

                        for (Empleado cu : lsEmpleado1) {
                            if (cu.getNombre().equalsIgnoreCase(NombreEmpleado)) {
                                System.out.println(cu);
                                encontrada = true;

                            }
                        }

                        if (!encontrada) {
                            System.out.println("EMPLEADO NO ENCONTRADO...");
                        }
                    }
                }
            }
            case 4 -> {
                System.out.println("""
                        [1] VER LISTA DE EMPLEADOS DE PLANTA
                        [2] VER LISTA DE EMPLEADOS POR HORAS
                        """);
                op1 = teclado.nextInt();
                teclado.nextLine();
                switch (op1){
                    case 1 -> {
                        System.out.println(lsEmpleado);
                    }
                    case 2 -> {
                        System.out.println(lsEmpleado1);
                    }
                }
            }
            case 5 -> {
                estado = false;
                System.out.println("SALIENDO DEL SISTEMA...");

            }
        }

        } while (estado);


    }
}