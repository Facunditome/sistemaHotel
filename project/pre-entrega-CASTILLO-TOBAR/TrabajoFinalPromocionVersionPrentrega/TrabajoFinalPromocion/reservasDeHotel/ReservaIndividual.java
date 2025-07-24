package reservasDeHotel;

import inAndOut.Salida;
public class ReservaIndividual extends Reserva {
    private boolean piscinaIncluida;
    public int[] numerosUsados = getNumerosUsados();
    public static int cantidadNumerosUsados = getCantidadNumerosUsados();
    // Constructor
    public ReservaIndividual(boolean piscina, int idReserva, String fechaIngreso, String fechaSalida, int cantPersonas) {
        super(idReserva, fechaIngreso, fechaSalida, cantPersonas);
        this.piscinaIncluida = piscina;

    }
    public ReservaIndividual () {
        super();
        this.piscinaIncluida = false; // Por defecto, no hay piscina incluida
    }
    
    // Getters y Setters

    public String getPiscina() {
        return piscinaIncluida ? "Sí" : "No";
    }
    @Override
    public void cargarReserva() {
        Salida.mMensaje("Cargue su reserva individual", "Cargar Reserva Individual");
        super.cargarReserva();
        String datoPiscina = "";
        boolean error = false;
        do {
         datoPiscina =inAndOut.Ingreso.datoString("¿Incluye piscina? (si/no):", "Piscina Incluida", 1);
        if (datoPiscina.equals("si")) {
            error = true;}
        }
        while (!error);
        this.piscinaIncluida = deSiONoABoolean(datoPiscina);
        
    }
    public void mostrarReserva() {
        Salida.mMensaje("Reserva Individual: " +
                "\nID Reserva: " + getIdReserva() +
                "\nFecha Ingreso: " + getFechaIngreso() +
                "\nFecha Salida: " + getFechaSalida() +
                "\nCantidad de Personas: " + getCantPersonas() +
                "\nPiscina Incluida: " + getPiscina(), "Información de Reserva Individual");
    }
    @Override
    public void modificarReserva() {
        Salida.mMensaje("Modifique su reserva individual", "Modificar Reserva Individual");
        super.setIdReserva(inAndOut.Ingreso.datoEntero("Ingrese el nuevo ID de la reserva:", "Nuevo ID Reserva", 1));
        super.setCantPersonas(inAndOut.Ingreso.datoEntero("Ingrese la nueva cantidad de personas:", "Nueva Cantidad de Personas", 1));
        super.setFechaIngreso(inAndOut.Ingreso.datoString("Ingrese la nueva fecha de inicio de la reserva (dd/mm/yyyy):", "Nueva Fecha Inicio", 1));
        super.setFechaSalida(inAndOut.Ingreso.datoString("Ingrese la nueva fecha de fin de la reserva (dd/mm/yyyy):", "Nueva Fecha Fin", 1));
         boolean error = false;
         String datoPiscina = "";
        do { datoPiscina = inAndOut.Ingreso.datoString("¿Incluye piscina? (Si/no):", "Piscina Incluida", 1);
            if (datoPiscina.equals("si")) {
                error = true;}}
        while (!error );

        this.piscinaIncluida = deSiONoABoolean(datoPiscina);
        Salida.mMensaje("Reserva individual modificada exitosamente.", "Modificación Exitosa");
    }
    
    @Override
    public void eliminarReserva() {
        Salida.mMensaje("Elimine su reserva individual", "Eliminar Reserva Individual");
        super.eliminarReserva();
        this.piscinaIncluida = false; // Resetea el estado de la piscina al eliminar la reserva
        
    }
    public boolean deSiONoABoolean(String m) {
        switch (m.toLowerCase()) {
            case "si":
                return true;
            case "no":
                return false;
            default:
                Salida.mError("Entrada inválida. Por favor, ingrese 'si' o 'no'.", "Error de Entrada");
                return false;
        }
    }
}