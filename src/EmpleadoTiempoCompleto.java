public class EmpleadoTiempoCompleto extends Empleado implements Benificable {
    private int antiguedad;
    private String departamento;

    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, int antiguedad, String departamento ){
        super(id, nombre, salarioBase);
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonificaicon();
    }

    @Override
    public double calcularBonificaicon() {
        return salarioBase * 0.10 * antiguedad;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        return calcularSalario() * 0.05 ;
    }
}
