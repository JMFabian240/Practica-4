public abstract class Empleado {
    protected String name;
    protected  String id;
    protected double salarioBase;

    public Empleado(String name, String id, double salarioBase){
        this.name = name;
        this.id = id;
        this.salarioBase = salarioBase;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setName(String name) {
        this.name = name;
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
