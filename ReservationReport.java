public class ReservationReport {
    
    private Connection connection;
    
    public ReservationReport(Connection c){
        connection = c;
    }

    public void fazendoReserva(){
        connection.connect();
        System.out.println("Fazendo reserva");
    }
}
