package reservasDeHotel;
import inAndOut.Ingreso;
import javax.swing.JOptionPane;
// Clase abstracta Persona
public class Persona {
    private String nombre;
    private String apellido;
    private String dni; //Elegimos string para simplificar visto que el DNI tiene puntos y en caso de reutilizarlo en otros países puede tener letras"

    // Constructor
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    // Método abstracto
    public String mostrarInfo(){
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni;
    };
    // Método para crear Persona por diálogo (devuelve persona)
    public void cargarInfo() {
        this.nombre = Ingreso.datoString("Ingrese el nombre:", "Ingreso", JOptionPane.QUESTION_MESSAGE);
        this.apellido = Ingreso.datoString("Ingrese el apellido", "Ingreso", JOptionPane.QUESTION_MESSAGE);
        this.dni = Ingreso.datoString("Ingrese el DNI:", "Ingreso", JOptionPane.QUESTION_MESSAGE);
    }

    
}

