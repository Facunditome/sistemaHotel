package reservasDeHotel;
import inAndOut.*;
public class HabitacionEconomica extends Habitacion {
    private boolean desayunoIncluido;
    private boolean servicioALaHabitacion;
    private boolean compartida;

    // Constructor
    public HabitacionEconomica(int numero, double precio, int camas, boolean desayunoIncluido, boolean servicioALaHabitacion, boolean compartida) {
        super(numero, precio, camas);
        this.desayunoIncluido = desayunoIncluido;
        this.servicioALaHabitacion = servicioALaHabitacion;
        this.compartida = compartida;
    }

    public HabitacionEconomica() {
        super();
        this.desayunoIncluido = false; // Por defecto sin desayuno
        this.servicioALaHabitacion = false; // Por defecto sin servicio 
    }

    // Getters y Setters
    public boolean isDesayunoIncluido() { return desayunoIncluido; }
    public void setDesayunoIncluido(boolean desayunoIncluido) { this.desayunoIncluido = desayunoIncluido; }

    public boolean isServicioALaHabitacion() { return servicioALaHabitacion; }
    public void setServicioALaHabitacion(boolean servicioALaHabitacion) { this.servicioALaHabitacion = servicioALaHabitacion; }

    // Mostrar información extendida
    @Override
    public String mostrarInfo() {
        String info = super.mostrarInfo();
        info += "\nDesayuno Incluido: " + (desayunoIncluido ? "Sí" : "No");
        info += "\nServicio a la Habitación: " + (servicioALaHabitacion ? "Sí" : "No");
        info += "\nHabitación Compartida: " + (compartida ? "Sí" : "No");
        return info;
    }
    public boolean esCompartida() {
        return compartida;
    }
    public void cambiarEstadoCompartida(){
        this.compartida = !compartida;
    }
    public void hacerUpgrade() {
        // Lógica para hacer upgrade a una habitación premium
        Salida.mMensaje("La habitación económica ha sido actualizada a una habitación premium.", "Upgrade Realizado");
        this.desayunoIncluido = true; // Asumiendo que el upgrade incluye desayuno
        this.servicioALaHabitacion = true; // Asumiendo que el upgrade incluye servicio a la habitación
        this.compartida = false; // Asumiendo que el upgrade no es compartida   
    }
    @Override
    public void cargarHabitacion() {
        super.cargarHabitacion(); // Llama al método de la superclase para cargar los datos básicos de la habitación
        boolean error = false;
        String datoDesayuno = "";
        String datoServicio = "";
        String datoCompartida = "";
        do {
        datoDesayuno = Ingreso.datoString("¿Incluye desayuno? (si/no):", "Ingreso", 1);
        this.desayunoIncluido = deSiONoABoolean(datoDesayuno);
        datoServicio = Ingreso.datoString("¿Incluye servicio a la habitación? (si/no):", "Ingreso", 1);
        this.servicioALaHabitacion = deSiONoABoolean(datoServicio);
        datoCompartida = Ingreso.datoString("¿Es una habitación compartida? (si/no):", "Ingreso", 1);
        this.compartida = deSiONoABoolean(datoCompartida);

        if (laRespuestaFueSiONo(datoDesayuno) && laRespuestaFueSiONo(datoServicio) && laRespuestaFueSiONo(datoCompartida)) {
            error = true; // Si se cumplen las condiciones, salimos del bucle
        } else {
            Salida.mError("Tenes que responder con si o no querido", "Error de ingreso");
        } 
        }while (!error);
        registrarNumero(getNumero());
    
}

     
}