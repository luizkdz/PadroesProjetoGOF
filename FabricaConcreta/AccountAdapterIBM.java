package FabricaConcreta;

public class AccountAdapterIBM extends AccountAdapter{

    private AccountSystem acs;

    public AccountAdapterIBM(){
        this.acs = new AccountSystem("IBM");
    }
    @Override
    public void finishSale() {
        System.out.println("Terminando venda pelo IBM");
    }

    @Override
    public void regiterTax() {
        System.out.println("Registrando taxa pelo IBM");
    }
}
