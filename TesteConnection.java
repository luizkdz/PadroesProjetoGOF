public class TesteConnection {
    public static void main(String args[]){
        
        RoomService rs = new RoomService(new MySqlConnection());
        rs.imprimirServico();
        ReservationReport rr = new ReservationReport(new SQLServerConnection());
        rr.fazendoReserva();
       

        
    }
}
