package Adapter;

public class Main {
        public static void main(String args[]){
            Tomada3Pinos tomada3 = new Tomada3Pinos();
            AdaptadorTomada at = new AdaptadorTomada(tomada3);
            at.ligarTomada2Pinos();
        }
}
