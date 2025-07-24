package reservasDeHotel;

// COMPLETADO 16/07 SEGÚN DATOS DEL UML--------------------------------------------------------------------
import inAndOut.*;
import javax.swing.JOptionPane;

public class Reserva {
    public static int[] numerosUsados = new int[100];
    public static int cantidadNumerosUsados = 0;
    private Cliente[] cliente;
    private int idReserva;
    private String fechaIngreso;
    private String fechaSalida;
    private int cantPersonas;
    

    // CONSTRUCTORES

    public Reserva(){
        this.idReserva = 0;
        this.fechaIngreso = "";
        this.fechaSalida = "";
        this.cantPersonas = 0;
    }
    
    public Reserva(int idReserva, String fechaIngreso, String fechaSalida, int cantPersonas) {
        this.idReserva= idReserva;
        this.fechaIngreso= fechaIngreso;
        this.fechaSalida= fechaSalida;
        this.cantPersonas= cantPersonas;
        registrarNumero(idReserva);
    }
    
    // MÉTODOS
    private void registrarNumero(int numero) {
        if (cantidadNumerosUsados < numerosUsados.length) {
            numerosUsados[cantidadNumerosUsados] = numero;
            cantidadNumerosUsados++;
        } else {
            Salida.mError("Límite de habitaciones alcanzado.", "Error");
        }
    }
    public String mostrarInfo() {
        return "ID Reserva: " + idReserva + "\n" +
               "Fecha de Ingreso: " + fechaIngreso + "\n" +
               "Fecha de Salida: " + fechaSalida + "\n" +
               "Cantidad de Personas: " + cantPersonas;
    }


// método para cargar datos falta

// GET Y SET 
    public void confirmar () {
        JOptionPane.showMessageDialog(null , "Reserva confirmada");
    }
    public int getIdReserva() {
        return idReserva;
    }
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public int getCantPersonas() {
        return cantPersonas;
    }
    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }
    public static int[] getNumerosUsados() {
        return numerosUsados;
    }
    public static int getCantidadNumerosUsados() {
        return cantidadNumerosUsados;
    }
    // Método 
    public void cargarReserva(){
        // Lógica para cargar una reserva desde un diálogo
        // Aquí podrías implementar la lógica para pedir al usuario los datos necesarios
        // y crear una nueva reserva.
        // Por ejemplo, podrías usar JOptionPane para pedir los datos.
        boolean valido;
        int num;
         do {
            valido = true;
             num = Ingreso.datoEntero("Ingrese el ID de la reserva:", "ID Reserva", 1);
            if (numeroYaUsado(num)) {
                Salida.mError("Ese número de habitación ya está en uso.", "Número duplicado");
                valido = false;
                
            }}
            while (!valido);
        this.idReserva = num;
        registrarNumero(idReserva);
        this.fechaIngreso = Ingreso.datoString("Ingrese la fecha de inicio de la reserva (dd/mm/yyyy):", "Fecha Inicio", 1);
        this.fechaSalida = Ingreso.datoString("Ingrese la fecha de fin de la reserva (dd/mm/yyyy):", "Fecha Fin", 1);
        this.cantPersonas = Ingreso.datoEntero("Ingrese la cantidad de personas:", "Cantidad de Personas", 1);
    }
    private boolean numeroYaUsado(int numero) {
        for (int i = 0; i < cantidadNumerosUsados; i++) {
            if (numerosUsados[i] == numero) {
                return true;
            }
        }
        return false;
        
        }
    public void eliminarReserva() {
        this.idReserva = 0;
        this.fechaIngreso = "";
        this.fechaSalida = "";
        this.cantPersonas = 0;
    }
    public void modificarReserva() {
        this.idReserva = Ingreso.datoEntero("Ingrese el nuevo ID de la reserva:", "Nuevo ID Reserva", 1)   ;
        this.fechaIngreso = Ingreso.datoString("Ingrese la nueva fecha de inicio de la reserva (dd/mm/yyyy):", "Nueva Fecha Inicio", 1);
        this.fechaSalida = Ingreso.datoString("Ingrese la nueva fecha de fin de la reserva (dd/mm/yyyy):", "Nueva Fecha Fin", 1);
        this.cantPersonas = Ingreso.datoEntero("Ingrese la nueva cantidad de personas:", "Nueva Cantidad de Personas", 1);
}
    public Cliente[] getClientes() {
    return this.cliente;
}
}
 




