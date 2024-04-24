



public class RoomService {
    
    private Connection connection;

    public RoomService(Connection c){
        this.connection = c;
    }

    public void imprimirServico(){
        connection.connect();
        System.out.println("Imprimindo serviço");
    }
}
