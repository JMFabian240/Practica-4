public class App {
    public static void main(String[] args) {;

        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("E01","Jose Manuel Hernandez", 3000,15,"Recursos Humanos");
        EmpleadoFreelance empleado2 = new EmpleadoFreelance("E02","Altair Ricaño",180,500);

        System.out.println("Empledo tiempo completo\n");

        empleado1.mostrarInfo();
        System.out.println( "Salario: " + empleado1.calcularSalario() );
        System.out.println( "Bonificacion: " + empleado1.calcularBonificaicon() );
        System.out.println( "Descuento: " + empleado1.aplicarDescuentoSeguro() );
        System.out.println( "Departamneto: " + empleado1.getDepartamento() );
        System.out.println( "Antiguedad: " + empleado1.getAntiguedad() ) ;

        empleado1.setSalarioBase(5000);
        System.out.println("Salario Nuevo: " + empleado1.calcularSalario() + '\n' + '\n');


        System.out.println( "Empledo Freelance\n");

        empleado2.mostrarInfo();
        System.out.println( "Bonificacion: " + empleado2.calcularBonificaicon() );
        System.out.println( "Descuento: " + empleado2.aplicarDescuentoSeguro() );
        System.out.println( "Horas Trabajadas: " + empleado2.getHorasTrabajadas() );
        System.out.println( "Tarifa por hora: " + empleado2.getTarifaHora() ) ;

    }
}
