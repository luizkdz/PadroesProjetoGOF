package Adapter;

public class AdaptadorTomada {
    private Tomada3Pinos tomada3;

    AdaptadorTomada(Tomada3Pinos tomada3e){
        this.tomada3 = tomada3e;
    }

    public void ligarTomada2Pinos(){
        tomada3.ligarTomada3Pinos();
    }
}
