package reservasDeHotel;
import inAndOut.*;
public class HabitacionPremium extends Habitacion {
    private boolean desayunoIncluido;
    private boolean servicioALaHabitacion;

    // Constructor
    public HabitacionPremium(int numero, double precio, int camas, boolean desayunoIncluido, boolean servicioALaHabitacion) {
        super(numero, precio, camas);
        this.desayunoIncluido = desayunoIncluido;
        this.servicioALaHabitacion = servicioALaHabitacion;
    }

    public HabitacionPremium() {
        super();
        this.desayunoIncluido = false; // Por defecto viene CON desayuno
        this.servicioALaHabitacion = false; // Por defecto viene CON servicio 
    }

    // Getters y Setters
    public boolean haydesayunoIncluido() { return desayunoIncluido; }
    public void ponerDesayunoIncluido(boolean desayunoIncluido) { this.desayunoIncluido = desayunoIncluido; }

    public boolean hayservicioALaHabitacion() { return servicioALaHabitacion; }
    public void ponerServicioALaHabitacion(boolean servicioALaHabitacion) { this.servicioALaHabitacion = servicioALaHabitacion; }

    // Mostrar información extendida
    @Override
    public String mostrarInfo() {
        String info = super.mostrarInfo();
        info += "\nJacuzzi: " + (desayunoIncluido ? "Sí" : "No");
        info += "\nVista al Mar: " + (servicioALaHabitacion ? "Sí" : "No");
        return info;
    }
    @Override
    public void cargarHabitacion() {
        super.cargarHabitacion(); // Llama al método de la superclase para cargar los datos básicos de la habitación
        boolean error = false;
        String datoDesayuno = "";
        String datoServicio = "";
        do{
        datoDesayuno = Ingreso.datoString("¿Incluye desayuno? (si/no):", "Ingreso", 1);
        this.desayunoIncluido =deSiONoABoolean(datoDesayuno);     
        datoServicio = Ingreso.datoString("¿Incluye servicio a la habitación? (si/no):", "Ingreso", 1);
        this.servicioALaHabitacion = deSiONoABoolean(datoServicio);
        if (laRespuestaFueSiONo(datoDesayuno) && laRespuestaFueSiONo(datoServicio)) {
            error = true; // Si se cumplen las condiciones, salimos del bucle
        } else {
            Salida.mError("Responde con si o no querido", "Error de ingreso");
        }} while(!error);
    }
}