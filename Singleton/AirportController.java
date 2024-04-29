package Singleton;

public class AirportController {
    public boolean permitirDecolagem;
    public boolean permitirAterrisagem ;    
    public static AirportController instace = new AirportController();

    public AirportController(){
        permitirDecolagem = true;
        permitirAterrisagem = false;
    }

        public void permitirDecolagem(){
            if(permitirDecolagem){
                System.out.println("Permitindo decolagem");
                permitirDecolagem = false;
                permitirAterrisagem = true;
                
            }
            else{
                System.out.println("Decolagem não permitida");
            }
        }

        public void permitirAterrisagem(){
            if(permitirAterrisagem){
                permitirAterrisagem = false;
                permitirDecolagem = true;
                System.out.println("Permitindo aterrisagem");
            }
            else{
                System.out.println("Aterrisagem não permitida");
            }
        }

        public static AirportController getInstace(){
            
            return instace;
        }




    }
