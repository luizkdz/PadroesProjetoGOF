package FabricaConcreta;

public class AccountAdapterItautec extends AccountAdapter {
    private AccountSystem accountSystem;



    public AccountAdapterItautec(){
        accountSystem = new AccountSystem("Itautec");
        }
    @Override
    public void finishSale() {
        System.out.println("Terminando venda pelo Itautec");
    }

    @Override
    public void regiterTax() {
        System.out.println("Registrando taxa pelo ItauTec");
    }
    
}
