package Singleton;

public class TesteAirport {
        public static void main(String args[]){
            AirportController ap = AirportController.getInstace();
            AirportController ap2 = AirportController.getInstace();

            ap.permitirDecolagem();
            ap2.permitirDecolagem();

            ap.permitirAterrisagem();
            ap2.permitirAterrisagem();
        }
}
