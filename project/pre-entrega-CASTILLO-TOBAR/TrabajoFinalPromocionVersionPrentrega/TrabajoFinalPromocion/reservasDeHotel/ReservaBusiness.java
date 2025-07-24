package reservasDeHotel;
import inAndOut.Salida;
public class ReservaBusiness extends Reserva {
    private String nombreEmpresa;
    private boolean salaConferencias;
    public int[] numerosUsados = getNumerosUsados();
    public static int cantidadNumerosUsados = getCantidadNumerosUsados();
    
    // Constructor
    public ReservaBusiness(String nombreEmpresa, boolean salaConferencias, int idReserva, String fechaIngreso, String fechaSalida, int cantPersonas) {
        super(idReserva, fechaIngreso, fechaSalida, cantPersonas);
        this.nombreEmpresa = nombreEmpresa;
        this.salaConferencias = salaConferencias;
        this.registrarNumero(idReserva);
    }

    public ReservaBusiness () {
        super();
        this.nombreEmpresa = "";
        this.salaConferencias = false; // Por defecto, no hay sala de conferencias
    }

    // Getters y Setters
    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public boolean getSalaConferencias() { return salaConferencias; }
    public void setsalaConferencias(boolean salaConferencias) { this.salaConferencias = salaConferencias; }

    // Método para mostrar información de la reserva business
    @Override
    public String mostrarInfo() {
        return "Reserva Business: " +
                "\nID Reserva: " + getIdReserva() +
                "\nFecha Ingreso: " + getFechaIngreso() +
                "\nFecha Salida: " + getFechaSalida() +
                "\nCantidad de Personas: " + getCantPersonas() +
                "\nNombre Empresa: " + nombreEmpresa +
                "\nSala Conferencias: " + (salaConferencias ? "Sí" : "No");
    }
    @Override
    public void cargarReserva() {
        Salida.mMensaje("Cargue su reserva business", "Cargar Reserva Business");
        String datoSalaString = "";
        super.cargarReserva();
        this.nombreEmpresa = inAndOut.Ingreso.datoString("Ingrese el nombre de la empresa:", "Nombre Empresa", 1);
        boolean error = false;
        do { datoSalaString = inAndOut.Ingreso.datoString("¿Incluye sala de conferencias? (si/no):", "Sala Conferencias", 1);
            if (datoSalaString.equals("si")){
                error = true;
            }   
    } while(!error);
    this.salaConferencias = deSiONoABoolean(datoSalaString);
        registrarNumero(getIdReserva());
    }
    
    public void registrarNumero(int numero) {
        if (cantidadNumerosUsados < numerosUsados.length) {
            numerosUsados[cantidadNumerosUsados] = numero;
            cantidadNumerosUsados++;
        } else {
            Salida.mError("Límite de reservas alcanzado.", "Error");
        }
    }
    @Override
    public void eliminarReserva() {
        super.eliminarReserva();
        this.nombreEmpresa = "";
        this.salaConferencias = false;
  
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