package FabricaConcreta;

public class FabricaConcreta {

    private AccountAdapter aa;
    private static FabricaConcreta instance = new FabricaConcreta();
    
    private FabricaConcreta(){

    }

    public static FabricaConcreta getInstance(){
        return instance;
    }
    public void createAccountAdapter(String name){
        if(name.equals("IBM")){
            System.out.println("Criando adaptador IBM");
            aa = new AccountAdapterIBM();
            aa.finishSale();
            aa.regiterTax();

            
        }
        else if (name.equals("Itautec")){
            System.out.println("Criando adaptador itautec");
            aa = new AccountAdapterItautec();
            aa.finishSale();
            aa.regiterTax();
        }
    }
}
