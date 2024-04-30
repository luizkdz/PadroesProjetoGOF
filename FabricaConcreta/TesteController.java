package FabricaConcreta;

public class TesteController {
    public static void main(String args[]){
        
        AccountController acc = new AccountController();
        acc.criarAccountAdapter("IBM");
        
        acc.criarAccountAdapter("Itautec");

        
        

    }
}
