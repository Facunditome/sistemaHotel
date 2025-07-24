package reservasDeHotel;

public class tests {

    public static void main(String[] args) {

        

        //tests ppersonas
        /* Persona persona1 = new Persona("Juan", "Pérez", "12345678");
        Persona persona2 = new Persona();
        persona2.crearPersona();
        System.out.println("Persona 1: " + persona1.mostrarInfo());
        System.out.println("Persona 2: " + persona2.mostrarInfo());   
        
        // Tests clientes
        Cliente cliente1 = new Cliente("Ana", "Gómez", "87654321", "0800-213", "555-1234");
        Cliente cliente2 = new Cliente();
        cliente2.cargarCliente(); // Asumiendo que este método solicita los datos al usuario
        System.out.println("Cliente 1: " + cliente1.mostrarInfo()); 
        System.out.println("Cliente 2: " + cliente2.mostrarInfo());
        // tests empleados
         Empleado empleado1 = new Empleado("Carlos", "López", "11223344",  "GERENTE" , 1);
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado("María", "Fernández", "99887766", "Desk", 2);
        empleado2.cargarEmpleado(); // Asumiendo que este método solicita los datos al usuario
        System.out.println("Empleado 1: " + empleado1.mostrarInfo());
        System.out.println("Empleado 2: " + empleado2.mostrarInfo()); // RESOLVER PROBLEMA DE CARGA CON LA POSICION
        System.out.println("Empleado 3: " + empleado3.mostrarInfo());
       
        // tests habitaciones
         Habitacion habitacion1 = new Habitacion(101,  100.0, 2);
        habitacion1.cambiarEstado();
        Habitacion habitacion2 = new Habitacion(102, 200.0, 1);
        Habitacion habitacion3 = new Habitacion();
        habitacion3.cargarHabitacion(); // Asumiendo que este método solicita los datos al usuario
        System.out.println("Habitación 1: " + habitacion1.mostrarInfo());
        System.out.println("Habitación 2: " + habitacion2.mostrarInfo());
        System.out.println("Habitación 3: " + habitacion3.mostrarInfo()); 
      // tests habitaciones economicas
              HabitacionEconomica habitacionEco1 = new HabitacionEconomica(201, 80.0, true, false, true );
        habitacionEco1.hacerUpgrade(); // Asumiendo que este método realiza un upgrade a una habitación premium
        HabitacionEconomica habitacionEco2 = new HabitacionEconomica(202, 90.0, false, true, false);
        habitacionEco2.cambiarEstadoCompartida(); // Cambia el estado de la habitación a compartida
        HabitacionEconomica habitacionEco3 = new HabitacionEconomica();
        habitacionEco3.cargarHabitacionEconomica(); // Asumiendo que este método solicita los datos al usuario
        System.out.println("Habitación Económica 1: " + habitacionEco1.mostrarInfo());
        System.out.println("Habitación Económica 2: " + habitacionEco2.mostrarInfo());
        System.out.println("Habitación Económica 3: " + habitacionEco3.mostrarInfo());
        // test habitaciones Premium  
        HabitacionPremium habitacionPrem1 = new HabitacionPremium(301, 150.0, true, true);
        HabitacionPremium habitacionPrem2 = new HabitacionPremium(302, 180.0, false, true);
        HabitacionPremium habitacionPrem3 = new HabitacionPremium();
        habitacionPrem3.cargarHabitacionPremium(); // Asumiendo que este método solicita los datos al usuario
        System.out.println("Habitación Premium 1: " + habitacionPrem1.mostrarInfo());
        System.out.println("Habitación Premium 2: " + habitacionPrem2.mostrarInfo());
        System.out.println("Habitación Premium 3: " + habitacionPrem3.mostrarInfo());
        // test reservas
         /*Reserva reserva1 = new Reserva(1, "01/01/2023", "05/01/2023", 2);
        Reserva reserva2 = new Reserva();
        reserva2.cargarReserva(); // Asumiendo que este método solicita los datos al usuario
        System.out.println("Reserva 1: " + reserva1.mostrarInfo());
        System.out.println("Reserva 2: " + reserva2.mostrarInfo());*/
        // test reservas individuales
        /*ReservaIndividual reservaInd1 = new ReservaIndividual( true, 1, "01/01/2023", "05/01/2023", 2);
        ReservaIndividual reservaInd2 = new ReservaIndividual();
        reservaInd2.cargarReserva(); // Asumiendo que este método solicita los datos al usuario
        reservaInd1.mostrarReserva();
        reservaInd2.mostrarReserva(); */
        // test reservas grupales
       /* ReservaBusiness reservaBus1= new ReservaBusiness("Empresa XYZ", true, 1, "01/01/2023", "05/01/2023", 10);
        ReservaBusiness reservaBus2 = new ReservaBusiness();
        reservaBus2.cargarReserva(); // Asumiendo que este método solicita los datos al usuario
        System.out.println("Reserva Grupal 1: " + reservaBus1.mostrarInfo());
        System.out.println("Reserva Grupal 2: " + reservaBus2.mostrarInfo()); */
}}