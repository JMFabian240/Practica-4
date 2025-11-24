public  class EmpleadoFreelance extends Empleado implements Benificable{

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String id, String nombre, int horasTrabajadas, double tarifaHora){
        super(id, nombre);
        this.id = id;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public  void setHorasTrabajdas (int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }


    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return (horasTrabajadas * tarifaHora) + calcularBonificaicon();
    }

    @Override
    public double calcularBonificaicon() {
        if (horasTrabajadas > 160)
            return calcularSalario() * 0.05;
        else return 0;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        return calcularSalario() * 0.03;
    }
}
