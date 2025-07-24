package reservasDeHotel;
import inAndOut.*;
import javax.swing.JOptionPane;
public class Empleado extends Persona{

    private int numeroEmpleado;

    // Constructor
    public Empleado(String nombre, String apellido, String dni, String cargo, int numeroEmpleado) {
        super(nombre, apellido, dni);
    
        this.numeroEmpleado = numeroEmpleado;
        
    }

    public Empleado() {
         super("", "", ""); // Llama al constructor de Persona con valores vacíos
         this.numeroEmpleado = 0;
    }

    // Getters y Setters


    public double getNroEmpleado() { return numeroEmpleado; }
    public void setNroEmpleado(int numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }

    @Override
    public String mostrarInfo() {
        return "Empleado: " + getNombre() + "\nApellido: " + getApellido() +
               "\nDNI: " + getDni() +
                "\nNumeroEmpleado: " + numeroEmpleado;
    }
    @Override
    public void cargarInfo() {
        super.cargarInfo(); // Llama al método de la superclase para crear una Persona
        this.numeroEmpleado = Ingreso.datoEntero("Ingrese el número de empleado:", "Ingreso", JOptionPane.QUESTION_MESSAGE);
    }
}