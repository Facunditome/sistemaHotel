package reservasDeHotel;
import inAndOut.*;

// Clase Cliente ESTA COMO SUBCLASE de PERSONA----------------------------------------------
class Cliente extends Persona {
    private String telefono;
    private String email;

    // Constructor
    public Cliente(String nombre, String apellido, String dni, String telefono, String email) {
        super(nombre, apellido, dni);
        this.telefono = telefono;
        this.email = email;
    }
    
    public Cliente() {
        super();
        this.telefono = "";
        this.email = "";
    }

    // Getters y Setters
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Implementación del método abstracto
    @Override
    public String mostrarInfo() {
        return "Cliente: " + getNombre() + " " + getApellido() +
               "\nDNI: " + getDni() +
               "\nTeléfono: " + telefono +
               "\nEmail: " + email;
    }
    @Override
    public void cargarInfo() {
        super.cargarInfo(); // Llama al método de la superclase para crear una Persona
        this.telefono = Ingreso.datoString("Ingrese el teléfono", "Ingreso", 2);
        this.email = Ingreso.datoString("Ingrese el email", "Ingreso", 2);
    }

}


