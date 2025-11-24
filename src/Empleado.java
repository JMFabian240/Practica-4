public abstract class Empleado {
    protected String nombre;
    protected  String id;
    protected double salarioBase;

    public Empleado(String nombre, String id, double salarioBase){
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getName() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public void  mostrarInfo(){
        System.out.println( "ID: " + getId() );
        System.out.println( "Nombre: " + getName());
        System.out.println( "Salario Base: " + getSalarioBase());
    }
}
