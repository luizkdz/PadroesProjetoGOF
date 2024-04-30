package FabricaConcreta;

public class AccountController {
    private AccountAdapter iaa;
    private FabricaConcreta fc;

    public AccountController(){
    System.out.println("Criando controlador de account");        
    fc = FabricaConcreta.getInstance();
}

    public void criarAccountAdapter(String name){
        fc.createAccountAdapter(name);
    }



    




}
